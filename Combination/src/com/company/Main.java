package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n: ");
        int n = scanner.nextInt();

        System.out.print("r: ");
        int r = scanner.nextInt();

        System.out.println(factorial(n) + " " + factorial(r));
        long combination = factorial(n) / (factorial(r)*factorial(n-r));

        System.out.println(combination);


    }

    static long factorial(int num){
        long factorialOfNum = 1;
        for(int i = 1; i<=num;i++){
            factorialOfNum *= i;
        }
        return factorialOfNum;
    }
}

