package latihankedua;

import java.util.Scanner;

public class InputLuasPersegiPanjang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int panjang = scanner.nextInt();
        int lebar = scanner.nextInt();
        int luas = panjang * lebar;
        int keliling = (panjang + lebar) * 2;

        System.out.println("panjang "+panjang);
        System.out.println("lebar "+lebar);
        System.out.println("luas "+luas);
        System.out.println("keliling "+keliling);
    }
}