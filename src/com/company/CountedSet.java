package com.company;


import java.util.ArrayList;
import java.util.List;

    public class CountedSet<T> {

        List ls = new ArrayList<>();


        public void insert(String string) {
            ls.add(string);
            count(string);
        }


        public int count(String a) {
            int count = 0;

            for(int i = 0; i < ls.size(); i++) {
                if (ls.contains(a)){
                    count++;
            }

            }
            return count;
        }

        public void remove (String string) {
            ls.remove(string);

        }

    }