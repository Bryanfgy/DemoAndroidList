package com.example.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    ArrayList<AndroidVersion> al;
//  ArrayAdapter<AndroidVersion> aa;

    CustomAdapter adapter;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.listV);
        al = new ArrayList<>();

        al.add(new AndroidVersion("Pie", "9.0"));
        al.add(new AndroidVersion("Oreo", "8.0"));
        al.add(new AndroidVersion("Nougat","7.0"));
        al.add(new AndroidVersion("Marshmallow", "6.0"));
        al.add(new AndroidVersion("Lollipop", "5.0"));
        al.add(new AndroidVersion("KitKat","4.4"));
        al.add(new AndroidVersion("Jelly Bean","4.1"));
//        aa = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,al);
        adapter = new CustomAdapter(this,R.layout.row,al);
        lv.setAdapter(adapter);
    }
}