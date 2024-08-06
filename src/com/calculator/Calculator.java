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
     * @param input1    First operand
     * @param input2    Second operand
     * @param operation The operation to perform
     * @return The result of the calculation as a String
     */
    public CalculationResult calculate(Integer input1, Integer input2, Operation operation) {
        int output;

        try {
            // Check if the operation is null
            if (operation == null) {
                throw new IllegalArgumentException("Operation cannot be null");
            }

            if (input1 == null || input2 == null) {
                throw new IllegalArgumentException("Input cannot be null");
            }

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
        } catch (IllegalArgumentException illArgExc) {
            return new CalculationResult(null, "An error occurred: " + illArgExc.getMessage());
        }

        // Return the result as a String
        return new CalculationResult(Integer.toString(output), null);
    }
}
