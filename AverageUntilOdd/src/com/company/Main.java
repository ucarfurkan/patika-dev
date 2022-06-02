package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        boolean situation = false;
        int sum = 0;
        while(!situation){
            int a = scanner.nextInt();
            if(a%2 == 1){
                situation = true;
            }
            else{
                if(a%4 == 0){
                    sum+=a;
                }
            }
        }
        System.out.println(sum);
    }
}
