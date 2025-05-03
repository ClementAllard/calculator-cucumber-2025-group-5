package calculator;

import calculator.expression.Expression;
import helper.IllegalSyntax;
import helper.MyExpressionParser;
import jdk.jshell.spi.ExecutionControl;

import java.util.Scanner;

/**
 * A very simple calculator in Java
 * University of Mons - UMONS
 * Software Engineering Lab
 * Faculty of Sciences
 *
 * @author tommens
 */
public class CLI {

	private static final Calculator calculator = new Calculator();

	/**
	 * This is the main method of the application.
	 * It provides CLI to use it to construct and evaluate arithmetic expressions.
	 *
	 * @param args	Command-line parameters are not used in this version
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to CLI Calculator: "); //NOSONAR
		System.out.println("Please, enter expression: "); //NOSONAR

		while (true) {
			System.out.print("> "); //NOSONAR
			String input = scanner.nextLine().trim();

			switch (input){
				case "help":
					System.out.println("Basic usage: write basic expression like add, subtract, multiply, divide with infix,postfix,prefix notation"); //NOSONAR
					break;
				case "exit":
					return;
				default:
					try{
						Expression e = MyExpressionParser.parseExpression(input);
                        String result = null;

                        try {
                            result = calculator.eval(e);
                        } catch (ExecutionControl.NotImplementedException ex) {
							System.out.println("Invalid operation");
                        }

                        System.out.println("Result : " + e + " = "  + result);  //NOSONAR
					}catch (IllegalSyntax _){
						System.out.println("Illegal Syntax"); //NOSONAR
						System.out.println("Please, enter a valid expression: "); //NOSONAR
					}
			}
		}
 	}

}
