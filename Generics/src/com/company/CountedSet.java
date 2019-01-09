package com.company;

import java.util.ArrayList;

public class CountedSet<T>{
    private ArrayList<T>info;
    private int count;

    public CountedSet() {
        this.info = new ArrayList<>();
        this.count = 0;
    }

    public void insert(T element){
        info.add(element);
    }

    public void remove(T element){
        for (int i = 0; i < info.size() ; i++) {
            if (info.get(i) == element){
                info.remove(element);
            }
        }
    }

    public int getCount(T element){
        count = 0;
        for (T item:info) {
            if (item == element){
                count++;
            }
        }
        return count;
    }
}
