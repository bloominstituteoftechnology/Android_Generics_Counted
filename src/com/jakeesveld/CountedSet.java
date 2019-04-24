package com.jakeesveld;

import org.omg.CORBA.Object;

public class CountedSet<K> {
    private K[] keys;
    private int[] data;
    private int length;
    private int pointer;

    public CountedSet(int size){
        keys = (K[]) new Object[size];
        data = new int[size];
        length = size;
        pointer = 0;
    }
    public CountedSet(){
        keys = (K[]) new java.lang.Object[50];
        data = new int[50];
        length = 50;
        pointer = 0;
    }

    public void insert(K key){
        Boolean here = false;
        int index = -1;
        if(keys[0] != null) {
            for (int i = 0; i < keys.length - 1; ++i) {
                if (keys[i].equals(key)) {
                    here = true;
                    index = i;
                    break;
                }
            }
        }
        if(here){
            data[index] += 1;
        }else{
            keys[pointer] = key;
            data[pointer] = 1;
            increasePointer();
        }
    }

    public void remove(K key){
        if(keys[0] != null) {
            for (int i = 0; i < keys.length - 1; ++i) {
                if (keys[i].equals(key)) {
                    data[i] -= 1;
                    break;
                }
            }
        }
    }

    public int count(K key){
        int counted = 0;
        if(keys[0] != null) {
            for (int i = 0; i < keys.length - 1; ++i) {
                if (keys[i].equals(key)) {
                    counted = data[i];
                    break;
                }
            }
        }

        return counted;
    }


    private void increasePointer(){
        ++pointer;
        if(pointer >= length){
            pointer = 0;
        }
    }
}
