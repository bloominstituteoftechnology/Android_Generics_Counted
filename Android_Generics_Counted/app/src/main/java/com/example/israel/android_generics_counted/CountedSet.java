package com.example.israel.android_generics_counted;

import java.util.ArrayList;

public class CountedSet <T>{

    private ArrayList<T> set = new ArrayList<>();

    public void insert(T elem) {
        set.add(elem);
    }

    public boolean remove(T elem) {
        return set.remove(elem);
    }

    public int count(T elem) {
        int count = 0;
        for (T setElem : set) {
            if (setElem.equals(elem)) {
                ++count;
            }
        }

        return count;
    }

}
