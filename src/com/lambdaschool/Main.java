package com.lambdaschool;

public class Main {

    public static void main(String[] args) {
        // Test cases
        CountedSet<String> set = new CountedSet<>();
        System.out.println(set.count("test")); // 0
        set.insert("test");
        set.insert("test");
        System.out.println(set.count("test")); // 2
        set.remove("test");
        set.remove("test");
        System.out.println(set.count("test")); //0

        set.remove("My name is Error");
        set.insert("thyme");
        set.insert("sage");
        set.insert("parsley");
        set.insert("rosemary");
        set.insert("basil");
        set.insert("oregano");
        System.out.println(set.count("oregano")); // 1
        set.insert("oregano");
        System.out.println(set.count("oregano")); // 2
        set.insert("oregano");
        System.out.println(set.count("oregano")); // 3
        set.removeAll("oregano");
        System.out.println(set.count("oregano")); // 0
        System.out.println(set.count("parsley")); // 1
        set.remove("parsley");
        System.out.println(set.count("parsley")); // 0
        set.remove("parsley");
    }
}
