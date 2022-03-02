package com.teksystems;

import java.util.Arrays;

public class ArrayPractice {

    public static void ProblemOne(){
        int array [] = {1,2,3};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void ProblemTwo(){
        int array [] = {13,5,7,68,2};
        System.out.print(array[array.length/2]);

    }

    public static void ProblemThree(){
        String[] colors = {"red", "green", "blue", "yellow"};
        System.out.println(colors.length);
        String[] copy = colors.clone();
        System.out.println(Arrays.toString(copy));
    }

    public static void ProblemFour(){
        int arr [] = {1,15,3,6,11};
        System.out.println(arr[0] + ", " + arr[arr.length-1]);
        //System.out.println(arr[arr.length]);
        //throws out of bounds exception
        //arr[5] = 14;

    }

    public static void ProblemFive(){
        int arr [] = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void ProblemSix(){
        int arr [] = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i * 2;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void ProblemSeven(){
        int arr [] = {3,6,13,9,2};
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == arr[arr.length/2]){
                continue;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void ProblemEight() {
        String arr [] = {"bo", "carter", "skie", "mazzy", "ric"};
    }

    public static void ProblemNine() {

    }

    public static void ProblemTen() {

    }









    public static void main(String[] args){
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

    }
}
