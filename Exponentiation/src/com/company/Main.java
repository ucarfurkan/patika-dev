package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number to prime: ");
        int numToPrime = scanner.nextInt();

        System.out.println("Exponent of number: ");
        int expOfNum = scanner.nextInt();

        int result = 1;
        for(int i=0; i< expOfNum; i++){
            result *= numToPrime;
        }

        System.out.println(result);
    }
}
