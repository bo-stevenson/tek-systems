package com.teksystems;

import java.util.Scanner;

public class Conditional {

    public static void ProblemOne(){
        int x = 7;

        if(x < 10) {
            System.out.println("x is less than 10");

        }

        x=15;

        if (x<10) {
            System.out.println("X is less than 10");
        }
    }

    public static void ProblemTwo(){
        int x = 7;
        if(x < 10) System.out.println("x is less than 10");
            else System.out.println("x is greater than 10");

        x = 15;

        if(x < 10) System.out.println("x is less than 10");
        else System.out.println("x is greater than 10");

    }

    public static void ProblemThree() {
        int x = 15;

        if (x < 10) System.out.println("x is less than 10");
        else if (x < 20) System.out.println("x is between 10 and 20");
        else System.out.println("x is greater than or equal to 20");

        x = 50;
        if (x < 10) System.out.println("x is less than 10");
        else if (x < 20) System.out.println("x is between 10 and 20");
        else System.out.println("x is greater than or equal to 20");

    }

    public static void ProblemFour() {
        int x = 15;

        if (x < 10 || x > 20) System.out.println("Out of range");
        else System.out.println("In range");

        x = 50;

        if (x < 10 || x > 20) System.out.println("Out of range");
        else System.out.println("In range");


    }
    public static void ProblemFive() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a score: ");
        int score = scan.nextInt();

        if (score <= 100 && score >= 90) System.out.println("A");
        else if (score <= 89 && score >= 80) System.out.println("B");
        else if (score <= 79 && score >= 70) System.out.println("C");
        else if (score <= 69 && score >= 60) System.out.println("D");
        else if (score < 60) System.out.println("F");
        else System.out.println("Out of Range");

    }
    public static void ProblemSix() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number 1-7");
        int day = scan.nextInt();
        switch(day){
            case 1: System.out.println("Mon");
                break;
            case 2: System.out.println("Tue");
                break;
            case 3: System.out.println("Wed");
                break;
            case 4: System.out.println("Thurs");
                break;
            case 5: System.out.println("Fri");
                break;
            case 6: System.out.println("Sat");
                break;
            case 7: System.out.println("Sun");
                break;
            default:
                System.out.println("Out of Range");

        }

    }




    public static void main(String[] args) {

        ProblemOne();
        System.out.println();
        ProblemTwo();
        System.out.println();
        ProblemThree();
        System.out.println();
        ProblemFour();
        System.out.println();
        ProblemFive();
        System.out.println();
        ProblemSix();
    }
}
