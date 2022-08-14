package org.example.logical;

import java.util.Locale;

public class Logical {
    public static void main(String[] args) {
        boolean isAdult = false;
        boolean isStudent = true;

        //2 trues (true) else (false)
        System.out.println(isAdult && isStudent);

        //2 false (false) else true
        System.out.println(isAdult || isStudent);
        String role = "Adult";
        String _role_ = role == "Adult" ? "Adulthood" : "Time to play games";



        if (role.equals("Adult")) {
            System.out.println("Less go. I am an adult");
        } else if (role.equals("Baby")) {
            System.out.println("Sad, I am not an adult");
        }

        if(isStudent) {
            System.out.println("Time to start studying...");
        } else {
            System.out.println("Less go, I get to make money now!");
        }

        String bbalTeam = "WARRIORS";

        switch (bbalTeam) {
            case "WARRIORS":
                System.out.println("Nice job, you won the championship");
                break;
            case "LAKERS":
                System.out.println("Your team is kinda bad ngl #westbrook #lbj #ad");
                break;
            case "ROCKETS":
                System.out.println("You might get to stardom, with the young core of #jalengreen #sengun #kpj #jabarisj");
                break;
            case default:
                System.out.println("Your team is: " + bbalTeam);
                break;
        }
    }
}
