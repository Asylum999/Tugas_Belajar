package Modul3;

public class Calculator {

    public double hitung(double a, double b, char operator) {
        return switch (operator) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> {
                if (b == 0) {
                    throw new ArithmeticException("Zero division");
                }
                yield a / b;
            }
            default -> throw new IllegalArgumentException("Operator must be one of (+, -, *, /)!");
        };
    }

}
