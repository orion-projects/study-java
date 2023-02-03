package org.example.concurrent;

public class Account {
    private int count;

    public Account(int count){
        this.count = count;
    }

    public void plus(int num){
        count += num;
    }

    public int getCount(){
        return this.count;
    }
}
