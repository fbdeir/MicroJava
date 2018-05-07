import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.lang.reflect.Array;
import java.util.*;

public class QuadrupleVisitor extends grmBaseVisitor<Void> {
    grmLexer lexer;
    grmParser parser;
    String _temp_count=(String.format("%04d", 0));
    int tempct=0;
    String _lbl_count=(String.format("%04d", 0));
    int localCount=0;
    SymbolHashTable symbolTable;
    int childCount=0;
    int tabs=0;
    String elselbl="";
    String fallthroughlbl="";
    Stack<String> whilelbl=new Stack<>();
    Stack<String> endWhilelbl=new Stack<>();
    int isEquals=0;
    int endIf=0;
    int endElse=0;
    int isFound=0;
    String middle1="";
    String middle2="";
    String mainLabel="";
    String condition="";
    int isBgt=0;
    QuadWriter quads=new QuadWriter();
    int cCount=0;
    int iCount=0;
    int islt=0;
    Stack<String> currentMethod=new Stack<>();
    String exValue="";
    ArrayList<SymbolTableNode> methods=new ArrayList<>();
    public  void setLexer(grmLexer l){
        this.lexer=l;
    }
    TACWriter tac=new TACWriter();

    public void setSymbolTable(SymbolHashTable symbolHashTable) {
        this.symbolTable = symbolHashTable;
    }
    public void incrementTemp(){
        int temp=Integer.parseInt(_temp_count);
        temp++;
        _temp_count=String.format("%04d", temp);
        tempct++;
    }

    public void incrementLablel(){
        int temp=Integer.parseInt(_lbl_count);
        temp++;
        _lbl_count=String.format("%04d", temp);
    }
    public String checkType(String x){
        try{
            Integer.parseInt(x);
            return "int";
        }catch(NumberFormatException e){
            if(x.length()>0 && x.charAt(0)=='\''){
                return "char";
            }else{
                return "variable";
            }
        }
    }

    public  void setParser(grmParser l){
        this.parser=l;
    }
    public SymbolTableNode checkNode(String name){
        SymbolTableNode n=null;
        // for(Integer temp: set) {
        try {
            n = (SymbolTableNode) symbolTable.get(name);
            if (n != null)
                return n;
        }catch(NullPointerException e){

        }

        return n;

    }

    @Override
    public Void visitActPars(grmParser.ActParsContext ctx) {
        String methodName=ctx.parent.getChild(0).getText();
        String params=ctx.parent.getChild(1).getText();
        params=params.substring(1);
        params=params.substring(0,params.length()-1);
        System.out.println(params);

        for (SymbolTableNode n:methods) {
            if(n.name.equals(methodName)&& !methodName.equals("chr")){
                for(int i=0; i<n.parameters.size(); i++){
                    String par=n.parameters.get(i);
                    if(params.contains(","))
                        quads.write("li "+n.parameters.get(i)+", "+params.substring(0, params.indexOf(",")));
                    else
                        quads.write("li "+n.parameters.get(i)+", "+params);
                        if(params.contains(","))
                        params=params.substring(params.indexOf(",")+1);

                }
                quads.write("jal "+n.tempType);
            }
        }

        return super.visitActPars(ctx);
    }

    @Override
    public Void visitMethodDecl(grmParser.MethodDeclContext ctx) {
        //for tac
        if(localCount>0) {
            tac.write("LOCALS " + localCount);
            localCount = 0;
        }
        if(ctx.getChild(1).getText().equals("main")){
            tac.write("JUMP main");
        }else{
            SymbolTableNode n=null;
            Set<Integer> keys=symbolTable.SymbolHashTable().keySet();
            for(Integer i: keys){
                SymbolTableNode temp= (SymbolTableNode) symbolTable.SymbolHashTable().get(i);
                while(temp!=null){
                    if(temp.name.equals(ctx.getChild(1).getText())){
                        n=temp;
                        break;
                    }
                    if(temp.child!=null){
                        temp=temp.child;

                    }else if(temp.child==null){
                        break;
                    }
                }
            }
            tac.write("PROC " +n.parameters.size()+" " +n.name);
        }
        tac.write("LABEL "+ctx.getChild(1).getText());
        quads.tabs++;


        //for mips
        currentMethod.push(ctx.getChild(1).getText());
        SymbolTableNode n=new SymbolTableNode();
        String params=ctx.getChild(3).getText();
        while(!params.equals(")") && params.contains(",")){
            n.parameters.add("$t"+tempct);

            String[] temp=new String[2];
            temp[0]= ctx.getChild(1).getText();
            temp[1]="$t"+tempct;
            namesregs.add(temp);

            tempct++;
            params=params.substring(params.indexOf(",")+1);

        }
        if(!params.equals(")")){
            n.parameters.add("$t"+tempct);
            String[] temp=new String[2];
            temp[0]= ctx.getChild(1).getText();
            temp[1]="$t"+tempct;
            namesregs.add(temp);
            System.out.println("methods "+Arrays.toString(methods.toArray()));
            for(int i=0; i<methods.size(); i++){
                if(methods.get(i).name.equals(ctx.getChild(1).getText())){
                    System.out.println("params"+methods.get(i).parameters.get(0));
                }
            }

            tempct++;
        }
        n.name=ctx.getChild(1).getText();
        if(n.name.equals("main")){
            n.tempType="main";
        }else
            n.tempType="lbl_"+_lbl_count;
        methods.add(n);
        incrementLablel();
        quads.write(n.tempType+": ");
        quads.tabs++;

        return super.visitMethodDecl(ctx);
    }
    @Override
    public Void visitCondition(grmParser.ConditionContext ctx) {
        String op1=ctx.getChild(0).getText();
        String op2=ctx.getChild(2).getText();
        String op=ctx.getChild(1).getText();
        if(op1.contains("%") && op.equals("==")){
            String op11=op1.substring(0,op1.indexOf("%"));
            String op22=op1.substring(op1.indexOf("%")+1);
            quads.write("div\t\t"+ "$t"+tempct+", $t0"+  ",2 ");
            quads.write("mfhi\t $t"+tempct);
            condition="$t"+tempct;
            incrementTemp();
            quads.write("beq " + condition + " " + middle2 + " " + "lbl_" + _lbl_count + " if");
            elselbl=_lbl_count;
            incrementLablel();

        }else
        if(op1.contains("%") && op.equals("!=")){
            String op11=op1.substring(0,op1.indexOf("%"));
            String op22=op1.substring(op1.indexOf("%")+1);
            quads.write("div\t\t"+ "$t"+tempct+", $t0"+  ",2 ");
            quads.write("mfhi\t $t"+tempct);
            condition="$t"+tempct;
            incrementTemp();

            quads.write("bne " + condition + " " + middle2 + " " + "lbl_" + _lbl_count + " if");
            elselbl=_lbl_count;
            incrementLablel();
        }
        if(op.equals("==")){
            tac.write("NEQI i"+iCount+" "+op1+" "+op2);
        }
        return super.visitCondition(ctx);
    }
    @Override
    public Void visitEof(grmParser.EofContext ctx) {
        quads.write("li $v0, 10");
        quads.write("syscall");
        return super.visitEof(ctx);
    }

    @Override
    public Void visitWhileStatement(grmParser.WhileStatementContext ctx) {
        String op=ctx.getChild(2).getChild(1).getText();
        String op1=ctx.getChild(2).getChild(0).getText();
        String op2=ctx.getChild(2).getChild(2).getText();
        quads.write("lbl_"+_lbl_count+":");
        whilelbl.push(_lbl_count);
        incrementLablel();
        if(op.equals("==")){
            isEquals=1;
            String middle=getTemp(op1);
            if(middle.equals("")){
                middle=op1;
            }
            middle1=middle;
            if(checkType(op1).equals("int")|| checkType(op1).equals("char"))
               // load(checkType(op1), op1, middle);
            op1="$t"+tempct;
            incrementTemp();
            String middle2=getTemp(op2);
            //System.out.println("middel2 "+middle2);
            this.middle2=middle2;
            if(!checkType(middle2).equals("char") && !checkType(middle2).equals("int"))
            op2="$t"+tempct;
            incrementTemp();
            quads.write("lbl_"+_lbl_count+":");
            whilelbl.push(_lbl_count);
            incrementLablel();
            quads.write("bne "+middle+ " "+middle2+" "+"lbl_"+_lbl_count+" while");
            endWhilelbl.push(_lbl_count);
            incrementLablel();
        }else if(op.equals("<=")){
            isEquals=1;
            String middle=getTemp(op1);

            if(middle.equals("")){
                middle=op1;
            }
            if(checkType(op1).equals("int")|| checkType(op1).equals("char"))
                //load(checkType(op1), op1, middle);
            op1="$t"+tempct;
            incrementTemp();
            String middle2=getTemp(op2);
            op2="$t"+tempct;
            incrementTemp();
            quads.write("lbl_"+_lbl_count+":");
            whilelbl.push(_lbl_count);
            incrementLablel();
            System.out.println("HELLO"+namesregs.size());
            for(int i=0; i<namesregs.size(); i++){
                if(middle2.equals(namesregs.get(i)[0])){
                    System.out.println("HELLO");
                    middle1=namesregs.get(i)[1];
                    quads.write("bge "+namesregs.get(i)[1]+ " "+middle2+" "+"lbl_"+_lbl_count+" while");
                    isFound=1;
                    incrementLablel();
                }
            }
            if(isFound!=1){
            quads.write("bge "+middle+ " "+middle2+" "+"lbl_"+_lbl_count+" while"); isFound=0;}
            incrementLablel();
            endWhilelbl.push(_lbl_count);
        }else if(op.equals("<")){
            isEquals=1;
            islt=1;
            String middle=getTemp(op1);
            if(middle.equals("")){
                middle=op1;
            }
            if(checkType(op1).equals("int")|| checkType(op1).equals("char"))
                //load(checkType(op1), op1, middle);
                op1="$t"+tempct;
            incrementTemp();
            String middle2=getTemp(op2);
            op2="$t"+tempct;
            incrementTemp();
            quads.write("lbl_"+_lbl_count+":");
            whilelbl.push(_lbl_count);
            incrementLablel();

            for(int i=0; i<namesregs.size(); i++){
                if(middle.equals(namesregs.get(i)[0])){
                    quads.write("bgt "+namesregs.get(i)[1]+ " "+middle2+" "+"lbl_"+_lbl_count+" while");
                    isFound=1;
                }
            }
            if(isFound!=1)
            quads.write("bgt "+middle2+ " "+middle+" "+"lbl_"+_lbl_count+" while");
            this.middle1=middle;
            this.middle2=middle2;
            isBgt=1;
            endWhilelbl.push(_lbl_count);
            incrementLablel();
        }
        return super.visitWhileStatement(ctx);
    }

    @Override
    public Void visitElseStatement(grmParser.ElseStatementContext ctx) {
        return super.visitElseStatement(ctx);
    }

    @Override
    public Void visitIfStatment(grmParser.IfStatmentContext ctx) {
        String op=ctx.getChild(2).getChild(1).getText();
        String op1=ctx.getChild(2).getChild(0).getText();
        String op2=ctx.getChild(2).getChild(2).getText();
        if(op.equals("==")){
            int i=ctx.parent.parent.getChild(1).getChild(0).getChildCount();
            while(ctx.parent.parent.getChild(1).getChild(0).getChild(i-1).getText().length()>=5 && !(ctx.parent.parent.getChild(1).getChild(0).getChild(i-1).getText().substring(0,5)).equals("else")){
                i--;
            }
            if(i>=0){
                tac.write("ELSELABEL _lbl_"+_lbl_count);
                quads.tabs++;
            }
            else if(i<0){
                //there is no else statement
            }
            isEquals=1;
            String middle=getTemp(op1);
            //load(checkType(op1), op1, middle);
            op1="$t"+tempct;
            incrementTemp();
            String middle2=getTemp(op2);op2="$t"+tempct;
            incrementTemp();
            if(!middle.contains("%")) {
                quads.write("bne " + middle1 + " " + middle2 + " " + "lbl_" + _lbl_count + " if");
                elselbl=_lbl_count;
                incrementLablel();

            }
        }else if(op.equals("<=")){
            String middle=getTemp(op1);
            //load(checkType(op1), op1, middle);
            op1="$t"+tempct;
            incrementTemp();
            String middle2=getTemp(op2);
            op2="$t"+tempct;
            quads.write("ble "+middle+" "+middle2+"lbl_"+_lbl_count+" if");
            elselbl=_lbl_count;
            incrementTemp();
        }else if(op.equals(">")){
            String middle=getTemp(op1);
            //load(checkType(op1), op1, middle);
            op1="$t"+tempct;
            incrementTemp();
            String middle2=getTemp(op2);
            op2="$t"+tempct;
            incrementTemp();
            quads.write("blt "+op1+" "+op2+" _lbl_"+_lbl_count+" if");
            elselbl=_lbl_count;
            incrementLablel();
        }
        childCount=0;
        quads.tabs--;
        return super.visitIfStatment(ctx);
    }
    public String getTemp(String s){
        if(s.contains("[")){
            s=s.substring(0,s.indexOf("["));
        }
        SymbolTableNode n = null;
        Set<Integer> keys = symbolTable.SymbolHashTable().keySet();
        for (Integer i : keys) {
            SymbolTableNode nn = (SymbolTableNode) symbolTable.SymbolHashTable().get(i);
            while (nn != null) {
                if (nn.name.equals(s)) {
                    return nn.tempType;
                }
                if (nn.child != null) {
                    nn = nn.child;

                } else if (nn.child == null) {
                    break;
                }
            }
        }
        return s;
    }

    @Override
    public Void visitEndif(grmParser.EndifContext ctx) {
        try {
            String temp=(ctx.parent.parent.getChild(1).getText());
            quads.write("j lbl_"+_lbl_count);
            fallthroughlbl=_lbl_count;
            incrementLablel();
        }catch(NullPointerException e){
            //there is no else
        }

        quads.write("lbl_"+elselbl+":");
        return super.visitEndif(ctx);
    }

    @Override
    public Void visitEndElse(grmParser.EndElseContext ctx) {
        quads.write("lbl_"+fallthroughlbl+":");
        incrementLablel();

        return super.visitEndElse(ctx);
    }

    @Override
    public Void visitRcb(grmParser.RcbContext ctx) {
        quads.tabs--;
        try{
            String temp=ctx.parent.parent.parent.getChild(0).getText();
            if(temp.equals("while")){
                if(isBgt!=1)
                quads.write("ble "+middle1+" "+middle2+" lbl_"+whilelbl.pop());
                else if(islt==1){
                    for(int i=0; i<namesregs.size(); i++){
                        if(middle1.equals(namesregs.get(i)[0])){
                            middle1=namesregs.get(i)[1];
                            quads.write("bgt "+namesregs.get(i)[1]+ " "+middle2+" "+"lbl_"+_lbl_count+" while");
                            isFound=1;
                        }
                    }
                    if(isFound!=1) {
                        quads.write("bgt " + middle1 + " " + middle2 + " lbl_" + whilelbl.pop());
                        isFound=0;
                    }
                    isBgt=0;
                }else{
                    for(int i=0; i<namesregs.size(); i++){
                        if(middle1.equals(namesregs.get(i)[0])){
                            middle1=namesregs.get(i)[1];
                            quads.write("blt "+namesregs.get(i)[1]+ " "+middle2+" "+"lbl_"+_lbl_count+" while");
                            isFound=1;
                        }
                    }
                    if(isFound!=1) {
                        quads.write("blt " + middle1 + " " + middle2 + " lbl_" + whilelbl.pop());
                        isFound=0;
                    }
                    isBgt=0;
                }
                try {
                    quads.write("lbl_" + endWhilelbl.pop() + ":");

                }catch(NullPointerException e){ }catch (EmptyStackException n){}
            }
            //quads.write("lbl_"+fallthroughlbl+":");

        }catch(NullPointerException e){

        }
        try {
            if(parser.ruleNames[ctx.parent.parent.getRuleIndex()].equals("methodDecl")) {
                tempct--;
                currentMethod.pop();
                if(!ctx.parent.parent.getChild(1).getText().equals("main"))
                    quads.write("j $ra");
            }
        }catch(NullPointerException e){

        }

        return super.visitRcb(ctx);
    }


    @Override
    public Void visitPrintStatement(grmParser.PrintStatementContext ctx) {
        //tac
        if(ctx.getChild(0).getText().equals("print")){
            Quadruple load=new Quadruple("LDC", "c"+cCount,  ctx.getChild(2).getText(), "");
            Quadruple q=new Quadruple("print", "c"+cCount,"","");
            cCount++;
            tac.write(load.toString());
            tac.write(q.toString());
        }
        //mips
        String s=ctx.getChild(2).getText();
        System.out.println(s);
        String temp="";
        if(checkType(s).equals("int")||checkType(s).equals("char")){
            temp=s;
        }else if(checkType(s).equals("variable")){
            String num=getregnum(s);
            for(int i=0; i<namesregs.size(); i++){
                System.out.println("arr"+Arrays.toString(namesregs.get(i)));
                if(namesregs.get(i)[0].equals(s)){
                    temp=namesregs.get(i)[1];
                }
            }
            temp+=num;
            if(temp.equals("")){
                for(int i=0; i<methods.size(); i++){
                    if(methods.get(i).name.equals(currentMethod.peek())){
                        System.out.println("params"+methods.get(i).parameters.get(0));
                        temp=methods.get(i).parameters.get(0);
                    }
                }
            }
            temp=s;
        }
        print(temp);
        quads.write("syscall");
        return super.visitPrintStatement(ctx);
    }
    public void print(String temp){
        String type = checkType(temp);
        if(!temp.equals("")) {
            if(temp.length()>3&&temp.substring(0,3).equals("chr")){
                load("int", "11", "$v0");
                load(checkType(temp.substring(4,temp.length()-1)), "\'"+(char) Integer.parseInt(temp.substring(4,temp.length()-1))+"\'", "$a0");
            }else {
                if (type.equals("int") || type.equals("char")) {
                    load("int", "11", "$v0");
                    load(type, temp, "$a0");
                }else if(type.equals("variable")){
                    String t2="";

                    for(int i=0; i<methods.size(); i++){

                        if(methods.get(i).name.equals(currentMethod.peek())){
                            if(methods.get(i).parameters.size()>0) {
                                System.out.println("params" + methods.get(i).parameters.get(0));
                                t2 = methods.get(i).parameters.get(0);
                                System.out.println("t2"+methods.get(i).parameters.get(0));
                            }
                        }
                    }
                    if(t2.equals("")){
                        for(int i=0; i<namesregs.size(); i++){
                            if(temp.equals(namesregs.get(i)[0])){
                                t2=namesregs.get(i)[1];
                                isFound=1;
                            }
                        }
                    }if(isFound!=1) t2=temp;

                    quads.write("add $a0, "+t2+", 0");
                    System.out.println(Arrays.toString(namesregs.toArray()));
                    load("int", "1", "$v0");
                }
            }
        }
    }
    public void load(String type, String temp, String register){
        if(type.equals("int")){
            quads.write("li "+register+", " + temp);
        }else if(type.equals("char")){
            quads.write("li "+register+", " + temp);
        }else if(type.equals("variable")) {
            if (type.charAt(0) == '$') {
                SymbolTableNode n = null;
                Set<Integer> keys = symbolTable.SymbolHashTable().keySet();
                for (Integer i : keys) {
                    SymbolTableNode nn = (SymbolTableNode) symbolTable.SymbolHashTable().get(i);
                    while (nn != null) {
                        if (nn.name.equals(temp)) {
                            n = nn;
                            n.tempType = "$t" + tempct;
                            quads.write("lb "+register+", " + n.tempType);
                            incrementTemp();
                            break;
                        }
                        if (nn.child != null) {
                            nn = nn.child;

                        } else if (nn.child == null) {
                            break;
                        }
                    }
                }
                quads.write("lb "+register+", " + temp);

            }else if (type.charAt(0) != '$'){
                quads.write("lb "+register+ ", "+ type);
            }else{
                //System.out.println("cannot find");
            }
        }
    }

    @Override
    public Void visitStatement(grmParser.StatementContext ctx) {

        //mips
        if(endIf==1){
            quads.write("j lbl_"+_lbl_count);
            fallthroughlbl=_lbl_count;
            quads.write("lbl_"+elselbl+":");
            endIf=0;
        }else if(endElse==1){
            //quads.write("lbl_"+fallthroughlbl+":");
            endElse=0;
        }
        if(parser.ruleNames[ctx.parent.getRuleIndex()].equals("ifStatment")){
            if(childCount==0) {
                quads.tabs++;
            }
            String temp=ctx.parent.getChild(ctx.parent.getChildCount()-1).getText();
            if(temp.equals(ctx.getText())&&isEquals==1){
                isEquals=0;
                endIf=1;
                //last instruction of else
                //quads.write("_lbl_"+elselbl+" ruleelse");
                //incrementLablel();
            }
            childCount++;
        }else if(parser.ruleNames[ctx.parent.getRuleIndex()].equals("elseStatement")){
            if(childCount==0) {
                quads.tabs++;
            }
            String temp="";
            try{
                temp=ctx.parent.parent.getChild(ctx.parent.parent.getChildCount()-1).getChild(ctx.parent.getChildCount()).getText();


            }catch (NullPointerException e){

            }
            if(temp.equals(ctx.getText())&&isEquals==1){
                isEquals=0;
                endElse=1;
                //last instruction of else
                //quads.write("_lbl_"+elselbl+" ruleelse");
                incrementLablel();
            }
            childCount++;
        }
        else
        if(parser.ruleNames[ctx.parent.getRuleIndex()].equals("whileStatement"))
        {
            ////System.out.println(ctx.getText()+" "+parser.ruleNames[ctx.parent.getRuleIndex()]);
            if (childCount == 0) {
                quads.tabs++;
            }
            String temp = "";
            try {
                temp = ctx.parent.parent.getChild(ctx.parent.parent.getChildCount() - 1).getChild(ctx.parent.getChildCount()).getText();
//               //System.out.println(temp);
//                //System.out.println(ctx.getText());

            } catch (NullPointerException e) {

            }
            if (temp.equals(ctx.getText())) {
                isEquals = 1;
                //last instruction of else
                //quads.write("_lbl_"+elselbl+" ruleelse");
                quads.write("bne "+middle1+ " "+middle2+" "+"lbl_"+fallthroughlbl+" while");
                incrementLablel();
            }
            childCount++;
        }

        return super.visitStatement(ctx);
    }

    @Override
    public Void visitBlock(grmParser.BlockContext ctx) {
        if(localCount>0) {
            tac.write("LOCALS " + localCount);
            localCount = 0;
        }
        quads.tabs--;
        return super.visitBlock(ctx);
    }

    @Override
    public Void visitVarDecl(grmParser.VarDeclContext ctx) {
        localCount++;
        String tt=ctx.getText();
        ArrayList<String> list=new ArrayList<>();
        while(tt.contains(",")) {
            localCount++;
            list.add(tt.substring(0,tt.indexOf(",")));
            tt = tt.substring(tt.indexOf(",") + 1);
        }
        for (String s:
                list)
        {
            String[] t1=new String[2];
            t1[0]=s;
            t1[1]="$t"+tempct;
            SymbolTableNode n=null;
            Set<Integer> keys=symbolTable.SymbolHashTable().keySet();
            for(Integer i: keys){
                SymbolTableNode temp= (SymbolTableNode) symbolTable.SymbolHashTable().get(i);
                while(temp!=null){
                    if(temp.name.equals(s)){
                        n=temp;
                        n.tempType="$t"+tempct;
                        String[] temp2=new String[2];
                        temp2[0]=s;
                        temp2[1]="$t"+tempct;
                        namesregs.add(temp2);
                        incrementTemp();
                        break;
                    }
                    if(temp.child!=null){
                        temp=temp.child;

                    }else if(temp.child==null){
                        break;
                    }
                }
            }
        }

        localCount = 0;
        if(quads.tabs>0)
            quads.tabs--;

        return super.visitVarDecl(ctx);
    }

    @Override
    public Void visitParsTemp(grmParser.ParsTempContext ctx) {
        localCount++;
        String tt=ctx.getText();
        SymbolTableNode n=null;
        Set<Integer> keys=symbolTable.SymbolHashTable().keySet();
        for(Integer i: keys){
            SymbolTableNode temp= (SymbolTableNode) symbolTable.SymbolHashTable().get(i);
            while(temp!=null){
                if(temp.name.equals(ctx.getChild(1).getText())){
                    n=temp;
                    n.tempType="$t"+tempct;

                    incrementTemp();
                    break;
                }
                if(temp.child!=null){
                    temp=temp.child;

                }else if(temp.child==null){
                    break;
                }
            }
        }
        localCount = 0;
        if(quads.tabs>0)
            quads.tabs--;
        return super.visitParsTemp(ctx);
    }

    @Override
    public Void visitConstDecl(grmParser.ConstDeclContext ctx) {
        localCount++;
        return super.visitConstDecl(ctx);
    }
    public String getOP(String op){
        if(op.equals("+")){
            return "add";
        }else if(op.equals("-")){
            return "sub";
        }
        return "op?";
    }

    ArrayList<String[]> namesregs= new ArrayList();

    public String getregnum(String name){
        for(String a[] : namesregs){
            if(name.equals(a[0])){
                return a[1];
            }
        }
        return "null";
    }

    public boolean regexists(String name){
        for(String a[] : namesregs){
            if(name.equals(a[0])){
                return true;
            }
        }
        return false;
    }
    public void addregnum(String name, int regnum){
        String bb[] =   {name,"$t"+regnum} ;
        namesregs.add(bb);
    }
    public Void visitAssignment(grmParser.AssignmentContext ctx) {


        if(ctx.getChild(0).getChildCount()==4){

            //System.out.println("\t1479632178\t"+ctx.getChild(0).getText()+"\t1479632178\t"+ ctx.getChild(0).getChildCount());
            String arname= ctx.getChild(0).getChild(0).getText();
            String arindex= ctx.getChild(0).getChild(2).getText();
            String valassi = ctx.getChild(1).getChild(1).getText();

            //System.out.println("\txxxxx\t"+arname+"\tAT\t"+ arindex+"\tEQUALS\t"+ valassi+"\tMADEOF\t"+ ctx.getChild(1).getChild(1).getChildCount());
            //casesss




        }
        //WHEN CALLINVG A METHOD

        else if(ctx.getChild(0).getChildCount()==1) {
            String assignee = ctx.getChild(0).getText();
            //get type of assignee from the symbol table
            try {
                SymbolTableNode nod = lexer.checkScopeNode(assignee);
                if (nod.type.equals("int")) {
                    assitype = "int";
                } else if (nod.type.equals("char")) {
                    assitype = "char";
                } else {
                    assitype="class";
                }
            } catch (NullPointerException e) {
                lexer.errors.write(ctx.parent.getChild(0).getChild(0).getText() + "is not defined on line " + ctx.start.getLine());
            }

            //if tpe is integer
            int assignednum = ctx.getChild(1).getChild(1).getChildCount();

            if (assignednum == 1) {
                if (ctx.getChild(1).getChild(1).getChild(0).getChildCount() == 1){
                    String assigned = ctx.getChild(1).getChild(1).getText();
                    if (assitype.equals("int")) {
                        if(isint(assigned)) {

                            if(regexists(assignee)){
                                Quadruple q = new Quadruple("li", getregnum(assignee), assigned, "");
                                quads.write(q.toString());

                            }else{
                                addregnum(assignee,rcount);
                                Quadruple q = new Quadruple("li", "$t" + rcount++, assigned, "");
                                quads.write(q.toString());
                            }


                        }
                    } else if (assitype.equals("char")) {
                        addregnum(assignee,rcount);
                        Quadruple q=new Quadruple("li", "$t" + rcount++, assigned, "");
                        quads.write(q.toString());
                    } else if (assitype.equals("")) {
                    } else if (assitype.equals("class")){
                        Quadruple q=new Quadruple("COPYO", assigned,  assignee, "");
                        incrementTemp();
                        quads.write(q.toString());
                    }
                }
                else{
                    if (ctx.getChild(1).getChild(1).getChild(0).getChild(0).getChildCount() == 1){
                        String assigned1 = ctx.getChild(1).getChild(1).getChild(0).getChild(0).getText();
                        String op = ctx.getChild(1).getChild(1).getChild(0).getChild(1).getText();
                        String assigned2 = ctx.getChild(1).getChild(1).getChild(0).getChild(2).getText();
                        if(op.equals("*")){
                            if(regexists(assignee)){
                                Quadruple q1=new Quadruple("mul\t\t", getregnum(assignee),", "+getregnum(assigned1),  ", "+getregnum(assigned2));
                                quads.write(q1.toString());
                            }else{
                                addregnum(assignee,rcount);
                                Quadruple q1=new Quadruple("mul\t\t", "$t"+rcount++ ,", "+getregnum(assigned1),  ", "+getregnum(assigned2));
                                quads.write(q1.toString());
                            }
                        }
                        else if(op.equals("/")){
                            if(regexists(assignee)){
                                Quadruple q1=new Quadruple("div\t\t", getregnum(assignee),", "+getregnum(assigned1),  ", "+getregnum(assigned2));
                                Quadruple q2=new Quadruple("mflo\t", getregnum(assignee)," ",  " ");
                                quads.write(q1.toString());
                                quads.write(q2.toString());
                            }else{
                                addregnum(assignee,rcount);
                                Quadruple q1=new Quadruple("div\t\t", "$t"+rcount ,", "+getregnum(assigned1),  ", "+getregnum(assigned2));
                                Quadruple q2=new Quadruple("mflo\t", "$t"+rcount++ ," ",  " ");
                                quads.write(q1.toString());
                                quads.write(q2.toString());
                            }
                        }
                        else if(op.equals("%")){
                            if(regexists(assignee)){
                                Quadruple q1=new Quadruple("div\t\t", getregnum(assignee),", "+getregnum(assigned1),  ", "+getregnum(assigned2));
                                Quadruple q2=new Quadruple("mfhi\t", getregnum(assignee)," ",  " ");
                                quads.write(q1.toString());
                                quads.write(q2.toString());
                            }else{
                                addregnum(assignee,rcount);
                                Quadruple q1=new Quadruple("div\t\t", "$t"+rcount ,", "+getregnum(assigned1),  ", "+getregnum(assigned2));
                                Quadruple q2=new Quadruple("mfhi\t", "$t"+rcount++ ," ",  " ");
                                quads.write(q1.toString());
                                quads.write(q2.toString());
                            }
                        }
                    }
                }
            } else if (assignednum == 3) {
                String assigned1 = ctx.getChild(1).getChild(1).getChild(0).getText();
                String tempassigned1= gettempnum(assigned1);
                String op = ctx.getChild(1).getChild(1).getChild(1).getText();
                String assigned2 = ctx.getChild(1).getChild(1).getChild(2).getText();
                String tempassigned2= gettempnum(assigned2);
                if (op.equals("+")) {
                    if(regexists(assignee)){
                        if(isint(assigned2)){
                            Quadruple q1 = new Quadruple("addi\t\t", getregnum(assignee), ", " + getregnum(assigned1), ", " + assigned2);
                            quads.write(q1.toString());
                        }
                        else {
                            Quadruple q1 = new Quadruple("add\t\t", getregnum(assignee), ", " + getregnum(assigned1), ", " + getregnum(assigned2));
                            quads.write(q1.toString());
                        }
                    }else{
                        addregnum(assignee,rcount);
                        Quadruple q1=new Quadruple("add\t\t", "$t"+rcount++ ,", "+getregnum(assigned1),  ", "+getregnum(assigned2));
                        quads.write(q1.toString());
                    }
                } else if (op.equals("-")) {
                    if(regexists(assignee)){
                        Quadruple q1=new Quadruple("sub\t\t", getregnum(assignee),", "+getregnum(assigned1),  ", "+getregnum(assigned2));
                        quads.write(q1.toString());
                    }else{
                        addregnum(assignee,rcount);
                        Quadruple q1=new Quadruple("sub\t\t", "$t"+rcount++ ,", "+getregnum(assigned1),  ", "+getregnum(assigned2));
                        quads.write(q1.toString());
                    }


                }
                String assigned = ctx.getChild(1).getChild(1).getText();
            }
        }

        else{       //assigning to a (1)class field or (2)an array element      //ctx.getChild(0) is the left-hand-side
            if(ctx.getChild(0).getChild(1).getText().equals(".")){        //(1)class field
                String lhs= ctx.getChild(0).getText();
                String classname= ctx.getChild(0).getChild(0).getText();
                String fieldname= ctx.getChild(0).getChild(2).getText();
                String eqs= ctx.getChild(1).getChild(0).getText();

                try {
                    SymbolTableNode nod = lexer.checkScopeNode(fieldname);
                    if (nod.type.equals("int")) {
                        assitype = "int";
                    } else if (nod.type.equals("char")) {
                        assitype = "char";
                    }
                } catch (NullPointerException e) {
                    lexer.errors.write(ctx.parent.getChild(0).getChild(0).getText() + "is not defined on line " + ctx.start.getLine());
                }

                if(ctx.getChild(1).getChild(1).getChildCount()==1){
                    String assinged = ctx.getChild(1).getChild(1).getChild(0).getText();
                    if(assitype.equals("int")){
                        addtoal(lhs,_temp_count);
                        incrementTemp();
//                        printal();
                    } else{
                    }
                }
            }

        }


//        printnamesregs();
        return super.visitAssignment(ctx);
    }


    ArrayList<String[]> namestemps= new ArrayList();

    String assitype="";
    int tcount=0;

    int rcount=0;

    public void addtoal(String name, String tempnum){
        String bb[] =   {name,"_tmp_"+tempnum} ;
        namestemps.add(bb);
    }

    public void printal(){
//        //System.out.println("************");
//        for(String a[] : namestemps){
//            //System.out.println(a[0]);
//            //System.out.println(a[1]);
//        }
//        //System.out.println("***********");
    }

    public boolean isint(String x){
        try{
            Integer.parseInt(x);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }

    @Override
    public Void visitFormPars(grmParser.FormParsContext ctx) {
        //System.out.println("form pars "+ctx.getText());
        return super.visitFormPars(ctx);
    }

    public String gettempnum(String name){
        for(String a[] : namestemps){
            if(name.equals(a[0])){
                try{
                    return a[1].substring(6).replaceAll("\\b0+(?!\\b)", "");
                }catch(NumberFormatException e){
                    return a[1].substring(10).replaceAll("\\b0+(?!\\b)", "");
                }

            }
        }
        return "";
    }
    public boolean exists(String name){
        for(String a[] : namestemps){
            if(name.equals(a[0])){
                return true;
            }
        }
        return false;
    }
}
