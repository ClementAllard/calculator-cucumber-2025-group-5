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
	 * Visit a parse tree produced by the {@code PrefixNumber}
	 * labeled alternative in {@link ExpressionParser#prefixExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixNumber(ExpressionParser.PrefixNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostfixExpression}
	 * labeled alternative in {@link ExpressionParser#postfixExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(ExpressionParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostfixNumber}
	 * labeled alternative in {@link ExpressionParser#postfixExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixNumber(ExpressionParser.PostfixNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleTerm}
	 * labeled alternative in {@link ExpressionParser#infixExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTerm(ExpressionParser.SingleTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InfixExpressionAddSub}
	 * labeled alternative in {@link ExpressionParser#infixExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixExpressionAddSub(ExpressionParser.InfixExpressionAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InfixExpressionImplicitMul}
	 * labeled alternative in {@link ExpressionParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixExpressionImplicitMul(ExpressionParser.InfixExpressionImplicitMulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InfixExpressionMulDiv}
	 * labeled alternative in {@link ExpressionParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixExpressionMulDiv(ExpressionParser.InfixExpressionMulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleFactor}
	 * labeled alternative in {@link ExpressionParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleFactor(ExpressionParser.SingleFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InfixExpressionWithParenthesis}
	 * labeled alternative in {@link ExpressionParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixExpressionWithParenthesis(ExpressionParser.InfixExpressionWithParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InfixExpressionNegate}
	 * labeled alternative in {@link ExpressionParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixExpressionNegate(ExpressionParser.InfixExpressionNegateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FactorNumber}
	 * labeled alternative in {@link ExpressionParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorNumber(ExpressionParser.FactorNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryFunction}
	 * labeled alternative in {@link ExpressionParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryFunction(ExpressionParser.UnaryFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComplexAtom}
	 * labeled alternative in {@link ExpressionParser#complex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexAtom(ExpressionParser.ComplexAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotComplex}
	 * labeled alternative in {@link ExpressionParser#complex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotComplex(ExpressionParser.NotComplexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ScientificAtom}
	 * labeled alternative in {@link ExpressionParser#scientific}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientificAtom(ExpressionParser.ScientificAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotScientific}
	 * labeled alternative in {@link ExpressionParser#scientific}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotScientific(ExpressionParser.NotScientificContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegateAtom}
	 * labeled alternative in {@link ExpressionParser#negatenumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegateAtom(ExpressionParser.NegateAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleAtom}
	 * labeled alternative in {@link ExpressionParser#negatenumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleAtom(ExpressionParser.SimpleAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PositiveAtom}
	 * labeled alternative in {@link ExpressionParser#negatenumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositiveAtom(ExpressionParser.PositiveAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RationalNumber}
	 * labeled alternative in {@link ExpressionParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRationalNumber(ExpressionParser.RationalNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntergerAtom}
	 * labeled alternative in {@link ExpressionParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntergerAtom(ExpressionParser.IntergerAtomContext ctx);
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
	 * Visit a parse tree produced by the {@code RationalAtom}
	 * labeled alternative in {@link ExpressionParser#rational}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRationalAtom(ExpressionParser.RationalAtomContext ctx);
}