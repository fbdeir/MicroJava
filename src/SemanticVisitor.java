import com.sun.java_cup.internal.runtime.Symbol;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;

import javax.naming.Context;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

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

        return super.visitParsTemp(ctx);
    }

    @Override
    public Void visitFormPars(grmParser.FormParsContext ctx) {
       String methodName=ctx.parent.getChild(1).toString();
        SymbolTableNode node=lexer.checkScopeNode(methodName);
        for(ParseTree tree: ctx.children){
        }

        return super.visitFormPars(ctx);
    }

    @Override
    public Void visitMethodDecl(grmParser.MethodDeclContext ctx){
        for(int y=0; y<ctx.getChild(3).getChildCount(); y++) {
            for (int i = 0; i < ctx.getChild(3).getChild(y).getChildCount(); i+=2) {
                SymbolTableNode n=null;
                Set<Integer> keys=lexer.symbolTable.SymbolHashTable().keySet();
                for(Integer k: keys){
                    SymbolTableNode temp= (SymbolTableNode) lexer.symbolTable.SymbolHashTable().get(k);
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
                n.parameters.add(ctx.getChild(3).getChild(y).getChild(i).getText());
                System.out.println(ctx.getChild(1).getText()+" "+ctx.getChild(3).getChild(y).getText()+" "+Arrays.toString(n.parameters.toArray()));
            }
        }

        return super.visitMethodDecl(ctx);
    }


    @Override
    public Void visitObject_call(grmParser.Object_callContext ctx) {
        return super.visitObject_call(ctx);
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
    public Void visitActPars(grmParser.ActParsContext ctx) {
        System.out.println(ctx.parent.getText());
        return super.visitActPars(ctx);
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
                ctx.getChild(1).getChild(0).getChild(0).getChild(0).getChild(0).getText();
            }catch(NullPointerException o){

            }
        }catch(NullPointerException  e){
            lexer.errors.write(ctx.parent.getChild(0).getChild(0).getText()+ "is not defined on line "+ctx.start.getLine());
        }

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
            if(!(tree.getText().equals("*")||tree.getText().equals("-")||tree.getText().equals("+")||tree.getText().equals("\\"))) {
                if(tree.getText().contains("[")){
                    String temptype=checkType(tree.getText().substring(0,tree.getText().indexOf("[")));
                    temptype=lexer.checkScopeNode(temptype).type;


                    if (type.equals("")) {
                        type = temptype;
                    }
                    if (!temptype.equals(type)) {

                        lexer.errors.write("jj Types are not equal" + ctx.start.getLine() + "\n");
                    } else {
                        type = temptype;
                    }
                }else {
                    if(! (parser.ruleNames[ctx.parent.parent.getRuleContext().getRuleIndex()]).equals("ex")) {
                        String temptype;
                        temptype = checkType(tree.getText());

                        if (type.equals("")) {
                            type = temptype;
                        }

                        if (!temptype.equals(type)) {
                            lexer.errors.write("Types are not equal" + ctx.start.getLine() + "\n");
                        } else {
                            type = temptype;
                        }
                    }
                }
            }
            i++;
        }
        return super.visitTerm(ctx);

    }
}
