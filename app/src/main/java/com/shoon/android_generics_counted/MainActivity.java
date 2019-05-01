package com.shoon.android_generics_counted;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=findViewById(R.id.text);
        CountedSet<String> set = new CountedSet<>();
        tv.setText(set.strCount("test")); // 0
        set.insert("test");
        set.insert("test");
        tv.append(set.strCount("test")); // 2
        set.remove("test");
        set.remove("test");
        tv.append(set.strCount("test")); //0

    }
}
