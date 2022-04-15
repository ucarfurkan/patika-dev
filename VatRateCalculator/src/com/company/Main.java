package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double amount,VatRate=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount:");
        amount = sc.nextDouble();

        if(amount>0){
            if(amount>0&&amount<1000){
                VatRate= 18/100.0;
            }
            else if(amount>1000){
                VatRate= 8/100.0;
            }

            double amountOfVat = amount*VatRate;
            double amountWithVat = amount + amountOfVat;

            System.out.println("Amount without VAT: " + amount);
            System.out.println("Amount with VAT: " + amountWithVat);
            System.out.println("Amount of VAT: " + amountOfVat);
        }
        else{
            System.out.println("Amount can not be 0 or less!");
        }


    }
}
