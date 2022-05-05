package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        double radius = scanner.nextDouble();
        double alpha = scanner.nextDouble();

        double pi = 3.14;

        double area = (pi * (radius*radius) * alpha) / 360.0;

        System.out.println(area);

    }
}
