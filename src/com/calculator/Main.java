package com.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in)) {

            Calculator calculator = new Calculator();

            // Prompt the user for input
            System.out.println("Enter the first operand:");
            Integer input1 = scanner.nextInt();

            System.out.println("Enter the second operand:");
            Integer input2 = scanner.nextInt();

            System.out.println("Enter the operation (ADD, SUBTRACT, MULTIPLY, DIVIDE):");
            String operationInput = scanner.next();

            // Convert the string input to the enum value
            Calculator.Operation operation;

            try {
                operation = Calculator.Operation.valueOf(operationInput);
            } catch (Exception e) {
                System.out.println(
                        "Invalid operation. Please enter one of the following: ADD, SUBTRACT, MULTIPLY, DIVIDE");
                scanner.close();
                return;
            }

            // Perform the calculation
            CalculationResult result = calculator.calculate(input1, input2, operation);

            // Print the result or error message
            if (result.hasError()) {
                System.out.println(result.getError());
            } else {
                System.out.println(result.getResult());
            }

            // Close the scanner
            scanner.close();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}