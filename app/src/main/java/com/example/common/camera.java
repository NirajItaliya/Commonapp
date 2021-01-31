package com.example.common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.ByteArrayOutputStream;

public class camera extends AppCompatActivity {
    Button camera, opengallery;
    private Bitmap currentImage;

    Uri imageUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        camera = (Button) findViewById(R.id.camera);
        opengallery = (Button) findViewById(R.id.opengallery);

        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, 1);
            }
        });

        opengallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent photoPickerIntent = new Intent(Intent.ACTION_PICK);
                photoPickerIntent.setType("image/*");
                startActivityForResult(photoPickerIntent, 2);
            }
        });

    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case 1:
                currentImage = (Bitmap) data.getExtras().get("data");
                Intent i = new Intent(camera.this, photos.class);
                i.putExtra("name", currentImage);
                startActivity(i);
                break;
            case 2:
                if (resultCode == RESULT_OK && requestCode == 2) {
                    imageUri = data.getData();
                    /* i1.setImageURI(imageUri);*/
                    Intent b = new Intent(camera.this, photos.class);
                    b.putExtra("image", imageUri);
                    startActivity(b);
                    break;
                }
        }
    }
}




