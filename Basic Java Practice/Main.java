package com.teksystems;

public class Main {

    public static void main(String[] args) {

        //1
        int var1 = 6;
        int var2 = 7;
        int sum = var1 + var2;
        System.out.println(sum);

        //2
        double d1 = 4.5;
        double d2 = 2.4;
        double dSum = d1 + d2;
        System.out.println(dSum);

        //3
        double a = 4.3;
        int b = 5;
        double c = a + b;
        System.out.println(c);

        //4
        double big = 60.5;
        double small = 5;
        double quotient = big / small;
        System.out.println(quotient);
        int value = (int) quotient;
        System.out.println(value);

        //5
        int x = 5;
        int y = 6;
        double q = 0;
        q = y / x;
        System.out.println(q);
        double z = y;
        q = (z / x);
        System.out.println(q);

        //6
        final double Pi = 3.14;
        double radius = 25;
        double area = (Pi * radius * radius);
        System.out.println(area);

        //7
        double coffee = 4.50;
        double espresso = 6.75;
        double boba = 8;

        double subtotal = 3 * coffee + 4 * espresso + 2 * boba;
        System.out.println("Subtotal is: " + subtotal);
        final double SALES_TAX = 0.15;
        double totalSale = subtotal - (SALES_TAX * subtotal);
        System.out.println("Total Sale is: " + totalSale);




    }
}
