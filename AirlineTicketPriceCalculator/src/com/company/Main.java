package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        System.out.println("How many kilometers will you go?");
        double distance = scanner.nextDouble();
        System.out.println("What is your age?");
        double age = scanner.nextDouble();
        System.out.println("Choose a type: \n"+
                "1- One way\n"+
                "2- Round trip");
        int travelType = scanner.nextInt();

        boolean isError = false;
        double typeDiscount = 0;
        double ageDiscount = 0;
        double totalPrice = distance*0.10;

        if(distance<0){
            isError = true;
        }

        if(age<12 && age>0){
            ageDiscount = 0.5*totalPrice;
        }
        else if(age>=12 && age<=24){
            ageDiscount = 0.1*totalPrice;
        }
        else if(age>65){
            ageDiscount = 0.3*totalPrice;
        }
        else if(age<0){
            isError=true;
        }

        double discountedPrice = totalPrice - ageDiscount;

        double finalResult = 0;
        if(travelType == 2){
            typeDiscount = discountedPrice*0.2;
            finalResult = (discountedPrice - typeDiscount)*2;
        }
        else if(travelType<0 || travelType>2){
            isError=true;
        }
        else{
            finalResult = (discountedPrice - typeDiscount);
        }

        if(!isError){
            System.out.println("Total price: " + finalResult);
        }
        else{
            System.out.println("Invalid input");
        }






    }
}
