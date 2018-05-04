// Generated from C:/Users/MSE/IdeaProjects/MicroJava/src\grm.g4 by ANTLR 4.7

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.Set;

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
	 * Visit a parse tree produced by {@link grmParser#constDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDecl(grmParser.ConstDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link grmParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(grmParser.VarDeclContext ctx);
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
	 * Visit a parse tree produced by {@link grmParser#parsTemp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParsTemp(grmParser.ParsTempContext ctx);
	/**
	 * Visit a parse tree produced by {@link grmParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(grmParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link grmParser#rcb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRcb(grmParser.RcbContext ctx);
	/**
	 * Visit a parse tree produced by {@link grmParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(grmParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link grmParser#ifStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatment(grmParser.IfStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link grmParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(grmParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link grmParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(grmParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link grmParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(grmParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link grmParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(grmParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link grmParser#assign_helper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_helper(grmParser.Assign_helperContext ctx);
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
	 * Visit a parse tree produced by {@link grmParser#d}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitD(grmParser.DContext ctx);
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
	 * Visit a parse tree produced by {@link grmParser#array_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_call(grmParser.Array_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link grmParser#object_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_call(grmParser.Object_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link grmParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarType(grmParser.VarTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link grmParser#ex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEx(grmParser.ExContext ctx);
	/**
	 * Visit a parse tree produced by {@link grmParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(grmParser.IdentContext ctx);
}