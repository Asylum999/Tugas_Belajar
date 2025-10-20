package Modul3;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calc = new Calculator();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Calculator");
            System.out.println("0. Exit");
            System.out.print("Select option: ");
            int pilihan;
            try {
                pilihan = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input must be an integer!!");
                input.next(); // membersihkan buffer input
                continue;
            }

            if (pilihan == 0) {
                System.out.println("Exit program");
                break; // keluar dari loop dan program berhenti
            } else if (pilihan == 1) {
                try {
                    System.out.print("Enter first number: ");
                    double angka1 = input.nextDouble();

                    System.out.print("Enter operator (+, -, *, /): ");
                    char operator = input.next().charAt(0);

                    System.out.print("Enter second number: ");
                    double angka2 = input.nextDouble();

                    double hasil = calc.hitung(angka1, angka2, operator);
                    System.out.println("\nHasil: " + hasil);

                } catch (InputMismatchException e) {
                    System.out.println("Error: Input must be a number!");
                    input.next(); // membersihkan buffer input
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: Operator must be one of (+, -, *, /)!");
                } catch (Exception e) {
                    System.out.println("Eror : " + e.getMessage());
                }
            } else {
                System.out.println("Eror: Invalid option!");
            }
            System.out.println(); // baris kosong untuk kejelasan tampilan
        }
        input.close();
    }
}