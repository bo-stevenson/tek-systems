package com.teksystems;

public class Loops {

    public static void ProblemOne(){
        int i;
        for(i=1; i <= 10; i++){
            System.out.printf(i + " ");
        }

    }

    public static void ProblemTwo(){
        int i = 0;

        while(i <= 100){
            System.out.printf(i + " ");
             i = i + 10;
        }
    }

    public static void ProblemThree(){
        int i = 1;
        do{
            System.out.printf(i + " ");
            i++;

        }while(i <= 10);
    }

    public static void ProblemFour(){
        int i;
        for(i=1; i <= 100; i++){
            if (i > 25 && i < 75){
                continue;
            }
            if (i % 5 == 0) {
                System.out.printf(i + " ");
            }
        }
    }

    public static void ProblemFive(){
        for (int i = 1; i <= 100; i++){
            if(i > 50) break;

            if (i % 5 == 0) {
                System.out.printf(i + " ");
            }

        }
    }

    public static void ProblemSix(){

        for(int i = 1; i<=2; i++) {
            System.out.println("Week" + " " + i + ":");

            for (int j = 1; j <= 5; j++) {
                System.out.println("Day" + " " + j);
            }
        }
    }

    static void ProblemSeven(){
        int num1;
        int num2;
        for(int i = 10; i <= 200; i++){
            num1 = i;
            num2 = 0;
            while (num1 != 0) {
                int rem = num1 % 10;
                num1 /= 10;
                num2 = num2 * 10 + rem;
            }
            if (i == num2)
                System.out.print(i + " ");
        }

    }

    static void ProblemEight(){
        int x = 0;
        int y = 1;

        int count = 0;

        while (count < 10){
            System.out.print(x + " ");

            int z = y + x;

            x = y;
            y = z;
            count = count + 1;
        }
    }

    static void ProblemNine(){
        int x = 3;
        int y = 2;

        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                System.out.println("Inner loop: i: " + i + ", j: " + j);
            }
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
        System.out.println();
        ProblemSeven();
        System.out.println();
        ProblemEight();
        System.out.println();
        ProblemNine();
    }

}
