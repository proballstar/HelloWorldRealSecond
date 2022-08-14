package org.example.challenges.fib;


//Complete the Fibonacci Sequence
public class Fib {
    public static void main(String[] args) {
        int numOuputs = 20;
        int start = 0;
        int prev = 1;
        int current = 1;
        int results = 1;
        System.out.println(start);
        System.out.println(prev);
        System.out.println(current);
        prev = current;
        while (results < numOuputs) {
            add(prev, current);
            System.out.println(current);
            prev = current;
            results++;
        }
    }

    public static int add(int prev, int cur) {
        System.out.println(new int[]{prev, cur});
        return prev + cur;
    }
}
