package org.example.packages;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import org.example.print.Print;

public class Packages {
    public static void main(String[] args) {
        Print print = new Print();
        Date date = new Date();
        LocalDate localDate = LocalDate.now();
        LocalDateTime time = LocalDateTime.now();
        print.print(date.toString());
        print.print(localDate.toString());
    }
}
