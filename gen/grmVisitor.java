// Generated from C:/Users/MSE/IdeaProjects/MicroJava/src\grm.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link grmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface grmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link grmParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(grmParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link grmParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(grmParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link grmParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(grmParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link grmParser#constDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDecl(grmParser.ConstDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link grmParser#classDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecl(grmParser.ClassDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link grmParser#methodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDecl(grmParser.MethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link grmParser#formPars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormPars(grmParser.FormParsContext ctx);
	/**
	 * Visit a parse tree produced by {@link grmParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(grmParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link grmParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(grmParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link grmParser#actPars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActPars(grmParser.ActParsContext ctx);
	/**
	 * Visit a parse tree produced by {@link grmParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(grmParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grmParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(grmParser.RelopContext ctx);
	/**
	 * Visit a parse tree produced by {@link grmParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(grmParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link grmParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(grmParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link grmParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(grmParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link grmParser#designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignator(grmParser.DesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link grmParser#x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitX(grmParser.XContext ctx);
	/**
	 * Visit a parse tree produced by {@link grmParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarType(grmParser.VarTypeContext ctx);
}