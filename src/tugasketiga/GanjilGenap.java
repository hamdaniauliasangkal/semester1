package tugasketiga;

import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Masukkan angka: ");
            int angka = input.nextInt();

            if (angka % 2 == 0) {
                System.out.println("Angka " + angka + " adalah angka genap.");
            } else {
                System.out.println("Angka " + angka + " adalah angka ganjil.");
            }
        }
    }
}
