import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Set;

public class QuadrupleVisitor extends grmBaseVisitor<Void> {
    grmLexer lexer;
    grmParser parser;
    String _temp_count=(String.format("%04d", 0));
    String _lbl_count=(String.format("%04d", 0));
    int localCount=0;
    SymbolHashTable symbolTable;
    int tabs=0;

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

        if(ctx.getChild(1).getText().equals("main")){
            quads.write("JUMP main");
        }else{
            //System.out.println(ctx.getChild(1).getText());
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
            quads.write("PROC " +n.parameters.size()+" " +n.name);
        }
        quads.write("LABEL "+ctx.getChild(1).getText());
        quads.tabs++;
        return super.visitMethodDecl(ctx);
    }

    @Override
    public Void visitIfStatment(grmParser.IfStatmentContext ctx) {
        String op=ctx.getChild(2).getChild(1).getText();
        String op1=ctx.getChild(2).getChild(0).getText();
        String op2=ctx.getChild(2).getChild(2).getText();
        if(op.equals("==")){
           // System.out.println("NEQI _temp_"+_temp_count +" "+op1+" "+op2);
            int i=ctx.parent.parent.getChild(1).getChild(0).getChildCount();
                while(!(ctx.parent.parent.getChild(1).getChild(0).getChild(i-1).getText().substring(0,5)).equals("else")){
                    i--;
                }
                if(i>=0){
                    System.out.println("ELSELABEL _lbl_"+_lbl_count);
                    quads.tabs++;
                }
                else if(i<0){
                    //there is no else statement
                }
                System.out.println();

            incrementTemp();
        }
        return super.visitIfStatment(ctx);
    }


//    @Override
//    public Void visitCondition(grmParser.ConditionContext ctx) {
//        String op1=ctx.getChild(0).getText();
//        String op2=ctx.getChild(2).getText();
//        String op=ctx.getChild(1).getText();
//        if(op.equals("==")){
//            quads.write("NEQI _temp_"+_temp_count+" "+op1+" "+op2);
//            System.out.println(ctx.parent.parent.parent.getChild(2).getText());
//            incrementTemp();
//        }
//        return super.visitCondition(ctx);
//    }

    @Override
    public Void visitRcb(grmParser.RcbContext ctx) {
        return super.visitRcb(ctx);
    }

    @Override
    public Void visitBlock(grmParser.BlockContext ctx) {
        if(localCount>0) {
            quads.write("LOCALS " + localCount);
            localCount = 0;
        }
        quads.tabs--;
        return super.visitBlock(ctx);
    }

    @Override
    public Void visitStatement(grmParser.StatementContext ctx) {
        if(ctx.getChild(0).getText().equals("print")){
            Quadruple load=new Quadruple("LDC", "_temp_"+_temp_count,  ctx.getChild(2).getText(), "");
            Quadruple q=new Quadruple("print", "_temp_"+_temp_count,"","");
            incrementTemp();
            quads.write(load.toString());
            quads.write(q.toString());
        }
        return super.visitStatement(ctx);
    }

    @Override
    public Void visitVarDecl(grmParser.VarDeclContext ctx) {
        localCount++;
        String temp=ctx.getText();
        while(temp.contains(",")){
            localCount++;
            temp=temp.substring(temp.indexOf(",")+1);

        }
        return super.visitVarDecl(ctx);
    }

    @Override
    public Void visitConstDecl(grmParser.ConstDeclContext ctx) {
        localCount++;
        return super.visitConstDecl(ctx);
    }
}
