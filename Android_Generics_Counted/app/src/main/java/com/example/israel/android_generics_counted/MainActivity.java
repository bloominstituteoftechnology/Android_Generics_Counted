package com.example.israel.android_generics_counted;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CountedSet<String> strs = new CountedSet<>();
        strs.insert("test");
        strs.insert("test");
        int strsCount1 = strs.count("test");
        strs.remove("test");
        strs.remove("test");
        int strsCount2 = strs.count("test");

        CountedSet<Integer> ints = new CountedSet<>();
        ints.insert(1);
        ints.insert(1);
        int intsCount1 = ints.count(1);
        ints.remove(1);
        ints.remove(1);
        int intsCount2 = ints.count(1);
        
    }
}
