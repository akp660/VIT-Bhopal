package com.example.vitbhopal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class facuilty_info extends AppCompatActivity {
ListView listView;
ArrayList<String> arrNames = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facuilty_info);

        listView = findViewById(R.id.listView);

        arrNames.add("Ram");
        arrNames.add("Ram");
        arrNames.add("Ram");
        arrNames.add("Ram");
        arrNames.add("Ram");
        arrNames.add("Ram");
        arrNames.add("Ram");
        arrNames.add("Ram");
        arrNames.add("Ram");
        arrNames.add("Ram");
        arrNames.add("Ram");
        arrNames.add("Ram");
        arrNames.add("Ram");
        arrNames.add("Ram");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, arrNames);
        listView.setAdapter(adapter);


    }
}