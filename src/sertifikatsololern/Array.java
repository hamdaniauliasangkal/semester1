package sertifikatsololern;

import  java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);

        int choice;

        if (sc.hasNextInt()) {
            choice = sc.nextInt();

            if (choice >= 0 && choice < menu.length) {
                String selectedDrink = menu[choice];
                System.out.println(selectedDrink);
            } else {
                System.out.println("Invalid");
            }
        } else {
            System.out.println("invalid input. Pleasenenter a valid integer");
        }

        sc.close();
    }
}
