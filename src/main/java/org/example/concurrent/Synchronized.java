package org.example.concurrent;

import java.util.Random;

public class Synchronized {

    private int from = 100;
    private int to = 100;
    synchronized private void method(int num){
        from += num;
        to -= num;
    }

    public void transfer(){
        int j = new Random().nextInt(-10, 10);
        method(j);
    }

    @Override
    public String toString(){
        return from + to + "";
    }
}
