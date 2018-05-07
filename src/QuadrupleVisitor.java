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
    String middle1="";
    String middle2="";
    String mainLabel="";
    QuadWriter quads=new QuadWriter();
    String exValue="";
    ArrayList<SymbolTableNode> methods=new ArrayList<>();
    public  void setLexer(grmLexer l){
        this.lexer=l;
    }

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
            if(x.charAt(0)=='\''){
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
        for (SymbolTableNode n:methods
             ) {
            if(n.name.equals(methodName)&& !methodName.equals("chr")){
                quads.write("jal "+n.tempType);
            }
        }
        return super.visitActPars(ctx);
    }

    @Override
    public Void visitMethodDecl(grmParser.MethodDeclContext ctx) {

        SymbolTableNode n=null;
        Set<Integer> keys=symbolTable.SymbolHashTable().keySet();
        for(Integer i: keys){
            SymbolTableNode temp= (SymbolTableNode) symbolTable.SymbolHashTable().get(i);
            while(temp!=null){
                if(temp.name.equals(ctx.getChild(1).getText())){
                    n=temp;
                    n.returnRegister=tempct;
                    tempct++;
                    n.tempType=_lbl_count;
                    incrementLablel();
                    methods.add(n);
                    break;
                }
                if(temp.child!=null){
                    temp=temp.child;

                }else if(temp.child==null){
                    break;
                }
            }
        }

        n.paramBegin=tempct;
        n.paramEnd=tempct;
        if(n.name.equals("main")){
            n.tempType="main";
        }else             n.tempType="lbl_"+_lbl_count;


        incrementLablel();
        quads.write(n.tempType+": ");

        quads.tabs++;

        return super.visitMethodDecl(ctx);
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
        System.out.println(op+" "+op1+" "+op2);
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
            load(checkType(op1), op1, middle);
            op1="$t"+tempct;
            incrementTemp();
            String middle2=getTemp(op2);
            System.out.println("middel2 "+middle2);
            this.middle2=middle2;
            if(!checkType(middle2).equals("char") && !checkType(middle2).equals("int"))
                quads.write("lb "+middle2+", "+op2);

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
                load(checkType(op1), op1, middle);
            op1="$t"+tempct;
            incrementTemp();
            String middle2=getTemp(op2);
            quads.write("lb "+middle2+", "+op2);
            System.out.println("middel32 "+middle);
            op2="$t"+tempct;
            incrementTemp();
            quads.write("lbl_"+_lbl_count+":");
            whilelbl.push(_lbl_count);
            incrementLablel();
            quads.write("blt "+middle2+ " "+middle+" "+"lbl_"+_lbl_count+" while");
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
            isEquals=1;
            String middle=getTemp(op1);
            load(checkType(op1), op1, middle);
            op1="$t"+tempct;
            incrementTemp();
            String middle2=getTemp(op2);
            quads.write("lb "+middle2+", "+op2);
            op2="$t"+tempct;
            incrementTemp();
            quads.write("bne "+middle+ " "+middle2+" "+"lbl_"+_lbl_count+" if");
            elselbl=_lbl_count;
            incrementLablel();
        }else if(op.equals("<=")){
            String middle=getTemp(op1);
            load(checkType(op1), op1, middle);
            op1="$t"+tempct;
            incrementTemp();
            String middle2=getTemp(op2);
            quads.write("lb "+middle2+", "+op2);
            op2="$t"+tempct;
            incrementTemp();
            quads.write("ble "+middle+" "+middle2+"lbl_"+_lbl_count+" if");
            elselbl=_lbl_count;
            incrementLablel();
        }else if(op.equals(">")){
            String middle=getTemp(op1);
            load(checkType(op1), op1, middle);
            op1="$t"+tempct;
            incrementTemp();
            String middle2=getTemp(op2);
            quads.write("lb "+middle2+", "+op2);
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
                quads.write("ble "+middle1+" "+middle2+" lbl_"+whilelbl.pop());
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
                if(!ctx.parent.parent.getChild(1).getText().equals("main"))
                quads.write("j $ra");
            }
        }catch(NullPointerException e){

        }

        return super.visitRcb(ctx);
    }


    @Override
    public Void visitPrintStatement(grmParser.PrintStatementContext ctx) {
        String s=ctx.getChild(2).getText();
        String temp="";
        if(checkType(s).equals("int")||checkType(s).equals("char")){
            temp=s;
        }else if(checkType(s).equals("variable")){
            String num=getTemp(s);
            temp+=num;
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
                load(checkType(temp.substring(4,temp.length()-1)), "\'"+temp.substring(4,temp.length()-1)+"\'", "$a0");
            }else {
                if (type.equals("int") || type.equals("char")) {
                    load("int", "11", "$v0");
                    load(type, temp, "$a0");
                }else if(type.equals("variable")){
                    quads.write("add $a0 "+temp+" 0");
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
            System.out.println("cannot find");
        }
        }
    }

    @Override
    public Void visitStatement(grmParser.StatementContext ctx) {
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
                incrementLablel();
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
            //System.out.println(ctx.getText()+" "+parser.ruleNames[ctx.parent.getRuleIndex()]);
            if (childCount == 0) {
                quads.tabs++;
            }
            String temp = "";
            try {
                temp = ctx.parent.parent.getChild(ctx.parent.parent.getChildCount() - 1).getChild(ctx.parent.getChildCount()).getText();
//               System.out.println(temp);
//                System.out.println(ctx.getText());

            } catch (NullPointerException e) {

            }
            if (temp.equals(ctx.getText())) {
                isEquals = 0;
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


        SymbolTableNode n=null;
        Set<Integer> keys=symbolTable.SymbolHashTable().keySet();
        for(Integer i: keys){
            SymbolTableNode temp= (SymbolTableNode) symbolTable.SymbolHashTable().get(i);
            while(temp!=null){
                if(temp.name.equals(s)){
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


    public Void visitAssignment(grmParser.AssignmentContext ctx) {
//        String lhs=ctx.parent.getChild(0).getChild(0).getText();
//        String rhs=ctx.parent.getChild(0).getChild(1).getText();
//        String op=""+rhs.charAt(0);
//        rhs=rhs.substring(1);
//        String tempname=getTemp(lhs);
//        String rhsType=checkType(rhs);
//        if(rhsType.equals("int")){
//           // System.out.println("li "+tempname+", "+rhs);
//        }
//        else{
//
//        }

        if(ctx.getChild(0).getChildCount()==1) {
            String assignee = ctx.getChild(0).getText();
            //get type of assignee from the symbol table
            try {
                SymbolTableNode nod = lexer.checkScopeNode(assignee);
                if (nod.type.equals("int")) {
                    assitype = "int";
                } else if (nod.type.equals("char")) {
                    assitype = "char";
                } else {
//                    System.out.println("uuuuuuuuuuuuuuuuuuuuuuuuu"+nod.type);
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
                            addtoal(assignee,_temp_count);
                            Quadruple q = new Quadruple("lui", "$t" + tempct, assigned, "");
                            incrementTemp();
                            quads.write(q.toString());
                        }
                    } else if (assitype.equals("char")) {
                        Quadruple q=new Quadruple("COPYC", assigned,  assignee, "");
                        incrementTemp();
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
                            Quadruple q1=new Quadruple("tim", "\t$t"+tempct,"\t"+gettempnum(assigned1),  "\t"+gettempnum(assigned2));
                            int result = tempct;
                            quads.write(q1.toString());
                            incrementTemp();
                            if(exists(assignee)){
                                Quadruple q2=new Quadruple("st", ""+gettempnum(assignee) ,"\t$t" + result,"");
                                quads.write(q2.toString());
                            }else{
                                addtoal(assignee,"$t"+tempct);
                                Quadruple q2=new Quadruple("st", "$t"+tempct ,"\t$t" + result,"");
                                quads.write(q2.toString());
                                incrementTemp();
                            }
                        }
                        else if(op.equals("/")){
                            Quadruple q1=new Quadruple("div", "\t$t"+tempct,"\t"+gettempnum(assigned1),  "\t"+gettempnum(assigned2));
                            String result = _temp_count;
                            quads.write(q1.toString());
                            incrementTemp();
                            if(exists(assignee)){
                                Quadruple q2=new Quadruple("st", ""+gettempnum(assignee) ,"\t$t" + result,"");
                                quads.write(q2.toString());
                            }else{
                                addtoal(assignee,"_tem_"+tempct);
                                Quadruple q2=new Quadruple("st", "$t"+tempct ,"\t$t" + result,"");
                                quads.write(q2.toString());
                                incrementTemp();
                            }
                        }
                        else if(op.equals("%")){
                            Quadruple q1=new Quadruple("mod", "\t$t"+tempct,"\t"+gettempnum(assigned1),  "\t"+gettempnum(assigned2));
                            String result = _temp_count;
                            quads.write(q1.toString());
                            incrementTemp();
                            if(exists(assignee)){
                                Quadruple q2=new Quadruple("st",""+ gettempnum(assignee) ,"\t$t" + result,"");
                                quads.write(q2.toString());
                            }else{
                                addtoal(assignee,"_tem_"+tempct);
                                Quadruple q2=new Quadruple("st", "$t"+tempct ,"\t$t" + result,"");
                                quads.write(q2.toString());
                                incrementTemp();
                            }
                        }
                    }
                }
            } else if (assignednum == 3) {
                String assigned1 = ctx.getChild(1).getChild(1).getChild(0).getText();
                String tempassigned1= ""+gettempnum(assigned1);
                String op = ctx.getChild(1).getChild(1).getChild(1).getText();
                String assigned2 = ctx.getChild(1).getChild(1).getChild(2).getText();
                String tempassigned2= ""+gettempnum(assigned2);
                if (op.equals("+")) {
                    Quadruple q1=new Quadruple("add", "\t$t"+tempct,"\t"+gettempnum(assigned1),  "\t"+gettempnum(assigned2));
                    String result = _temp_count;
                    quads.write(q1.toString());
                    incrementTemp();
                    if(exists(assignee)){
                        Quadruple q2=new Quadruple("st",""+ gettempnum(assignee) ,"\t$t" + result,"");
                        quads.write(q2.toString());
                    }else{
                        addtoal(assignee,"_tem_"+tempct);
                        Quadruple q2=new Quadruple("st", "$t"+tempct ,"\t$t" + result,"");
                        quads.write(q2.toString());
                        incrementTemp();
                    }
                } else if (op.equals("-")) {
                    Quadruple q1=new Quadruple("sub", "\t$t"+tempct,"\t"+gettempnum(assigned1),  "\t"+gettempnum(assigned2));
                    String result = _temp_count;
                    quads.write(q1.toString());
                    incrementTemp();
                    if(exists(assignee)){
                        Quadruple q2=new Quadruple("st", ""+gettempnum(assignee) ,"\t$t" + result,"");
                        quads.write(q2.toString());
                    }else{
                        addtoal(assignee,"_tem_"+tempct);
                        Quadruple q2=new Quadruple("st", "$t"+tempct ,"\t$t" + result,"");
                        quads.write(q2.toString());
                        incrementTemp();
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
//        System.out.println("************");
//        for(String a[] : namestemps){
//            System.out.println(a[0]);
//            System.out.println(a[1]);
//        }
//        System.out.println("***********");
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
        System.out.println("form pars "+ctx.getText());
        return super.visitFormPars(ctx);
    }

    public int gettempnum(String name){
        for(String a[] : namestemps){
            if(name.equals(a[0])){
                try{
                    return Integer.parseInt(a[1].substring(6).replaceAll("\\b0+(?!\\b)", ""));
                }catch(NumberFormatException e){
                    return Integer.parseInt(a[1].substring(10).replaceAll("\\b0+(?!\\b)", ""));
                }

            }
        }
        return 0;
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
