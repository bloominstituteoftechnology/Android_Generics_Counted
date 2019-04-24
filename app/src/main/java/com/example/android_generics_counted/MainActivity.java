package com.example.android_generics_counted;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CountedSet<String> set = new CountedSet<>();
        System.out.println(set.count("test"));
        set.insert("test");
        set.insert("test");
        System.out.println(set.count("test"));
        set.remove("test");
        set.remove("test");
        System.out.println(set.count("test"));
        set.insert("test2");
        set.insert("test3");
        System.out.println(set.count("test"));
        System.out.println(set.count("test2"));
        System.out.println(set.count("test3"));
        System.out.println(set.count("randomname"));
        set.remove("test");
        System.out.println(set.count("test"));
        set.insert("test");
        set.insert("test");
        set.insert("test");
        set.insert("test");
        set.insert("test");
        System.out.println(set.count("test"));



    }
}
