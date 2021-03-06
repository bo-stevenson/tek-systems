package com.teksystems;

public class Operators {
    public static void ProblemSetOne() {
        int x = 2; //0010
        System.out.println(Integer.toBinaryString(x));
        x <<=1; //0100,4
        System.out.println(Integer.toBinaryString(x) + ", " + x);

        x = 9; //1001
        System.out.println(Integer.toBinaryString(x));
        x <<= 1; //0001 0010, 18
        System.out.println(Integer.toBinaryString(x) + ", " + x);

        x = 17; //0001 0001
        System.out.println(Integer.toBinaryString(x));
        x <<= 1; //0010 0010, 34
        System.out.println(Integer.toBinaryString(x) + ", " + x);

        x = 88; //0101 1000
        System.out.println(Integer.toBinaryString(x));
        x <<= 1; //1011 0000, 176
        System.out.println(Integer.toBinaryString(x) + ", " + x);
    }

    public static void ProblemSetTwo(){
        int x = 150; //10010110
        System.out.println(Integer.toBinaryString(x));
        x >>= 2; //100101, 37
        System.out.println(Integer.toBinaryString(x) + ", " + x);

        x = 225; //1110 0001
        System.out.println(Integer.toBinaryString(x));
        x >>=2;//0011 1000, 56
        System.out.println(Integer.toBinaryString(x) + ", " + x);

        x = 1555;//0110 0001 0011
        System.out.println(Integer.toBinaryString(x));
        x >>= 2; //0001 1000 0100, 388
        System.out.println(Integer.toBinaryString(x) + ", " + x);

        x = 32456; //0111 1110 1100 1000
        System.out.println(Integer.toBinaryString(x));
        x >>= 2;
        System.out.println(Integer.toBinaryString(x) + ", " + x);

    }

    public static void ProblemSetThree(){
        int x = 7;
        int y = 17;
        int z;

        z = x & y;
        System.out.println(Integer.toBinaryString(z) + ", " + z);
        //0001, 1
        z = x|y;
        System.out.println(Integer.toBinaryString(z) + ", " + z);
        //10111 , 23
    }

    public static void ProblemSetFour(){
        int x = 1;
        System.out.println("X is "+ x);
        x++;
        System.out.println("After X is " + x);
    }

    public static void ProblemSetFive(){
        int x = 1;

        int y = 1;

        int z = 1;

        x = ++x;
        System.out.println(x);
        y = y++;
        System.out.println(y);
        z += 1;
        System.out.println(z);
    }

    public static void ProblemSetSix(){
        int x= 5;
        int y = 8;
        int sum = ++x + y;
        System.out.println(sum); //14
        x = 5;
        sum = x++ + y;
        System.out.println(sum); //13
    }

    public static void main(String[] args){
        ProblemSetOne();
        System.out.println();
        ProblemSetTwo();
        System.out.println();
        ProblemSetThree();
        System.out.println();
        ProblemSetFour();
        System.out.println();
        ProblemSetFive();
        System.out.println();
        ProblemSetSix();
    }
}
