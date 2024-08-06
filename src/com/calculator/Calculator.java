package com.calculator;

public class Calculator {

    // Enum for operations
    public enum Operation {
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE
    }

    /**
     * Performs the calculation based on the provided operation.
     *
     * @param input1 First operand
     * @param input2 Second operand
     * @param operation The operation to perform
     * @return The result of the calculation as a String
     * @throws IllegalArgumentException If division by zero is attempted
     */
    public String calculate(int input1, int input2, Operation operation) {
        int output;

        // Switch statement with enum
        output = switch (operation) {
            case ADD -> input1 + input2;
            case SUBTRACT -> input1 - input2;
            case MULTIPLY -> input1 * input2;
            case DIVIDE -> {
                if (input2 == 0) {
                    throw new IllegalArgumentException("Cannot divide by zero");
                }
                yield input1 / input2;
            }
        };

        // Return the result as a String
        return Integer.toString(output);
    }
}
