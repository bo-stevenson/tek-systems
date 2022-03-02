package com.teksystems.ManagerTrainee;

public class InheritanceActivity {

    private static void testOne(){
        Manager m1 = new Manager(126534L, "Peter","Chennai India", 237844L, 65000.0);
        System.out.println(m1.calculateSalary());
        System.out.println(m1.calculateTransportAllowance());
    }

    private static void testTwo(){
        Trainee t1 = new Trainee(29846L,"Jack", "Mumbai India", 442085L, 45000D);
        System.out.println(t1.calculateSalary());
        System.out.println(t1.calculateTransportAllowance());
    }

    public static void main(String[] args) {
        testOne();
        System.out.println();
        testTwo();

    }
}
