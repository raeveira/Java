package com.calculator;

public class Main {
    /**
     * Main method
     * @param args Command line arguments
     * @throws Exception Exception thrown if an error occurs
     * @return void
     */
    public static void main(String[] args) throws Exception {
        // Switch statement with enum
        enum Operation {
            ADD,
            SUBTRACT,
            MULTIPLY,
            DIVIDE
        }

        // Variables
        int output;
        int input1 = 4;
        int input2 = 2;
        Operation operation = Operation.ADD;

        // Switch statement
        output = switch (operation) {
            case ADD -> input1 + input2;
            case SUBTRACT -> input1 - input2;
            case MULTIPLY -> input1 * input2;
            case DIVIDE -> input1 / input2;
            default -> 0;
        };
        
        // Output
        System.out.println(output);
    }
}
