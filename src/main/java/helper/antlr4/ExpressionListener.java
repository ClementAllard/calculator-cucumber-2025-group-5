package helper.antlr4;
// Generated from Expression.g4 by ANTLR 4.13.2
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
	 * Enter a parse tree produced by the {@code PrefixOperation}
	 * labeled alternative in {@link ExpressionParser#prefixExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrefixOperation(ExpressionParser.PrefixOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrefixOperation}
	 * labeled alternative in {@link ExpressionParser#prefixExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrefixOperation(ExpressionParser.PrefixOperationContext ctx);
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
	 * Enter a parse tree produced by the {@code PrefixOperationWithParenthesis}
	 * labeled alternative in {@link ExpressionParser#prefixExprWithParenthesis}.
	 * @param ctx the parse tree
	 */
	void enterPrefixOperationWithParenthesis(ExpressionParser.PrefixOperationWithParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrefixOperationWithParenthesis}
	 * labeled alternative in {@link ExpressionParser#prefixExprWithParenthesis}.
	 * @param ctx the parse tree
	 */
	void exitPrefixOperationWithParenthesis(ExpressionParser.PrefixOperationWithParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrefixNumberWithParenthesis}
	 * labeled alternative in {@link ExpressionParser#prefixExprWithParenthesis}.
	 * @param ctx the parse tree
	 */
	void enterPrefixNumberWithParenthesis(ExpressionParser.PrefixNumberWithParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrefixNumberWithParenthesis}
	 * labeled alternative in {@link ExpressionParser#prefixExprWithParenthesis}.
	 * @param ctx the parse tree
	 */
	void exitPrefixNumberWithParenthesis(ExpressionParser.PrefixNumberWithParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostfixOperation}
	 * labeled alternative in {@link ExpressionParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void enterPostfixOperation(ExpressionParser.PostfixOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostfixOperation}
	 * labeled alternative in {@link ExpressionParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void exitPostfixOperation(ExpressionParser.PostfixOperationContext ctx);
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
	 * Enter a parse tree produced by the {@code PostfixOperationWithParenthesis}
	 * labeled alternative in {@link ExpressionParser#postfixExprWithParenthesis}.
	 * @param ctx the parse tree
	 */
	void enterPostfixOperationWithParenthesis(ExpressionParser.PostfixOperationWithParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostfixOperationWithParenthesis}
	 * labeled alternative in {@link ExpressionParser#postfixExprWithParenthesis}.
	 * @param ctx the parse tree
	 */
	void exitPostfixOperationWithParenthesis(ExpressionParser.PostfixOperationWithParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostfixNumberWithParenthesis}
	 * labeled alternative in {@link ExpressionParser#postfixExprWithParenthesis}.
	 * @param ctx the parse tree
	 */
	void enterPostfixNumberWithParenthesis(ExpressionParser.PostfixNumberWithParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostfixNumberWithParenthesis}
	 * labeled alternative in {@link ExpressionParser#postfixExprWithParenthesis}.
	 * @param ctx the parse tree
	 */
	void exitPostfixNumberWithParenthesis(ExpressionParser.PostfixNumberWithParenthesisContext ctx);
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
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ExpressionParser#infixExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(ExpressionParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ExpressionParser#infixExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(ExpressionParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link ExpressionParser#term}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(ExpressionParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link ExpressionParser#term}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(ExpressionParser.MulDivContext ctx);
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
	 * Enter a parse tree produced by the {@code NumberFactor}
	 * labeled alternative in {@link ExpressionParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNumberFactor(ExpressionParser.NumberFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberFactor}
	 * labeled alternative in {@link ExpressionParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNumberFactor(ExpressionParser.NumberFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link ExpressionParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(ExpressionParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link ExpressionParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(ExpressionParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SignedNumber}
	 * labeled alternative in {@link ExpressionParser#number}.
	 * @param ctx the parse tree
	 */
	void enterSignedNumber(ExpressionParser.SignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SignedNumber}
	 * labeled alternative in {@link ExpressionParser#number}.
	 * @param ctx the parse tree
	 */
	void exitSignedNumber(ExpressionParser.SignedNumberContext ctx);
}