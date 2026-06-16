package main.java.br.com.easy.af_CalculatorConundrum;

public class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) throws IllegalArgumentException{
        int result = 0;

        try {if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
            } else {
                switch(operation) {
                    case ("/"):
                        result = operand1 / operand2;
                        break;
                    case ("+"):
                        result = operand1 + operand2;
                        break;
                    case ("*"):
                        result = operand1 * operand2;
                        break;
                    case (""):
                        throw new IllegalArgumentException("Operation cannot be empty");
                    default:
                        throw new IllegalOperationException("Operation '"+ operation +"' does not exist");
            }}
            return operand1 + " " + operation + " " + operand2 + " = " + result;
            } catch (ArithmeticException e) {
                    throw new IllegalOperationException("Division by zero is not allowed", e);
            }
    }}
