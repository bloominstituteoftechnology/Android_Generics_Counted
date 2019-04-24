package com.example.android_generics_counted;

import java.util.ArrayList;

public class CountedSet<T> {
    private ArrayList<T> data;
    private int pointer;
    private int defaultSize = 10;

 public CountedSet(){
     data = new ArrayList<>(defaultSize);
     pointer = 0;
 }
 public void insert(T value){
     // put the value into the array
     data.add(value);
     increasePointer();


 }
 public void remove(String value){
     //remove a single occurance of the value in the array
     for(int i = 0;i <= data.size()-1;i++){
         if(data.get(i).equals(value)) {
             data.remove(i);
             pointer = i;
             break;
         }else{
             System.out.println("none found");

         }
     }
 }
 public void increasePointer(){
     pointer++;
     if(pointer >= data.size()){
         pointer = 0;
     }
 }
 public int count(String value){
     int count = 0;
     if(data.size() != 0){
     for(int i = 0; i < data.size();i++){
         if(data.get(i).equals(value)){
             count = count+1;
         }
     }}
     return count;
 }

}
