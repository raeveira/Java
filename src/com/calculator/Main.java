package com.calculator;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Calculator calculator = new Calculator();

        String result = calculator.calculate(1, 2, Calculator.Operation.DIVIDE);
        System.out.println("Result: " + result);
        

        System.out.println("Goodbye, World!");
    }
}