package com.example.vitbhopal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.vitbhopal.adapters.facultyInfoAdapters;
import com.example.vitbhopal.models.facultyInfoModelClass;

import java.util.ArrayList;
import java.util.List;

public class facuilty_info extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    List<facultyInfoModelClass> userList;
    facultyInfoAdapters facultyInfoAdapters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facuilty_info);

        initData();
        initRecyclerView();
    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView1);
        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        facultyInfoAdapters = new facultyInfoAdapters(userList);
        recyclerView.setAdapter(facultyInfoAdapters);
        facultyInfoAdapters.notifyDataSetChanged();
    }

    private void initData() {
        userList = new ArrayList<>();

        userList.add(new facultyInfoModelClass("Name 1"));
        userList.add(new facultyInfoModelClass("Name 2"));
        userList.add(new facultyInfoModelClass("Name 3"));
    }


}