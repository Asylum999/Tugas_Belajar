package Modul3;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calc = new Calculator();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Kalkulator");
            System.out.println("0. Exit");
            System.out.print("Pilih opsi: ");
            int pilihan;
            try {
                pilihan = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                input.next(); // membersihkan buffer input
                continue;
            }

            if (pilihan == 0) {
                System.out.println("Keluar dari program. Terima kasih!");
                break; // keluar dari loop dan program berhenti
            } else if (pilihan == 1) {
                try {
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
                    input.next(); // membersihkan buffer input
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: Operator yang dimasukkan salah!");
                } catch (Exception e) {
                    System.out.println("Terjadi kesalahan: " + e.getMessage());
                }
            } else {
                System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
            System.out.println(); // baris kosong untuk kejelasan tampilan
        }
        input.close();
    }
}