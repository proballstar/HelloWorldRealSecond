package org.example.interfaes;

public class ByThrees implements Series {
    int val;

    ByThrees() {
        val = 0;
    }

    public int getNext() {
        return val += 3;
    }
}
