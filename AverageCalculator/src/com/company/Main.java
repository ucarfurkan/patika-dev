package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);
         int num = scanner.nextInt();

         int sumOfNums = 0;
         int totalNumsAmount=0;
         for(int i=1;i<=num;i++){
             if(i%4 == 0 && i%3 == 0){
                 System.out.println(i);
                 sumOfNums+=i;
                totalNumsAmount++;
             }
         }
         double result = sumOfNums / (double)totalNumsAmount;
        System.out.println(result);
    }
}
