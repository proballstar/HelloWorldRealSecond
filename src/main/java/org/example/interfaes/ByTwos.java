package org.example.interfaes;

public class ByTwos implements Series {
    int val;

    public ByTwos(){
        val = 0;
    }

    public int getNext() {
        return val += 2;
    }
}
