import com.sun.java_cup.internal.runtime.Symbol;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;

import javax.naming.Context;
import java.util.Arrays;

public class SemanticVisitor extends grmBaseVisitor<Void> {
    grmLexer lexer;
    grmParser parser;
    String type="";

    public void setLexer(grmLexer lexer){
        this.lexer=lexer;
    }

    public void setParser(grmParser parser) {
        this.parser=parser;
    }
    public String checkType(String x){
        try{
            Integer.parseInt(x);
            return "int";
        }catch(NumberFormatException e){
            return "char";
        }
    }
    @Override
    public Void visitProg(grmParser.ProgContext ctx) {

        //System.out.println(ctx.getText());
        return super.visitProg(ctx);
    }

    @Override
    public Void visitExpr(grmParser.ExprContext ctx) {
        int i=0;
        /*for(ParseTree tree:ctx.children){
            System.out.println(i+" "+ctx.getChild(i).getText());
        }*/
        return super.visitExpr(ctx);
    }

    @Override
    public Void visitDesignator(grmParser.DesignatorContext ctx) {
            try{
                SymbolTableNode node=lexer.checkScopeNode(ctx.getChild(0).getText());
                type = node.type;
            }catch(NullPointerException e) {
                lexer.errors.write(ctx.getChild(0).getText() + " is not defined\n");
            }

        return super.visitDesignator(ctx);
    }



    @Override
    public Void visitParsTemp(grmParser.ParsTempContext ctx) {
        int i=0;
        Boolean book=lexer.checkScope("foo");
        for(ParseTree tree: ctx.children){
            if (i>0) break;
            try {
                //System.out.println(book);
                //node.parameters.add(tree.getText());
            }catch(NullPointerException e){
                //lexer.printSymbolTable();
                //System.out.println("empty: "+tree.getText());
            }
        }
        return super.visitParsTemp(ctx);
    }

    @Override
    public Void visitFormPars(grmParser.FormParsContext ctx) {
       String methodName=ctx.parent.getChild(1).toString();
        SymbolTableNode node=lexer.checkScopeNode(methodName);
        for(ParseTree tree: ctx.children){
            //System.out.println("curr "+tree.getText());
        }

        return super.visitFormPars(ctx);
    }

    @Override
    public Void visitMethodDecl(grmParser.MethodDeclContext ctx) {
        for(int i=0; i<ctx.getChild(2).getChildCount(); i++){
         // System.out.println("parr "+ctx.getChild(2).getChild(0).getChild(i));
        }
        //SymbolTableNode node=lexer.checkScopeNode(methodName);
        //System.out.println("parr"+ ctx.getChild(3));
        return super.visitMethodDecl(ctx);
    }

    @Override
    public Void visitEx(grmParser.ExContext ctx) {
        //wrong because 3*-3
            String[] tokens = ctx.getText().split("[*|+|-]");
            int isexp = 0;
            for (String t : tokens
                    ) {
                try {
                    Integer.parseInt(t);
                } catch (NumberFormatException e) {
                    if (t.equals("")) {
                        //this is wrong because what if -?
                        lexer.errors.write("Index must be integer at line " + ctx.start.getLine() + "\n");
                    }
                }
            }

        return super.visitEx(ctx);
    }


    @Override
    public Void visitArray_call(grmParser.Array_callContext ctx) {
        //if(ctx.getChildCount()>=2){
            System.out.println(ctx.getChildCount());
        //}
        return super.visitArray_call(ctx);
    }

    @Override
    public Void visitAssignment(grmParser.AssignmentContext ctx) {

        return super.visitAssignment(ctx);
    }

    @Override
    public Void visitAssign_helper(grmParser.Assign_helperContext ctx) {
        String rhs=ctx.parent.getChild(0).getChild(0).getText();
        try{
            SymbolTableNode nod = lexer.checkScopeNode(rhs);
            if (nod.isFinal == 1) {
                lexer.errors.write("is final " + ctx.start.getLine()+"\n");
            }
            try {
                System.out.println("ass " + ctx.getChild(1).getChild(0).getChild(0).getChild(0).getChild(0).getText());
            }catch(NullPointerException o){

            }
        }catch(NullPointerException  e){
            lexer.errors.write(ctx.parent.getChild(0).getChild(0).getText()+ "is not defined on line "+ctx.start.getLine());
        }


        //ParseTree tree=ctx.getChild(1);
        /*if(!type.equals(type2)){
            System.out.println("wrong assignment type");
        }*/
        int i=0;


        return super.visitAssign_helper(ctx);
    }

    @Override
    public Void visitReturnStatement(grmParser.ReturnStatementContext ctx) {
        String methodType=ctx.parent.parent.parent.getChild(0).toString();
        String returntype=checkType(ctx.getChild(1).getText());
        if(!methodType.equals(returntype)){
            lexer.errors.write("Wrong return type"+ctx.start.getLine()+"\n");
        }
        return super.visitReturnStatement(ctx);
    }

    @Override
    public Void visitConstDecl(grmParser.ConstDeclContext ctx) {

        lexer.checkScopeNode(ctx.getChild(2).getText()).isFinal = 1;

        return super.visitConstDecl(ctx);
    }

    @Override
    public Void visitVarDecl(grmParser.VarDeclContext ctx) {
        return super.visitVarDecl(ctx);
    }

    @Override
    public Void visitTerm(grmParser.TermContext ctx) {
        int i=0;
        for(ParseTree tree:ctx.children){
            String temptype;
            temptype=checkType(tree.getText());
            System.out.println(tree.getText());
            if(type.equals("")){
               type=temptype;
            }
            if(!temptype.equals(type)){
                lexer.errors.write("Types are not equal"+ctx.start.getLine()+"\n");
            }else{
                type=temptype;
            }

            //System.out.println(i+" "+tree.getText());
            i++;
        }

        //System.out.println(ctx.getText()+" type "+type);
        return super.visitTerm(ctx);

    }

    /*@Override
    public Void visitFactor(grmParser.TermContext ctx){

    }*/
    @Override
    public Void visitFactor(grmParser.FactorContext ctx) {
        //System.out.println(Arrays.toString(ctx.children.toArray()));
        return super.visitFactor(ctx);
    }
}
