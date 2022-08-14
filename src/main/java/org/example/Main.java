package org.example;

import org.example.custom.Custom;
import org.example.interfaes.ByTwos;

public class Main {
    public static void main(String[] args) {
        //Regular data types
        ByTwos byTwos = new ByTwos();


        for(int i = 0; i < 5; i++) {
            System.out.println(byTwos.getNext());
            System.out.println();
        }
    }
}