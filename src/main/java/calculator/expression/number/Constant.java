package calculator.expression.number;

import calculator.expression.Expression;
import helper.IllegalSyntax;
import helper.MyExpressionParser;

import java.io.*;
import java.nio.file.*;
import java.util.Properties;

public final class Constant {
    public static final Path FILE_PATH = Paths.get("constants.properties");

    private Constant() {}

    /**
     * Add a constant in the file.
     * If constant already existed, replace it.
     * @param key the name of the constant
     * @param value the value of the constant.
     */
    public static void writeConstant(String key, String value) {
        Properties props = loadAllConstants();
        props.setProperty(key, value);
        try (Writer writer = Files.newBufferedWriter(FILE_PATH)) {
            props.store(writer, "Stored constants");
        } catch (IOException e) {
            throw new IllegalArgumentException("Unable to write to constants.properties", e);
        }
    }

    /**
     * Read the value of the constant in the file.
     * @param key the name of the constant.
     * @return the value of the constant as string.
     */
    public static String readConstant(String key) {
        Properties props = loadAllConstants();
        return props.getProperty(key);
    }

    /**
     * Load all constants from the file FILE_PATH.
     * @return Properties found inside the file.
     */
    private static Properties loadAllConstants() {
        Properties props = new Properties();
        if (!Files.exists(FILE_PATH)) return props;
        try (Reader reader = Files.newBufferedReader(FILE_PATH)) {
            props.load(reader);
        } catch (IOException e) {
            throw new IllegalArgumentException("Unable to read constants.properties", e);
        }
        return props;
    }

    /**
     * Read the input and transform it in an Expression with the grammar.
     * Please be aware that the input has to be sanitized between the reading of a constant and the parsing
     * otherwise the item "bug":"$bug$" will trigger an infinite loop of loading the constant.json file.
     * @param input the CLI command to compute.
     * @return Expression the result of the grammar computing on the string.
     * @throws IllegalSyntax if the expression is not valid.
     */
    public static Expression parseExpression(String input) throws IllegalSyntax {
        return MyExpressionParser.parseExpression(input);
    }
}