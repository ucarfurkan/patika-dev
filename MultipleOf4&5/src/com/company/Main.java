package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for(int i = 1; i<=num; i++){
            if(i%4 == 0 && i%5 == 0){
                System.out.println(i);
            }
        }
    }
}
