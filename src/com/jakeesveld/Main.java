package com.jakeesveld;

public class Main {

    public static void main(String[] args) {
        CountedSet<String> set = new CountedSet<>();
        System.out.println(set.count("test")); // 0
        set.insert("test");
        set.insert("test");
        System.out.println(set.count("test")); // 2
        set.remove("test");
        set.remove("test");
        System.out.println(set.count("test"));
    }
}
