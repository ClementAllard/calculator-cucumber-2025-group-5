package calculator.expression.number;

import calculator.expression.Expression;
import helper.IllegalSyntax;
import helper.MyExpressionParser;

import java.io.*;
import java.nio.file.*;
import java.util.HashMap;
import java.util.Map;

public class Constant {
    private static final Path FILE_PATH = Paths.get("constants.json");

    private Constant() {}

    /**
     * Add a constant in the file.
     * If constant already existed, replace it.
     * @param key the name of the constant
     * @param value the value of the constant.
     */
    public static void writeConstant(String key, String value) {
        Map<String, String> constants = readAllConstants();
        constants.put(key, value);

        String json = convertMapToJson(constants);
        try {
            Files.writeString(FILE_PATH, json);
        } catch (IOException e) {
            throw new IllegalArgumentException("Unable to write in constant.json");
        }
    }

    /**
     * Read the value of the constant in the file.
     * @param key the name of the constant.
     * @return the value of the constant as string.
     */
    public static String readConstant(String key) {
        Map<String, String> constants = readAllConstants();
        return constants.getOrDefault(key, null);
    }

    /**
     * Return all items in the dictionary/json.
     * @return Map of key, value as Map.
     */
    public static Map<String, String> readAllConstants() {
        if (!Files.exists(FILE_PATH)){
            throw new IllegalArgumentException("File constant.json does not exist");
        }
        try {
            String json = Files.readString(FILE_PATH);
            return convertJsonToMap(json);
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot read json file constant.json");
        }
    }

    /**
     * Convert a json string into a Map of key, value items.
     * @param json the string that represent a json.
     * @return Map key, value.
     */
    private static Map<String, String> convertJsonToMap(String json) {
        Map<String, String> map = new HashMap<>();
        json = json.replace("{", "").replace("}", "").trim();
        String[] entries = json.split(",");
        for (String entry : entries) {
            String[] keyValue = entry.split(":");
            if (keyValue.length == 2) {
                map.put(keyValue[0].replace("\"", "").trim(), keyValue[1].replace("\"", "").trim());
            }
        }
        return map;
    }

    /**
     * Convert the json as Map key, value into a String json to be saved.
     * @param map the dictionary key, value as Map.
     * @return The String that represent the json.
     */
    private static String convertMapToJson(Map<String, String> map) {
        StringBuilder json = new StringBuilder("{\n");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            json.append("  \"").append(entry.getKey()).append("\": \"").append(entry.getValue()).append("\",\n");
        }
        if (json.length() > 2) json.setLength(json.length() - 2); // Supprime la dernière virgule
        json.append("\n}");
        return json.toString();
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