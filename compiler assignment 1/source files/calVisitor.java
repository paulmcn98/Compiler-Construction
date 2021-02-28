// Generated from cal.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link calParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface calVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link calParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(calParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#dec_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_list(calParser.Dec_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(calParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(calParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#const_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_decl(calParser.Const_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#function_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_list(calParser.Function_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(calParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(calParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(calParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#nemp_parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNemp_parameter_list(calParser.Nemp_parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(calParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#statement_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_block(calParser.Statement_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(calParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(calParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#binary_arith_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_arith_op(calParser.Binary_arith_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#frag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrag(calParser.FragContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(calParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_op(calParser.Comp_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_list(calParser.Arg_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#nemp_arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNemp_arg_list(calParser.Nemp_arg_listContext ctx);
}