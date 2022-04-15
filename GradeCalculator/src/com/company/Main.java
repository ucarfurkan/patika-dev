package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int math, physics, chemistry, turkish, history, music;

        Scanner sc = new Scanner(System.in);

        System.out.println("Your math grade:");
        math = sc.nextInt();

        System.out.println("Your physics grade:");
        physics = sc.nextInt();

        System.out.println("Your chemistry grade:");
        chemistry = sc.nextInt();

        System.out.println("Your turkish grade:");
        turkish = sc.nextInt();

        System.out.println("Your history grade:");
        history = sc.nextInt();

        System.out.println("Your music grade:");
        music = sc.nextInt();

        int sum = math+physics+chemistry+turkish+history+music;
        double grade = sum / 6;
        System.out.println("Your grade is: " + grade);

        String info = grade>=60 ? "Passed" : "Failed";
        System.out.println(info);
    }
}
