package org.example.concurrent;

public class Volatile {
    public Object object = null;
    public volatile Object vObject = null;

    public final Object fObject;

    public Volatile(Object fObject){
        this.fObject = fObject;
    }
}
