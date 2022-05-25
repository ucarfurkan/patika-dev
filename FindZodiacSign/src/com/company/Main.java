package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int month,day;

    Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your month of birth (in numbers): ");
        month = scanner.nextInt();

        System.out.print("Please enter your day of birth (in numbers): ");
        day = scanner.nextInt();

        if(month == 1){
            if(day>=1 && day<=21){
                System.out.println("Capricorn");
            }
            else if(day<=31){
                System.out.println("Aquarius");
            }
            else{
                isError(true);
            }
        }

        else if(month == 2){
            if(day>=1 && day<=19){
                System.out.println("Aquarius");
            }
            else if(day<=28){
                System.out.println("Pisces");
            }
            else{
                isError(true);
            }
        }

        else if(month == 3){
            if(day>=1 && day<=20){
                System.out.println("Pisces");
            }
            else if(day<=31){
                System.out.println("Aries");
            }
            else{
                isError(true);
            }
        }

        else if(month == 4){
            if(day>=1 && day<=20){
                System.out.println("Aries");
            }
            else if(day<=30){
                System.out.println("Taurus");
            }
            else{
                isError(true);
            }
        }

        else if(month == 5){
            if(day>=1 && day<=21){
                System.out.println("Taurus");
            }
            else if(day<=31){
                System.out.println("Gemini");
            }
            else{
                isError(true);
            }
        }

        else if(month == 6){
            if(day>=1 && day<=22){
                System.out.println("Gemini");
            }
            else if(day<=30){
                System.out.println("Cancer");
            }
            else{
                isError(true);
            }
        }

        else if(month == 7){
            if(day>=1 && day<=22){
                System.out.println("Cancer");
            }
            else if(day<=31){
                System.out.println("Leo");
            }
            else{
                isError(true);
            }
        }

        else if(month == 8){
            if(day>=1 && day<=22){
                System.out.println("Leo");
            }
            else if(day<=31){
                System.out.println("Virgo");
            }
            else{
                isError(true);
            }
        }

        else if(month == 9){
            if(day>=1 && day<=22){
                System.out.println("Virgo");
            }
            else if(day<=30){
                System.out.println("Libra");
            }
            else{
                isError(true);
            }
        }

        else if(month == 10){
            if(day>=1 && day<=22){
                System.out.println("Libra");
            }
            else if(day<=31){
                System.out.println("Scorpio");
            }
            else{
                isError(true);
            }
        }

        else if(month == 11){
            if(day>=1 && day<=21){
                System.out.println("Scorpio");
            }
            else if(day<=30){
                System.out.println("Sagittarius");
            }
            else{
                isError(true);
            }
        }

        else if(month == 12){
            if(day>=1 && day<=21){
                System.out.println("Sagittarius");
            }
            else if(day<=31){
                System.out.println("Capricorn");
            }
        }

        else{
            isError(true);
        }

    }

    public static void isError(boolean x){
        if (x){
            System.out.println("Something wrong happened. Please check your inputs.");
        }
    }
}
