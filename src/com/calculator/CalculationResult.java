package com.calculator;

public class CalculationResult {

    private final String result;
    private final String error;

    /**
     * Constructor for a CalculationResult object.
     * 
     * @param result The result of the calculation
     * @param error The error message, if an error occurred
     * @return A new CalculationResult object
     */
    public CalculationResult(String result, String error) {
        this.result = result;
        this.error = error;
    }

    public String getResult() {
        return result;
    }

    public String getError() {
        return error;
    }

    public boolean hasError() {
        return error != null;
    }

    @Override
    public String toString() {
        if (hasError()) {
            return "Error: " + error;
        } else {
            return "Result: " + result;
        }
    }
}
