package com.teksystems;

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter weight in kilograms: ");
        double weight = scan.nextDouble();
        System.out.println("Enter height in meters: ");
        double height = scan.nextDouble();
        double BMI = weight / (height * height);
        if (BMI < 18.5D) {
            System.out.println("Underweight");
        } else if (BMI >= 18.5D && BMI < 25.0D) {
            System.out.println("Normal");
        } else if (BMI >= 25.0D && BMI < 30.0D) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        System.out.println("The BMI is " + BMI + " kg/m2");
        int zyear = 2022;
        switch (zyear % 12) {
            case 0:
                System.out.println("monkey");
                break;
            case 1:
                System.out.println("rooster");
                break;
            case 2:
                System.out.println("dog");
                break;
            case 3:
                System.out.println("pig");
                break;
            case 4:
                System.out.println("rat");
                break;
            case 5:
                System.out.println("ox");
                break;
            case 6:
                System.out.println("tiger");
                break;
            case 7:
                System.out.println("rabbit");
                break;
            case 8:
                System.out.println("dragon");
                break;
            case 9:
                System.out.println("snake");
                break;
            case 10:
                System.out.println("horse");
                break;
            case 11:
                System.out.println("sheep");
        }

        int tableSize = 12;

        int year;
        for (year = 1; year <= tableSize; ++year) {
            for (int j = 1; j <= tableSize; ++j) {
                System.out.printf("%4d", year * j);
            }

            System.out.println();
        }

        year = 0;

        for (double tuition = 10000.0D; tuition < 20000.0D; ++year) {
            System.out.printf(year + " %2f \n", tuition);
            tuition = 1.07D * tuition;
        }

        System.out.println("In " + year + " years tuition will be doubled");
    }
}
