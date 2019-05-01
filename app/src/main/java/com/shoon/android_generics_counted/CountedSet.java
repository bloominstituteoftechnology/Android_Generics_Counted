package com.shoon.android_generics_counted;

import java.util.ArrayList;

public class CountedSet<T> {
    T o;
    ArrayList<T> alT;
    public T getO() {
        return o;

    }

    public void setO(T o) {
        this.o = o;
    }

    public CountedSet() {
        alT=new ArrayList<T>(1);
    }

    public CountedSet(T o) {
        this.o = o;
    }

    public void insert(T o){
        alT.add(o);
    }

    public void remove(T o){
        alT.remove(o);

    }

    public int count(T o){
        return alT.size();
    }
    public String strCount(T o){
        return new Integer(count(o)).toString();
    }
}
