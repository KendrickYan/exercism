import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {

        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }

        // using elif here is weird coz we know that the program will stop at throw in line 7
        if (operation.isEmpty()) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }

        return switch (operation) {
            case "+" -> format(operand1, operand2, operation, (operand1 + operand2));
            case "*" -> format(operand1, operand2, operation, (operand1 * operand2));
            case "/" -> {
                try {
                    yield format(operand1, operand2, operation, (operand1 / operand2));
                } catch (ArithmeticException e) {
                    throw new IllegalOperationException("Division by zero is not allowed", e);
                }
            }
            default -> throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        };
    }

    private String format(int operand1, int operand2, String operation, int result) {
        return operand1 + " " + operation + " " + operand2 + " = " + result;
    }
}