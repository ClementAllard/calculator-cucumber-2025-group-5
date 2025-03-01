package helper;

import calculator.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Parser {

    private final List<String> tokens;
    private final Notation notation;
    private int position = 0;

    /**
     * Class constructor specifying a list of tokens representing the expression.
     * @param tokens The list of tokens representing the expression
     */
    private Parser(List<String> tokens) {
        this.tokens = tokens;
        this.notation = getNotation(tokens);
    }

    /**
     * This method parses an expression from a string.
     * @param expressionString The string representing the expression
     * @return The parsed expression
     * @throws IllegalConstruction If the expression is not well-formed
     */
    public static Expression parseExpression(String expressionString) throws IllegalConstruction {
        List<String> tokens = tokenize(expressionString);
        return new Parser(tokens).parseExpression();
    }

    /**
     * This method determines the notation of the expression.
     * @param tokens The list of tokens representing the expression
     * @return The notation of the expression
     */
    private Notation getNotation(List<String> tokens) {
        if (tokens.getFirst().matches("[+\\-*/]")) {
            return Notation.PREFIX;
        } else if (tokens.getLast().matches("[+\\-*/]")) {
            return Notation.POSTFIX;
        } else {
            return Notation.INFIX;
        }
    }

    /**
     * This method returns the next token in the list of tokens.
     * @return The next token in the list of tokens
     */
    private String nextToken() {
        return position < tokens.size() ? tokens.get(++position) : null;
    }

    /**
     * This method returns the token at the current position in the list of tokens.
     * @return The token at the current position in the list of tokens
     */
    private String peekToken() {
        return tokens.get(position);
    }

    /**
     * This method returns the previous token in the list of tokens.
     * @return The previous token in the list of tokens
     */
    private String previousToken() {
        return position > 0 ? tokens.get(--position) : null;
    }

    /**
     * This method parses an expression from the list of tokens.
     * @return The parsed expression
     * @throws IllegalConstruction If the expression is not well-formed
     */
    private Expression parseExpression() throws IllegalConstruction {
        String currentOperation = null;
        List<Expression> args = new ArrayList<>();

        // If the expression is in prefix notation, the first token is the operator
        if (notation.equals(Notation.PREFIX)) {
            // if the current token is a paranthesis, the operator is the previous token
            // this code is reached in recursive calls
            if(peekToken().equals("(")){
                previousToken();
            }

            currentOperation = peekToken();
            nextToken();
        }

        if(peekToken().equals("(")){
            while (!")".equals(nextToken())){
                if(peekToken().equals("(")){
                    // recursive call to parse the subexpression
                    Expression subExpression = parseExpression();
                    // add the subexpression to the list of arguments
                    args.add(subExpression);
                }else if(peekToken().matches("\\d+")){
                    // add the number to the list of arguments
                    args.add(new MyNumber(Integer.parseInt(peekToken())));
                }else if(notation.equals(Notation.INFIX) && peekToken().matches("[+\\-*/]")){
                    // if the expression is in infix notation, the operator is the current token
                    currentOperation = peekToken();
                }
            }
        }

        // If the expression is in postfix notation, the token after ) is the operator
        if(notation.equals(Notation.POSTFIX)){
            currentOperation = nextToken();
        }

        // if the operator is null, throw an exception
        if (currentOperation == null) { throw new IllegalConstruction(); }

        // build a Expression with the operator and the arguments
        return createOperatorExpression(currentOperation, args);
    }

    /**
     * This method creates an operator expression from an operator and a list of arguments.
     * @param operator The operator of the expression
     * @param args The list of arguments of the expression
     * @return The operator expression
     * @throws IllegalConstruction If the operator is not well-formed
     */
    private Expression createOperatorExpression(String operator, List<Expression> args) throws IllegalConstruction {
        return switch (operator) {
            case "+" -> new Plus(args,this.notation);
            case "-" -> new Minus(args,this.notation);
            case "*" -> new Times(args,this.notation);
            case "/" -> new Divides(args,this.notation);
            default -> throw new IllegalConstruction();
        };
    }

    /**
     * This method tokenizes a string into a list of tokens.
     * @param input The string to be tokenized
     * @return The list of tokens
     * @throws IllegalConstruction If the string is not well-formed
     */
    private static List<String> tokenize(String input) throws IllegalConstruction {
        // throw an exception if the input contains any character other than digits, parentheses, and operators
        if (!input.matches("[\\d(),+\\-*/\\s\\t]*")) {
            throw new IllegalConstruction();
        }

        List<String> tokens = new ArrayList<>();

        Matcher matcher = Pattern.compile("\\d+|[()+\\-*/]").matcher(input);
        while (matcher.find()) {

            // throw an exception if the input contains two operators in a row
            if(!tokens.isEmpty() && tokens.getLast().matches("[+\\-*/]") && matcher.group().matches("[+\\-*/]")){
                throw new IllegalConstruction();
            }

            tokens.add(matcher.group());
        }

        // Check if the expression is empty
        if (tokens.isEmpty()) { throw new IllegalConstruction(); }

        // Check if the number of opening and closing parentheses is the same
        if(Collections.frequency(tokens, "(") != Collections.frequency(tokens, ")")) { throw new IllegalConstruction(); }

        return tokens;
    }
}
