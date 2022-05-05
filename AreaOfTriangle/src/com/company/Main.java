package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        double firstSideLength = scanner.nextDouble();
        double secondSideLength = scanner.nextDouble();
        double thirdSideLength = scanner.nextDouble();

        double u = (firstSideLength+secondSideLength+thirdSideLength)/2.0;

        double area = Math.sqrt(u * (u - firstSideLength) * (u - secondSideLength) * (u - thirdSideLength));

        System.out.println(area);

    }
}
