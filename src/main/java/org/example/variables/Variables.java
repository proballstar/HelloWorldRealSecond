package org.example.variables;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Variables {
    public static void main(String[] args) {

        //primitive
        double number = 100.01;
        String brand = "Skyforce@EnhanceTheWorld";
        byte myByte = (byte) 1234; //must be between -128 => 127
        short myShort = 1234;
        int theInt = 213;
        long theLong = 432;
        Date date = new Date();

        float pi = 3.14F;
        double doubleMeNo = 23123;
        boolean AmICool = true;
        char nameIniital = 'A';

        //reference types
        String myname = "Rohan J. Fernandes";
        //OR
        String MyName = new String("Rohan J. Fernandes");
        LocalDate local = LocalDate.now();
        System.out.println(MyName.equals(myname));
    }
}
