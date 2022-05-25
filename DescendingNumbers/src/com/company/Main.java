package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int a,b,c;
        Scanner scanner = new Scanner(System.in);

        System.out.print("1st number: ");
        a = scanner.nextInt();

        System.out.print("2nd number: ");
        b = scanner.nextInt();

        System.out.print("3rd number: ");
        c = scanner.nextInt();

        if(a<b && a<c){
            if(b<c){
                System.out.println("a<b<c");
            }
            else if(c<b){
                System.out.println("a<c<b");
            }
            else{
                System.out.println("a<c=b");
            }
        }
        else if(b<a && b<c){
            if(a<c){
                System.out.println("b<a<c");
            }
            else if(c<a){
                System.out.println("b<c<a");
            }
            else{
                System.out.println("b<c=a");
            }
        }
        else if(c<b && c<a){
            if(a<b){
                System.out.println("c<a<b");
            }
            else if(b<a){
                System.out.println("c<b<a");
            }
            else{
                System.out.println("c<a=b");
            }
        }
        else{
            System.out.println("c=a=b");
        }
    }
}
