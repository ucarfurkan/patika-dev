package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double pear = 2.14;
        double apple = 3.67;
        double tomato = 1.11;
        double banana = 0.95;
        double eggplant = 5;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Amount of pear (in kg): ");
        double amountOfPear = scanner.nextDouble();

        System.out.println("Amount of apple (in kg): ");
        double amountOfApple = scanner.nextDouble();

        System.out.println("Amount of tomato (in kg): ");
        double amountOfTomato = scanner.nextDouble();

        System.out.println("Amount of banana (in kg): ");
        double amountOfBanana = scanner.nextDouble();

        System.out.println("Amount of eggplant (in kg): ");
        double amountOfEggplant = scanner.nextDouble();

        double total = amountOfApple * apple + amountOfBanana * banana + amountOfEggplant * eggplant + amountOfPear * pear + amountOfTomato * tomato;

        System.out.println("Total: " + total+"TL");
    }
}
