package com.example.android_generics_counted;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CountedSet<T> {
 private ArrayList<T> data;
 private int pointer,size;
 private int defaultSize = 10;

 public CountedSet(){
     data =  new ArrayList<>(defaultSize);
     this.pointer = 0;
 }
 public CountedSet(int size){
     // instantiate
     data =  new ArrayList<>(size);

     this.pointer = 0;
 }
 public void insert(T value){
     // put the value into the array

     data.set(pointer,value);
     increasePointer();
 }
 public void remove(String value){
     //remove a single occurance of the value in the array
     for(int i = 0;i <= data.size();i++){
         if(data.get(i).equals(value)){
             data.remove(i);
             break;

         }
     }
 }
 public void increasePointer(){
     pointer++;
     if(pointer >= data.size()){
         pointer = 0;
     }
 }


}
