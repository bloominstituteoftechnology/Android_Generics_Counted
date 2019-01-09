package com.company;

import java.util.ArrayList;

public class CountedSet<T>{
    private ArrayList<T>info;
    private int count;

    public CountedSet() {
        this.info = new ArrayList<>();
        this.count = 0;
    }
}
