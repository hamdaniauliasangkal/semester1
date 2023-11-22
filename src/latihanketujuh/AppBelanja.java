package latihanketujuh;

import java.util.Scanner;
import static java.lang.System.out;

public class AppBelanja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Harga barang
        int[] hargaBarang = {2500, 3000, 4000, 5000, 6000};

        for (int i = 0; i < hargaBarang.length; i++) {
            out.print("Barang-" + i + " : ");
            int jumlahBarang = input.nextInt();
            int totalHarga = hargaBarang[i] * jumlahBarang;
            out.println("Harga Barang ke-" + i + " : Rp " + hargaBarang[i] + ", jumlah : " + jumlahBarang + ", Total : Rp " + totalHarga);
        }

        int totalJumlahBarang = 0;
        int totalHargaSemua = 0;

        for (int i = 0; i < hargaBarang.length; i++) {
            int jumlahBarang = input.nextInt();
            totalJumlahBarang += jumlahBarang;
            totalHargaSemua += hargaBarang[i] * jumlahBarang;
        }

        out.println("TOTAL JUMLAH BARANG : " + totalJumlahBarang);
        out.println("Total Harga : Rp " + totalHargaSemua);
    }
}