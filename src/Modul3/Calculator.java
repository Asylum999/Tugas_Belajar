package Modul3;

public class Calculator {

    public double hitung(double a, double b, char operator) {
        switch (operator) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (b == 0) {
                    throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan!");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Operator tidak valid!");
        }
    }
}
