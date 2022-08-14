package org.example.arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[2];
        String[] names = {"Aly", "Bob", "Nisha"};

        numbers[1] = 1;
        numbers[0] = 10;
        System.out.println(java.util.Arrays.toString(numbers));
        System.out.println(names.length);
    }
}
