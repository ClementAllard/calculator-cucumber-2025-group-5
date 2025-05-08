// Generated from Expression.g4 by ANTLR 4.13.2
package helper.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionParser}.
 */
public interface ExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExpressionParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExpressionParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrefixExpression}
	 * labeled alternative in {@link ExpressionParser#prefixExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrefixExpression(ExpressionParser.PrefixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrefixExpression}
	 * labeled alternative in {@link ExpressionParser#prefixExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrefixExpression(ExpressionParser.PrefixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrefixNumber}
	 * labeled alternative in {@link ExpressionParser#prefixExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrefixNumber(ExpressionParser.PrefixNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrefixNumber}
	 * labeled alternative in {@link ExpressionParser#prefixExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrefixNumber(ExpressionParser.PrefixNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostfixExpression}
	 * labeled alternative in {@link ExpressionParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(ExpressionParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostfixExpression}
	 * labeled alternative in {@link ExpressionParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(ExpressionParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostfixNumber}
	 * labeled alternative in {@link ExpressionParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void enterPostfixNumber(ExpressionParser.PostfixNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostfixNumber}
	 * labeled alternative in {@link ExpressionParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void exitPostfixNumber(ExpressionParser.PostfixNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleTerm}
	 * labeled alternative in {@link ExpressionParser#infixExpr}.
	 * @param ctx the parse tree
	 */
	void enterSingleTerm(ExpressionParser.SingleTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleTerm}
	 * labeled alternative in {@link ExpressionParser#infixExpr}.
	 * @param ctx the parse tree
	 */
	void exitSingleTerm(ExpressionParser.SingleTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InfixExpressionAddSub}
	 * labeled alternative in {@link ExpressionParser#infixExpr}.
	 * @param ctx the parse tree
	 */
	void enterInfixExpressionAddSub(ExpressionParser.InfixExpressionAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InfixExpressionAddSub}
	 * labeled alternative in {@link ExpressionParser#infixExpr}.
	 * @param ctx the parse tree
	 */
	void exitInfixExpressionAddSub(ExpressionParser.InfixExpressionAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InfixExpressionImplicitMul}
	 * labeled alternative in {@link ExpressionParser#term}.
	 * @param ctx the parse tree
	 */
	void enterInfixExpressionImplicitMul(ExpressionParser.InfixExpressionImplicitMulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InfixExpressionImplicitMul}
	 * labeled alternative in {@link ExpressionParser#term}.
	 * @param ctx the parse tree
	 */
	void exitInfixExpressionImplicitMul(ExpressionParser.InfixExpressionImplicitMulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InfixExpressionMulDiv}
	 * labeled alternative in {@link ExpressionParser#term}.
	 * @param ctx the parse tree
	 */
	void enterInfixExpressionMulDiv(ExpressionParser.InfixExpressionMulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InfixExpressionMulDiv}
	 * labeled alternative in {@link ExpressionParser#term}.
	 * @param ctx the parse tree
	 */
	void exitInfixExpressionMulDiv(ExpressionParser.InfixExpressionMulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleFactor}
	 * labeled alternative in {@link ExpressionParser#term}.
	 * @param ctx the parse tree
	 */
	void enterSingleFactor(ExpressionParser.SingleFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleFactor}
	 * labeled alternative in {@link ExpressionParser#term}.
	 * @param ctx the parse tree
	 */
	void exitSingleFactor(ExpressionParser.SingleFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InfixExpressionWithParenthesis}
	 * labeled alternative in {@link ExpressionParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterInfixExpressionWithParenthesis(ExpressionParser.InfixExpressionWithParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InfixExpressionWithParenthesis}
	 * labeled alternative in {@link ExpressionParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitInfixExpressionWithParenthesis(ExpressionParser.InfixExpressionWithParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InfixExpressionNegate}
	 * labeled alternative in {@link ExpressionParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterInfixExpressionNegate(ExpressionParser.InfixExpressionNegateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InfixExpressionNegate}
	 * labeled alternative in {@link ExpressionParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitInfixExpressionNegate(ExpressionParser.InfixExpressionNegateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FactorNumber}
	 * labeled alternative in {@link ExpressionParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorNumber(ExpressionParser.FactorNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FactorNumber}
	 * labeled alternative in {@link ExpressionParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorNumber(ExpressionParser.FactorNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryFunction}
	 * labeled alternative in {@link ExpressionParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterUnaryFunction(ExpressionParser.UnaryFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryFunction}
	 * labeled alternative in {@link ExpressionParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitUnaryFunction(ExpressionParser.UnaryFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryFunction}
	 * labeled alternative in {@link ExpressionParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterBinaryFunction(ExpressionParser.BinaryFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryFunction}
	 * labeled alternative in {@link ExpressionParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitBinaryFunction(ExpressionParser.BinaryFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComplexAtom}
	 * labeled alternative in {@link ExpressionParser#complex}.
	 * @param ctx the parse tree
	 */
	void enterComplexAtom(ExpressionParser.ComplexAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComplexAtom}
	 * labeled alternative in {@link ExpressionParser#complex}.
	 * @param ctx the parse tree
	 */
	void exitComplexAtom(ExpressionParser.ComplexAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotComplex}
	 * labeled alternative in {@link ExpressionParser#complex}.
	 * @param ctx the parse tree
	 */
	void enterNotComplex(ExpressionParser.NotComplexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotComplex}
	 * labeled alternative in {@link ExpressionParser#complex}.
	 * @param ctx the parse tree
	 */
	void exitNotComplex(ExpressionParser.NotComplexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ENumber}
	 * labeled alternative in {@link ExpressionParser#scientific}.
	 * @param ctx the parse tree
	 */
	void enterENumber(ExpressionParser.ENumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ENumber}
	 * labeled alternative in {@link ExpressionParser#scientific}.
	 * @param ctx the parse tree
	 */
	void exitENumber(ExpressionParser.ENumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ScientificAtom}
	 * labeled alternative in {@link ExpressionParser#scientific}.
	 * @param ctx the parse tree
	 */
	void enterScientificAtom(ExpressionParser.ScientificAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ScientificAtom}
	 * labeled alternative in {@link ExpressionParser#scientific}.
	 * @param ctx the parse tree
	 */
	void exitScientificAtom(ExpressionParser.ScientificAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotScientific}
	 * labeled alternative in {@link ExpressionParser#scientific}.
	 * @param ctx the parse tree
	 */
	void enterNotScientific(ExpressionParser.NotScientificContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotScientific}
	 * labeled alternative in {@link ExpressionParser#scientific}.
	 * @param ctx the parse tree
	 */
	void exitNotScientific(ExpressionParser.NotScientificContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegateAtom}
	 * labeled alternative in {@link ExpressionParser#negatenumber}.
	 * @param ctx the parse tree
	 */
	void enterNegateAtom(ExpressionParser.NegateAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegateAtom}
	 * labeled alternative in {@link ExpressionParser#negatenumber}.
	 * @param ctx the parse tree
	 */
	void exitNegateAtom(ExpressionParser.NegateAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleAtom}
	 * labeled alternative in {@link ExpressionParser#negatenumber}.
	 * @param ctx the parse tree
	 */
	void enterSimpleAtom(ExpressionParser.SimpleAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleAtom}
	 * labeled alternative in {@link ExpressionParser#negatenumber}.
	 * @param ctx the parse tree
	 */
	void exitSimpleAtom(ExpressionParser.SimpleAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PositiveAtom}
	 * labeled alternative in {@link ExpressionParser#negatenumber}.
	 * @param ctx the parse tree
	 */
	void enterPositiveAtom(ExpressionParser.PositiveAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PositiveAtom}
	 * labeled alternative in {@link ExpressionParser#negatenumber}.
	 * @param ctx the parse tree
	 */
	void exitPositiveAtom(ExpressionParser.PositiveAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RationalNumber}
	 * labeled alternative in {@link ExpressionParser#number}.
	 * @param ctx the parse tree
	 */
	void enterRationalNumber(ExpressionParser.RationalNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RationalNumber}
	 * labeled alternative in {@link ExpressionParser#number}.
	 * @param ctx the parse tree
	 */
	void exitRationalNumber(ExpressionParser.RationalNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntergerAtom}
	 * labeled alternative in {@link ExpressionParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntergerAtom(ExpressionParser.IntergerAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntergerAtom}
	 * labeled alternative in {@link ExpressionParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntergerAtom(ExpressionParser.IntergerAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RealAtom}
	 * labeled alternative in {@link ExpressionParser#number}.
	 * @param ctx the parse tree
	 */
	void enterRealAtom(ExpressionParser.RealAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RealAtom}
	 * labeled alternative in {@link ExpressionParser#number}.
	 * @param ctx the parse tree
	 */
	void exitRealAtom(ExpressionParser.RealAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PiNumber}
	 * labeled alternative in {@link ExpressionParser#number}.
	 * @param ctx the parse tree
	 */
	void enterPiNumber(ExpressionParser.PiNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PiNumber}
	 * labeled alternative in {@link ExpressionParser#number}.
	 * @param ctx the parse tree
	 */
	void exitPiNumber(ExpressionParser.PiNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RationalAtom}
	 * labeled alternative in {@link ExpressionParser#rational}.
	 * @param ctx the parse tree
	 */
	void enterRationalAtom(ExpressionParser.RationalAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RationalAtom}
	 * labeled alternative in {@link ExpressionParser#rational}.
	 * @param ctx the parse tree
	 */
	void exitRationalAtom(ExpressionParser.RationalAtomContext ctx);
}