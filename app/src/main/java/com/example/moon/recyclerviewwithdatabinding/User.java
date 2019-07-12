package com.example.moon.recyclerviewwithdatabinding;

import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;

public class User {
    public String name,email;
    int image_id;

    public User() {
    }

    public User(String name, String email,int Image_id) {
        this.name = name;
        this.email = email;
        this.image_id = Image_id;
    }

    @BindingAdapter("android:ImageUrl")
    public static void loadImage(View view,int imageid){
        ImageView imageView = (ImageView)view;
        imageView.setImageResource(imageid);
    }

    public int getImage_id() {
        return image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

