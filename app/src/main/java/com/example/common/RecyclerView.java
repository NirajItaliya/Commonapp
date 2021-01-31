package com.example.common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RecyclerView extends AppCompatActivity {
    Button horizontalrecyclerview, verticalrecyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        horizontalrecyclerview = findViewById(R.id.horizontalrecyclerview);
        verticalrecyclerview = findViewById(R.id.verticalrecyclerview);

        horizontalrecyclerview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RecyclerView.this, horizontalrecyclerview.class));
            }
        });
        verticalrecyclerview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RecyclerView.this, verticalrecyclerview.class));
            }
        });
    }
}