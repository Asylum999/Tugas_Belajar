package Modul3;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calc = new Calculator();

        try {
            System.out.println("Kalkulator Sederhana");

            System.out.print("Masukkan angka pertama: ");
            double angka1 = input.nextDouble();

            System.out.print("Masukkan operator (+, -, *, /): ");
            char operator = input.next().charAt(0);

            System.out.print("Masukkan angka kedua: ");
            double angka2 = input.nextDouble();

            double hasil = calc.hitung(angka1, angka2, operator);
            System.out.println("\nHasil: " + hasil);

        } catch (InputMismatchException e) {
            System.out.println("Error: Input harus berupa angka!");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Operator yang dimasukkan salah!");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
