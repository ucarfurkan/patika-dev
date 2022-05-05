package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your height (in meter): ");
        double height = scanner.nextDouble();

        System.out.println("Please enter your weight (in kg): ");
        double weight = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.println(bmi);
    }
}
