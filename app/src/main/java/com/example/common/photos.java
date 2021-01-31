package com.example.common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class photos extends AppCompatActivity {
    ImageView imageView;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photos);
        imageView = (ImageView) findViewById(R.id.imageView1);


        Bitmap currentImage = (Bitmap) getIntent().getExtras().get("name");
        imageView.setImageBitmap(currentImage);
        
        Uri b = (Uri) getIntent().getExtras().get("image");
        imageView.setImageURI(b);
    }

}