package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String userName,password;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Username:");
        userName = scanner.nextLine();
        System.out.println("password");
        password = scanner.nextLine();

        if(userName.equals("furkanucar") && password.equals("furkan123")){
            System.out.println("Logged in successfully.");
        }
        else{
            System.out.println("Your password is incorrect. Do you want to reset your password?\n1-Yes\n2-No");
            int answer = scanner.nextInt();
            if(answer == 1){
                System.out.println("Please enter your new password.");
                String newPassword = scanner.nextLine();
                if(newPassword != password && !newPassword.equals("furkan123")){

                    System.out.println("Reset completed.");
                }
                else{
                    System.out.println("Your new password can not be same with your old password.");
                }
            }
            else{
                System.out.println("Exiting...");
            }
        }
    }
}
