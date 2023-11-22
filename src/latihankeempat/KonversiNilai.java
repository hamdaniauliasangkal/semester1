package latihankeempat;

import java.util.Scanner;

public class KonversiNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        double nilai = scanner.nextDouble();

        char grade = konversiNilaiKeHuruf(nilai);

        System.out.println("Nilai " + nilai + " setara dengan huruf " + grade);
    }

    static char konversiNilaiKeHuruf(double nilai) {
        if (nilai >= 90.0) {
            return 'A';
        } else if (nilai >= 80.0) {
            return 'B';
        } else if (nilai >= 70.0) {
            return 'C';
        } else if (nilai >= 60.0) {
            return 'D';
        } else {
            return 'E';
        }
    }
}
