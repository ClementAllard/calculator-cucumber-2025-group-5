// Generated from Expression.g4 by ANTLR 4.13.2
package helper.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ExpressionParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrefixExpression}
	 * labeled alternative in {@link ExpressionParser#prefixExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixExpression(ExpressionParser.PrefixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrefixSimpleNumber}
	 * labeled alternative in {@link ExpressionParser#prefixExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixSimpleNumber(ExpressionParser.PrefixSimpleNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#prefixNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixNumber(ExpressionParser.PrefixNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrefixUnaryFunction}
	 * labeled alternative in {@link ExpressionParser#prefixfonction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixUnaryFunction(ExpressionParser.PrefixUnaryFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrefixBinaryFunction}
	 * labeled alternative in {@link ExpressionParser#prefixfonction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixBinaryFunction(ExpressionParser.PrefixBinaryFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostfixExpression}
	 * labeled alternative in {@link ExpressionParser#postfixExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(ExpressionParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostfixSimpleNumber}
	 * labeled alternative in {@link ExpressionParser#postfixExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixSimpleNumber(ExpressionParser.PostfixSimpleNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#postfixNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixNumber(ExpressionParser.PostfixNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostfixUnaryFunction}
	 * labeled alternative in {@link ExpressionParser#postfixfonction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixUnaryFunction(ExpressionParser.PostfixUnaryFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostfixBinaryFunction}
	 * labeled alternative in {@link ExpressionParser#postfixfonction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixBinaryFunction(ExpressionParser.PostfixBinaryFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#infixExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixExpr(ExpressionParser.InfixExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#infixExprBitwisePrio1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixExprBitwisePrio1(ExpressionParser.InfixExprBitwisePrio1Context ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#infixExprBitwisePrio2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixExprBitwisePrio2(ExpressionParser.InfixExprBitwisePrio2Context ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#infixExprBitwisePrio3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixExprBitwisePrio3(ExpressionParser.InfixExprBitwisePrio3Context ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#infixExprLogicPrio1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixExprLogicPrio1(ExpressionParser.InfixExprLogicPrio1Context ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#infixExprLogicPrio2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixExprLogicPrio2(ExpressionParser.InfixExprLogicPrio2Context ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#infixExprPrio1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixExprPrio1(ExpressionParser.InfixExprPrio1Context ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#infixExprPrio2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixExprPrio2(ExpressionParser.InfixExprPrio2Context ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#infixExprPrio3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixExprPrio3(ExpressionParser.InfixExprPrio3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code InfixExpressionSigned}
	 * labeled alternative in {@link ExpressionParser#infixExprPrio4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixExpressionSigned(ExpressionParser.InfixExpressionSignedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InfixExpressionWithParenthesis}
	 * labeled alternative in {@link ExpressionParser#infixExprPrio4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixExpressionWithParenthesis(ExpressionParser.InfixExpressionWithParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InfixFunc}
	 * labeled alternative in {@link ExpressionParser#infixExprPrio4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixFunc(ExpressionParser.InfixFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComplexNumber}
	 * labeled alternative in {@link ExpressionParser#infixExprPrio4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexNumber(ExpressionParser.ComplexNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InfixSimpleNumber}
	 * labeled alternative in {@link ExpressionParser#infixExprPrio4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixSimpleNumber(ExpressionParser.InfixSimpleNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InfixUnaryFunction}
	 * labeled alternative in {@link ExpressionParser#infixfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixUnaryFunction(ExpressionParser.InfixUnaryFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InfixBinaryFunction}
	 * labeled alternative in {@link ExpressionParser#infixfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixBinaryFunction(ExpressionParser.InfixBinaryFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComplexAtom}
	 * labeled alternative in {@link ExpressionParser#complex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexAtom(ExpressionParser.ComplexAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Percentage}
	 * labeled alternative in {@link ExpressionParser#complex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPercentage(ExpressionParser.PercentageContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ScientificAtom}
	 * labeled alternative in {@link ExpressionParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientificAtom(ExpressionParser.ScientificAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntegerAtom}
	 * labeled alternative in {@link ExpressionParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerAtom(ExpressionParser.IntegerAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RealAtom}
	 * labeled alternative in {@link ExpressionParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealAtom(ExpressionParser.RealAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PiNumber}
	 * labeled alternative in {@link ExpressionParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPiNumber(ExpressionParser.PiNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ENumber}
	 * labeled alternative in {@link ExpressionParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitENumber(ExpressionParser.ENumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstantAtom}
	 * labeled alternative in {@link ExpressionParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantAtom(ExpressionParser.ConstantAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolAtom}
	 * labeled alternative in {@link ExpressionParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolAtom(ExpressionParser.BoolAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BaseIntegerAtom}
	 * labeled alternative in {@link ExpressionParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseIntegerAtom(ExpressionParser.BaseIntegerAtomContext ctx);
}