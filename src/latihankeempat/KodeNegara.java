package latihankeempat;

import java.util.Scanner;

public class KodeNegara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kode negara: ");
        String kodeNegara = scanner.next().toUpperCase();

        String namaNegara = getNamaNegara(kodeNegara);

        System.out.println("Nama negara untuk kode " + kodeNegara + ": " + namaNegara);
    }

    static String getNamaNegara(String kodeNegara) {
        switch (kodeNegara) {
            case "ID":
                return "Indonesia";
            case "US":
                return "Amerika Serikat";
            case "JP":
                return "Jepang";
            case "IN":
                return "India";
            case "CN":
                return "China";

            default:
                return "Negara tidak ditemukan";
        }
    }
}
