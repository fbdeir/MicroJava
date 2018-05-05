import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.Set;
import java.util.Stack;

public class QuadrupleVisitor extends grmBaseVisitor<Void> {
    grmLexer lexer;
    grmParser parser;
    String _temp_count=(String.format("%04d", 0));
    String _lbl_count=(String.format("%04d", 0));
    int localCount=0;
    SymbolHashTable symbolTable;
    int childCount=0;
    int tabs=0;
    String elselbl="";
    String fallthroughlbl="";
    Stack<String> whilelbl=new Stack<>();
    int isEquals=0;
    int endIf=0;
    String mainLabel="";
    QuadWriter quads=new QuadWriter();
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
    public Void visitMethodDecl(grmParser.MethodDeclContext ctx) {

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

            n.paramBegin=_temp_count;
            createVariables(n.parameters);
            n.paramEnd=_temp_count;
            n.tempType="_lbl_"+_lbl_count;
        if(n.name.equals("main")){
            mainLabel=n.tempType;
        }
        incrementLablel();
        quads.write(n.tempType+" "+ctx.getChild(1).getText());
        quads.tabs++;

        return super.visitMethodDecl(ctx);
    }

    @Override
    public Void visitEof(grmParser.EofContext ctx) {
        quads.write("EXIT");
        return super.visitEof(ctx);
    }

    @Override
    public Void visitWhileStatement(grmParser.WhileStatementContext ctx) {
        String op=ctx.getChild(2).getChild(1).getText();
        String op1=ctx.getChild(2).getChild(0).getText();
        String op2=ctx.getChild(2).getChild(2).getText();
        quads.write("_lbl_"+_lbl_count+ " while");
        whilelbl.push(_lbl_count);
        incrementLablel();
        if(op.equals("==")){
            isEquals=1;
            String middle=getTemp(op1);
            quads.write("lb "+middle+" "+op1);
            op1="_temp_"+_temp_count;
            incrementTemp();
            String middle2=getTemp(op2);
            quads.write("lb "+middle2+" "+op2);
            op2="_temp_"+_temp_count;
            incrementTemp();
            quads.write("beq "+middle+ " "+middle2+" "+"_lbl_"+whilelbl.peek());
            elselbl=_lbl_count;

            incrementLablel();
        }else if(op.equals("<=")){
            isEquals=1;
            String middle=getTemp(op1);
            quads.write("lb "+middle+" "+op1);
            op1="_temp_"+_temp_count;
            incrementTemp();
            String middle2=getTemp(op2);
            quads.write("lb "+middle2+" "+op2);
            op2="_temp_"+_temp_count;
            incrementTemp();
            quads.write("ble "+middle+ " "+middle2+" "+"_lbl_"+whilelbl.peek());
            elselbl=_lbl_count;
            incrementLablel();
        }
        return super.visitWhileStatement(ctx);
    }

    public void createVariables(ArrayList<String> list){
        int size=list.size();
        for(int z=0; z<size; z++){
            quads.write("lb _temp_"+_temp_count+" $zero ");
            SymbolTableNode n=null;
            Set<Integer> keys=symbolTable.SymbolHashTable().keySet();
            for(Integer i: keys){
                SymbolTableNode temp= (SymbolTableNode) symbolTable.SymbolHashTable().get(i);
                while(temp!=null){
                    if(temp.name.equals(list.get(z))){
                        n=temp;
                        n.tempType="_temp_"+_temp_count;
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

            incrementTemp();
        }
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
            quads.write("lb "+middle+" "+op1);
            op1="_temp_"+_temp_count;
            incrementTemp();
            String middle2=getTemp(op2);
            quads.write("lb "+middle2+" "+op2);
            op2="_temp_"+_temp_count;
            incrementTemp();
            quads.write("bneq "+middle+ " "+middle2+" "+"_lbl_"+_lbl_count);
            elselbl=_lbl_count;
            incrementLablel();
        }else if(op.equals("<=")){
            String middle=getTemp(op1);
            quads.write("lb "+middle+" "+op1);
            op1="_temp_"+_temp_count;
            incrementTemp();
            String middle2=getTemp(op2);
            quads.write("lb "+middle2+" "+op2);
            op2="_temp_"+_temp_count;
            incrementTemp();
            quads.write("ble "+middle+" "+middle2+" _lbl_"+_lbl_count);
            elselbl=_lbl_count;
            incrementLablel();
        }else if(op.equals(">")){
            String middle=getTemp(op1);
            quads.write("lb "+middle+" "+op1);
            op1="_temp_"+_temp_count;
            incrementTemp();
            String middle2=getTemp(op2);
            quads.write("lb "+middle2+" "+op2);
            op2="_temp_"+_temp_count;
            incrementTemp();
            quads.write("blt "+op1+" "+op2+" _lbl_"+_lbl_count);
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
        Set<Integer> keys=symbolTable.SymbolHashTable().keySet();
        for(Integer i: keys){
            SymbolTableNode temp= (SymbolTableNode) symbolTable.SymbolHashTable().get(i);
            while(temp!=null){
                if(temp.name.equals(s)){
                    return temp.tempType;
                }
                if(temp.child!=null){
                    temp=temp.child;

                }else if(temp.child==null){
                    break;
                }
            }
        }
        return s;
    }

    @Override
    public Void visitEndif(grmParser.EndifContext ctx) {
        try {
//            String temp=(ctx.parent.parent.getChild(1).getText());
//            quads.write("j _lbl_"+_lbl_count);
//            fallthroughlbl=_lbl_count;
//            incrementLablel();
        }catch(NullPointerException e){
            //there is no else
        }

        quads.write("_lbl_"+elselbl+" else");
        return super.visitEndif(ctx);
    }

    @Override
    public Void visitEndElse(grmParser.EndElseContext ctx) {
            quads.write("_lbl_"+fallthroughlbl+" fall");
            incrementLablel();

        return super.visitEndElse(ctx);
    }

    @Override
    public Void visitRcb(grmParser.RcbContext ctx) {
        quads.tabs--;
        try{
            String temp=ctx.parent.parent.parent.getChild(0).getText();
            if(temp.equals("while")){
                //quads.write("j _lbl_"+whilelbl.pop());
                //quads.write("_lbl_"+elselbl+" whileelse");
            }

        }catch(NullPointerException e){

        }

        return super.visitRcb(ctx);
    }


    @Override
    public Void visitPrintStatement(grmParser.PrintStatementContext ctx) {
        String s=ctx.getChild(2).getText();
        String temp="_temp_";
        if(checkType(s).equals("int")||checkType(s).equals("char")){
            temp=s+" intchar";
        }else if(checkType(s).equals("variable")){
            String num=getTemp(s);
            temp+=num+" var";
        }
        quads.write("lb $v0 "+temp);
        incrementTemp();
        quads.write("syscall");
        return super.visitPrintStatement(ctx);
    }

    @Override
    public Void visitStatement(grmParser.StatementContext ctx) {
        if(endIf==1){
            quads.write("j _lbl_"+_lbl_count);
            fallthroughlbl=_lbl_count;
            quads.write("_lbl_"+elselbl);
            endIf=0;
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

        }
        if(parser.ruleNames[ctx.parent.getRuleIndex()].equals("elseStatement")){


        }

        return super.visitStatement(ctx);
    }

    @Override
    public Void visitVarDecl(grmParser.VarDeclContext ctx) {
        localCount++;
        String tt=ctx.getText();
        while(tt.contains(",")){
            localCount++;
            tt=tt.substring(tt.indexOf(",")+1);
        }
        SymbolTableNode n=null;
        Set<Integer> keys=symbolTable.SymbolHashTable().keySet();
        for(Integer i: keys){
            SymbolTableNode temp= (SymbolTableNode) symbolTable.SymbolHashTable().get(i);
            while(temp!=null){
                if(temp.name.equals(ctx.getChild(1).getText())){
                    n=temp;
                    n.tempType="_temp_"+_temp_count;
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

        return super.visitVarDecl(ctx);
    }

    @Override
    public Void visitConstDecl(grmParser.ConstDeclContext ctx) {
        localCount++;
        return super.visitConstDecl(ctx);
    }
}
