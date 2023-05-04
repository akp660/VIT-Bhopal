package com.example.vitbhopal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

public class day_select extends AppCompatActivity {

    Spinner spinner;
    ArrayList<String> arrNames = new ArrayList<>();
    ArrayList<String> arrDays = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_select);

        spinner = findViewById(R.id.spinner);

        //  Code for Spinner

        arrDays.add("Monday");
        arrDays.add("Tuesday");
        arrDays.add("Wednesday");
        arrDays.add("Thursday");
        arrDays.add("Friday");
        arrDays.add("Saturday");
        arrDays.add("Sunday");

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, arrDays);
        spinner.setAdapter(spinnerAdapter);


    }
}