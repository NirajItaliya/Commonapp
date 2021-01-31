package com.example.common;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class verticalrecyclerview extends AppCompatActivity {
    private RecyclerView recyclerView;
    private StudentAdapter studentAdapter;
    private ArrayList<studentData> studentDataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verticalrecyclerview);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.vrecycler_view);

        studentAdapter =new StudentAdapter(studentDataList, verticalrecyclerview.this);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(studentAdapter);
        StudentDataPrepare();

    }
    private void StudentDataPrepare() {
        studentDataList.add(new studentData("sai", 25));
        studentDataList.add(new studentData("raghu", 20));
        studentDataList.add(new studentData("raj", 28));
        studentDataList.add(new studentData("amar", 15));
        studentDataList.add(new studentData("bapu", 19));
        studentDataList.add(new studentData("chandra", 52));
        studentDataList.add(new studentData("deraj", 30));
        studentDataList.add(new studentData("eshanth", 28));
    }
}