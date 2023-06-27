package com.example.vitbhopal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.vitbhopal.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class bottom_nav extends AppCompatActivity {
    BottomNavigationView bnView;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav);

        bnView = findViewById(R.id.bnView);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



    }
}