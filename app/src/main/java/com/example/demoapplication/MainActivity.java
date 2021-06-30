package com.example.demoapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<String> sectionList = new ArrayList<>();
    HashMap<String, ArrayList<String>> itemList = new HashMap<>();

    MainAdapter mainAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        sectionList.add("Morning");
        sectionList.add("Afternoon");
        sectionList.add("Evening");
        sectionList.add("Night");

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("5:00 AM");
        arrayList.add("6:00 AM");
        arrayList.add("7:00 AM");
        arrayList.add("8:00 AM");
        arrayList.add("9:00 AM");
        arrayList.add("10:00 AM");
        arrayList.add("11:00 AM");
        itemList.put(sectionList.get(0),arrayList);

        arrayList = new ArrayList<>();

        arrayList.add("12:00 PM");
        arrayList.add("1:00 PM");
        arrayList.add("2:00 PM");
        arrayList.add("3:00 PM");
        arrayList.add("4:00 PM");
        itemList.put(sectionList.get(1),arrayList);

        arrayList = new ArrayList<>();

        arrayList.add("5:00 PM");
        arrayList.add("6:00 PM");
        arrayList.add("7:00 PM");
        arrayList.add("8:00 PM");
        itemList.put(sectionList.get(2),arrayList);

        arrayList = new ArrayList<>();

        arrayList.add("9:00 PM");
        arrayList.add("10:00 PM");
        arrayList.add("11:00 PM");
        arrayList.add("12:00 AM");
        arrayList.add("1:00 AM");
        arrayList.add("2:00 AM");
        arrayList.add("3:00 AM");
        arrayList.add("4:00 AM");
        itemList.put(sectionList.get(3),arrayList);

        mainAdapter = new MainAdapter(this, sectionList, itemList);

        GridLayoutManager manager = new GridLayoutManager(this, 3);

        recyclerView.setLayoutManager(manager);

        mainAdapter.setLayoutManager(manager);

        mainAdapter.shouldShowHeadersForEmptySections(false);

        recyclerView.setAdapter(mainAdapter);

    }
}