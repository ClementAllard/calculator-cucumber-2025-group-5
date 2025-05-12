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
	 * Enter a parse tree produced by the {@code PrefixSimpleNumber}
	 * labeled alternative in {@link ExpressionParser#prefixExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrefixSimpleNumber(ExpressionParser.PrefixSimpleNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrefixSimpleNumber}
	 * labeled alternative in {@link ExpressionParser#prefixExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrefixSimpleNumber(ExpressionParser.PrefixSimpleNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#prefixNumber}.
	 * @param ctx the parse tree
	 */
	void enterPrefixNumber(ExpressionParser.PrefixNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#prefixNumber}.
	 * @param ctx the parse tree
	 */
	void exitPrefixNumber(ExpressionParser.PrefixNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrefixUnaryFunction}
	 * labeled alternative in {@link ExpressionParser#prefixfonction}.
	 * @param ctx the parse tree
	 */
	void enterPrefixUnaryFunction(ExpressionParser.PrefixUnaryFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrefixUnaryFunction}
	 * labeled alternative in {@link ExpressionParser#prefixfonction}.
	 * @param ctx the parse tree
	 */
	void exitPrefixUnaryFunction(ExpressionParser.PrefixUnaryFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrefixBinaryFunction}
	 * labeled alternative in {@link ExpressionParser#prefixfonction}.
	 * @param ctx the parse tree
	 */
	void enterPrefixBinaryFunction(ExpressionParser.PrefixBinaryFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrefixBinaryFunction}
	 * labeled alternative in {@link ExpressionParser#prefixfonction}.
	 * @param ctx the parse tree
	 */
	void exitPrefixBinaryFunction(ExpressionParser.PrefixBinaryFunctionContext ctx);
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
	 * Enter a parse tree produced by the {@code PostfixSimpleNumber}
	 * labeled alternative in {@link ExpressionParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void enterPostfixSimpleNumber(ExpressionParser.PostfixSimpleNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostfixSimpleNumber}
	 * labeled alternative in {@link ExpressionParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void exitPostfixSimpleNumber(ExpressionParser.PostfixSimpleNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#postfixNumber}.
	 * @param ctx the parse tree
	 */
	void enterPostfixNumber(ExpressionParser.PostfixNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#postfixNumber}.
	 * @param ctx the parse tree
	 */
	void exitPostfixNumber(ExpressionParser.PostfixNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostfixUnaryFunction}
	 * labeled alternative in {@link ExpressionParser#postfixfonction}.
	 * @param ctx the parse tree
	 */
	void enterPostfixUnaryFunction(ExpressionParser.PostfixUnaryFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostfixUnaryFunction}
	 * labeled alternative in {@link ExpressionParser#postfixfonction}.
	 * @param ctx the parse tree
	 */
	void exitPostfixUnaryFunction(ExpressionParser.PostfixUnaryFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostfixBinaryFunction}
	 * labeled alternative in {@link ExpressionParser#postfixfonction}.
	 * @param ctx the parse tree
	 */
	void enterPostfixBinaryFunction(ExpressionParser.PostfixBinaryFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostfixBinaryFunction}
	 * labeled alternative in {@link ExpressionParser#postfixfonction}.
	 * @param ctx the parse tree
	 */
	void exitPostfixBinaryFunction(ExpressionParser.PostfixBinaryFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#infixExpr}.
	 * @param ctx the parse tree
	 */
	void enterInfixExpr(ExpressionParser.InfixExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#infixExpr}.
	 * @param ctx the parse tree
	 */
	void exitInfixExpr(ExpressionParser.InfixExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#infixExprLogic}.
	 * @param ctx the parse tree
	 */
	void enterInfixExprLogic(ExpressionParser.InfixExprLogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#infixExprLogic}.
	 * @param ctx the parse tree
	 */
	void exitInfixExprLogic(ExpressionParser.InfixExprLogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#infixExprBitwise}.
	 * @param ctx the parse tree
	 */
	void enterInfixExprBitwise(ExpressionParser.InfixExprBitwiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#infixExprBitwise}.
	 * @param ctx the parse tree
	 */
	void exitInfixExprBitwise(ExpressionParser.InfixExprBitwiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#infixExprPrio1}.
	 * @param ctx the parse tree
	 */
	void enterInfixExprPrio1(ExpressionParser.InfixExprPrio1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#infixExprPrio1}.
	 * @param ctx the parse tree
	 */
	void exitInfixExprPrio1(ExpressionParser.InfixExprPrio1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#infixExprPrio2}.
	 * @param ctx the parse tree
	 */
	void enterInfixExprPrio2(ExpressionParser.InfixExprPrio2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#infixExprPrio2}.
	 * @param ctx the parse tree
	 */
	void exitInfixExprPrio2(ExpressionParser.InfixExprPrio2Context ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#infixExprPrio3}.
	 * @param ctx the parse tree
	 */
	void enterInfixExprPrio3(ExpressionParser.InfixExprPrio3Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#infixExprPrio3}.
	 * @param ctx the parse tree
	 */
	void exitInfixExprPrio3(ExpressionParser.InfixExprPrio3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code InfixExpressionSigned}
	 * labeled alternative in {@link ExpressionParser#infixExprPrio4}.
	 * @param ctx the parse tree
	 */
	void enterInfixExpressionSigned(ExpressionParser.InfixExpressionSignedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InfixExpressionSigned}
	 * labeled alternative in {@link ExpressionParser#infixExprPrio4}.
	 * @param ctx the parse tree
	 */
	void exitInfixExpressionSigned(ExpressionParser.InfixExpressionSignedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InfixExpressionWithParenthesis}
	 * labeled alternative in {@link ExpressionParser#infixExprPrio4}.
	 * @param ctx the parse tree
	 */
	void enterInfixExpressionWithParenthesis(ExpressionParser.InfixExpressionWithParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InfixExpressionWithParenthesis}
	 * labeled alternative in {@link ExpressionParser#infixExprPrio4}.
	 * @param ctx the parse tree
	 */
	void exitInfixExpressionWithParenthesis(ExpressionParser.InfixExpressionWithParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InfixFunc}
	 * labeled alternative in {@link ExpressionParser#infixExprPrio4}.
	 * @param ctx the parse tree
	 */
	void enterInfixFunc(ExpressionParser.InfixFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InfixFunc}
	 * labeled alternative in {@link ExpressionParser#infixExprPrio4}.
	 * @param ctx the parse tree
	 */
	void exitInfixFunc(ExpressionParser.InfixFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComplexNumber}
	 * labeled alternative in {@link ExpressionParser#infixExprPrio4}.
	 * @param ctx the parse tree
	 */
	void enterComplexNumber(ExpressionParser.ComplexNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComplexNumber}
	 * labeled alternative in {@link ExpressionParser#infixExprPrio4}.
	 * @param ctx the parse tree
	 */
	void exitComplexNumber(ExpressionParser.ComplexNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InfixSimpleNumber}
	 * labeled alternative in {@link ExpressionParser#infixExprPrio4}.
	 * @param ctx the parse tree
	 */
	void enterInfixSimpleNumber(ExpressionParser.InfixSimpleNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InfixSimpleNumber}
	 * labeled alternative in {@link ExpressionParser#infixExprPrio4}.
	 * @param ctx the parse tree
	 */
	void exitInfixSimpleNumber(ExpressionParser.InfixSimpleNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InfixUnaryFunction}
	 * labeled alternative in {@link ExpressionParser#infixfunction}.
	 * @param ctx the parse tree
	 */
	void enterInfixUnaryFunction(ExpressionParser.InfixUnaryFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InfixUnaryFunction}
	 * labeled alternative in {@link ExpressionParser#infixfunction}.
	 * @param ctx the parse tree
	 */
	void exitInfixUnaryFunction(ExpressionParser.InfixUnaryFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InfixBinaryFunction}
	 * labeled alternative in {@link ExpressionParser#infixfunction}.
	 * @param ctx the parse tree
	 */
	void enterInfixBinaryFunction(ExpressionParser.InfixBinaryFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InfixBinaryFunction}
	 * labeled alternative in {@link ExpressionParser#infixfunction}.
	 * @param ctx the parse tree
	 */
	void exitInfixBinaryFunction(ExpressionParser.InfixBinaryFunctionContext ctx);
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
	 * Enter a parse tree produced by the {@code ScientificAtom}
	 * labeled alternative in {@link ExpressionParser#number}.
	 * @param ctx the parse tree
	 */
	void enterScientificAtom(ExpressionParser.ScientificAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ScientificAtom}
	 * labeled alternative in {@link ExpressionParser#number}.
	 * @param ctx the parse tree
	 */
	void exitScientificAtom(ExpressionParser.ScientificAtomContext ctx);
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
	 * Enter a parse tree produced by the {@code ENumber}
	 * labeled alternative in {@link ExpressionParser#number}.
	 * @param ctx the parse tree
	 */
	void enterENumber(ExpressionParser.ENumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ENumber}
	 * labeled alternative in {@link ExpressionParser#number}.
	 * @param ctx the parse tree
	 */
	void exitENumber(ExpressionParser.ENumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PercentageAtom}
	 * labeled alternative in {@link ExpressionParser#number}.
	 * @param ctx the parse tree
	 */
	void enterPercentageAtom(ExpressionParser.PercentageAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PercentageAtom}
	 * labeled alternative in {@link ExpressionParser#number}.
	 * @param ctx the parse tree
	 */
	void exitPercentageAtom(ExpressionParser.PercentageAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolAtom}
	 * labeled alternative in {@link ExpressionParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBoolAtom(ExpressionParser.BoolAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolAtom}
	 * labeled alternative in {@link ExpressionParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBoolAtom(ExpressionParser.BoolAtomContext ctx);
}