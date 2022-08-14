package org.example.loops;

public class Loops {
    public static void main(String[] args) {
        String[] letters = {"A", "B", "C", "D"};
        String[] names = {"Anna", "Bob", "Chris", "Dwayne", "Ethan"};
        for (String letter: letters) {
            if(letter.equals("A")) {
                continue;
            }
        }

        for (String name: names) {
            if (name.equals(names[name.length() - 2])) {
                System.out.println(name);
                break;
            } else {
                System.out.println(name.indexOf(name) + "is the index of " + name);
            }
        }
    }
}
