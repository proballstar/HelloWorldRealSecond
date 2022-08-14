package org.example.custom;

import java.time.LocalDate;

public class Custom {
    public static void main() {
        Basketball NBA = new Basketball("orange", 13, "Spalding", 16, true);
        Basketball Target = new Basketball("blue", 10, "Wilson", 12, false);
        System.out.println(NBA.color);
        System.out.println(NBA.company);
        System.out.println(NBA.isAdultSized);
        System.out.println(NBA.bouncy);
        System.out.println(Target.company);
        System.out.println(Target.isAdultSized);
        System.out.println(Target.color);
        Passport UnitedStatesAmericaPassport = new Passport("12345", LocalDate.of(2030, 12, 31));
        System.out.println(UnitedStatesAmericaPassport.expiryDate.getDayOfWeek());
    }
    static class Basketball {
        String color;
        double bouncy;
        String company;
        double diamater;
        boolean isAdultSized;

        Basketball(String color, double bouncy, String company, double diamater, boolean isAdultSized) {
            this.color = color;
            this.bouncy = bouncy;
            this.company = company;
            this.diamater = diamater;
            this.isAdultSized = isAdultSized;
        }

        public static void bounce() {
            System.out.println("Bouncing "  + "inches");
        }
    }

    static class Passport {
        String number;
        LocalDate expiryDate;

        Passport(String number, LocalDate expiryDate) {
            this.number = number;
            this.expiryDate = expiryDate;
        }
    }
}
