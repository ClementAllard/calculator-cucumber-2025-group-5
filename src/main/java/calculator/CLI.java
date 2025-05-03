package calculator;

import calculator.expression.BigDecimalUtil;
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
					System.out.println(); //NOSONAR
					System.out.println("Command : "); //NOSONAR
					System.out.println("help, give command help"); //NOSONAR
					System.out.println("scale, allows change of the precision"); //NOSONAR
					System.out.println("rounding, allows change of the rounding"); //NOSONAR
					break;
				case "exit":
					return;
				case "scale":
					System.out.println("Current scale expression: " + BigDecimalUtil.getScale()); //NOSONAR
					System.out.print("New chosen scale : "); //NOSONAR
					try{
						String expression = scanner.nextLine().trim();
						if(expression.equals("exit")){ break; }
						int scale = Integer.parseInt(expression);
						BigDecimalUtil.setScale(scale);
						System.out.println("New current scale expression: " + BigDecimalUtil.getScale()); //NOSONAR
					}catch (NumberFormatException e){
						System.out.println("Invalid scale"); //NOSONAR
					}
					break;
				case "rounding":
					System.out.println("Current rounding expression: " + BigDecimalUtil.getRounding()); //NOSONAR
					System.out.println("0 : UP\n1 : DOWN\n2 : CEILING\n3 : FLOOR\n4 : HALF_UP\n5 HALF_DOWN\n6 : HALF_EVEN\n7 : UNNECESSARY"); //NOSONAR
					System.out.print("New chosen rounding : "); //NOSONAR
					try{
						String expression = scanner.nextLine().trim();
						if(expression.equals("exit")){ break; }
						int mode = Integer.parseInt(expression);
						if(mode < 0 || mode > 7){
							System.out.println("Invalid rounding"); //NOSONAR
						}else{
							BigDecimalUtil.setRoundingMode(mode);
							System.out.println("New current rounding expression: " + BigDecimalUtil.getRounding()); //NOSONAR
						}
					}catch (NumberFormatException e){
						System.out.println("Invalid rounding mode"); //NOSONAR
					}
					break;
				default:
					try{
						Expression e = MyExpressionParser.parseExpression(input);
                        String result = null;

                        try {
                            result = calculator.eval(e);
                        } catch (ExecutionControl.NotImplementedException ex) {
							System.out.println("Invalid operation"); //NOSONAR
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
