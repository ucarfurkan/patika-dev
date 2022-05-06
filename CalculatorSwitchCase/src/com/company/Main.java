package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double n1,n2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        n1 = scanner.nextDouble();
        System.out.print("Please enter the second number: ");
        n2 = scanner.nextDouble();
        scanner.nextLine();

        String message = """
                1- Addition\s
                2- Substraction\s
                3- Division\s
                4- Multiplation""";

        System.out.println(message);
        String operation = scanner.nextLine();

        switch(operation){
            case "1":
                System.out.println("Addition result is: " + (n1+n2));
                break;
            case "2":
                System.out.println("Substraction result is: " + (n1-n2));
                break;
            case "3":
                if(n2 != 0){
                    System.out.println("Division result is: " + (n1/n2));
                }
                else{
                    System.out.println("You can not divide a number to zero.");
                }

                break;
            case "4":
                System.out.println("Multiplation result is: " + (n1*n2));
                break;
            default:
                System.out.println("Invalid input.");
        }

    }
}
