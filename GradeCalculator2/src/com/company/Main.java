package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] grades = new int[6];

        System.out.println("Your math grade:");
        grades[0] = sc.nextInt();

        System.out.println("Your physics grade:");
        grades[1] = sc.nextInt();

        System.out.println("Your chemistry grade:");
        grades[2] = sc.nextInt();

        System.out.println("Your turkish grade:");
        grades[3] = sc.nextInt();

        System.out.println("Your history grade:");
        grades[4] = sc.nextInt();

        System.out.println("Your music grade:");
        grades[5] = sc.nextInt();

        int sum=0;
        int notIn=0;
        for(int i=0;i<grades.length;i++){
            if(grades[i]>=0&&grades[i]<=100){
                sum+=grades[i];
            }
            else{
                notIn++;
            }
        }

        double grade = sum / (grades.length-notIn);
        System.out.println("Your grade is: " + grade);

        if(grade>=55&&grade<=100){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }
    }
}
