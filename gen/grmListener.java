// Generated from C:/Users/MSE/IdeaProjects/MicroJava/src\grm.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grmParser}.
 */
public interface grmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grmParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(grmParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(grmParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(grmParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(grmParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(grmParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(grmParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstDecl(grmParser.ConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstDecl(grmParser.ConstDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(grmParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(grmParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(grmParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(grmParser.MethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmParser#formPars}.
	 * @param ctx the parse tree
	 */
	void enterFormPars(grmParser.FormParsContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmParser#formPars}.
	 * @param ctx the parse tree
	 */
	void exitFormPars(grmParser.FormParsContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(grmParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(grmParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(grmParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(grmParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmParser#actPars}.
	 * @param ctx the parse tree
	 */
	void enterActPars(grmParser.ActParsContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmParser#actPars}.
	 * @param ctx the parse tree
	 */
	void exitActPars(grmParser.ActParsContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(grmParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(grmParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(grmParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(grmParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(grmParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(grmParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(grmParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(grmParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(grmParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(grmParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(grmParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(grmParser.DesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmParser#x}.
	 * @param ctx the parse tree
	 */
	void enterX(grmParser.XContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmParser#x}.
	 * @param ctx the parse tree
	 */
	void exitX(grmParser.XContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(grmParser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(grmParser.VarTypeContext ctx);
}