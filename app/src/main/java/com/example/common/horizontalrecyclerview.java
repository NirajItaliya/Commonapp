package com.example.common;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class horizontalrecyclerview extends AppCompatActivity {
    Button gallary, add, camera, ce;
    EditText edit;
    ImageView image;
    private RecyclerView recyclerView;
    private StudentAdapter studentAdapter;
    private List studentDataList = new ArrayList<>();
    Uri image1;
    Bitmap currentImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontalrecyclerview);

        Bind();
        studentAdapter = new StudentAdapter(studentDataList, horizontalrecyclerview.this);
        final RecyclerView.LayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(studentAdapter);
        StudentDataPrepare();
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, 1);
            }
        });
        gallary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent photoPickerIntent = new Intent(Intent.ACTION_PICK);
                photoPickerIntent.setType("image/*");
                startActivityForResult(photoPickerIntent, 2);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edit.getText().toString();
                if ((image1 != null) || (currentImage != null)) {
                    if ((image1 != null)) {
                        studentDataList.add(new studentData(image1, s));
                    } else if ((currentImage != null)) {
                        studentDataList.add(new studentData(currentImage, s));
                    }
                } else {
                    Toast.makeText(horizontalrecyclerview.this, "select image", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case 1:
                currentImage = (Bitmap) data.getExtras().get("data");
                image.setImageBitmap(currentImage);
                break;
            case 2:
                if (resultCode == RESULT_OK && requestCode == 2) {
                    image1 = data.getData();
                    image.setImageURI(image1);
                    break;
                }
        }
    }

    private void StudentDataPrepare() {
        studentDataList.add(new studentData(R.drawable.a9, "mail"));
        studentDataList.add(new studentData(R.drawable.a1, "whatsapp"));
        studentDataList.add(new studentData(R.drawable.a2, "facebooks"));
    }

    private void Bind() {

        gallary = findViewById(R.id.gallary);
        edit = findViewById(R.id.edit);
        add = findViewById(R.id.add);
        image = findViewById(R.id.image);
        camera = findViewById(R.id.camera);
        recyclerView = findViewById(R.id.recycler_view);
    }
}