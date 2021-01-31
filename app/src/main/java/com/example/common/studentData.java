package com.example.common;

import android.graphics.Bitmap;
import android.net.Uri;

public class studentData {
    public String name;
    int image;
    Uri image1;
    Bitmap image3;
    int age;
    public studentData(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public studentData(Bitmap image3, String name) {
        this.image3 = image3;
        this.name = name;
    }

    public studentData(Uri image1, String name) {
        this.image1 = image1;
        this.name = name;
    }

    public studentData(int image, String name) {
        this.image = image;
        this.name = name;
    }

    public Bitmap getImage3() {
        return image3;
    }

    public void setImage3(Bitmap image3) {
        this.image3 = image3;
    }

    public Uri getImage1() {
        return image1;
    }

    public void setImage1(Uri image1) {
        this.image1 = image1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
