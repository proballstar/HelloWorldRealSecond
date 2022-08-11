package org.example.math;

public class Math {
    public static void main(String[] args) {
        int ten = 10;
        int two = 2;
        int add = ten + two;
        int mult = ten * two;
        int div = ten / two;
        int sub = ten - two;
        double exp = java.lang.Math.pow((double) ten, (double) two);
        System.out.println(add);
        System.out.println(mult);
        System.out.println(div);
        System.out.println(sub);
        System.out.println(exp);
    }
}
