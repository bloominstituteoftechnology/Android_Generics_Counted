package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        CountedSet<String> set = new CountedSet<>();
        System.out.println(set.getCount("test")); // 0
        set.insert("test");
        set.insert("test");
        System.out.println(set.getCount("test")); // 2
        set.remove("test");
        set.remove("test");
        System.out.println(set.getCount("test")); //0
    }
}
