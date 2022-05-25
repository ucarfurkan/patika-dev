package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int heat;

    Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a degree: ");
        heat = sc.nextInt();

        if(heat>=15){
            if(heat<=25){
                System.out.println("Go to picnic");
            }
            else{
                System.out.println("Go to swimming");
            }
        }
        else if(heat>=5 && heat<15){
            System.out.println("Go to cinema");
        }
        else{
            System.out.println("Go to ski");
        }
    }
}
