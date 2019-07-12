package com.example.moon.recyclerviewwithdatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.moon.recyclerviewwithdatabinding.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.myRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        activityMainBinding.myRecyclerView.hasFixedSize();
        ArrayList<User> users = getUsers();
        Custom_adapter custom_adapter = new Custom_adapter(users,getApplicationContext());
        activityMainBinding.myRecyclerView.setAdapter(custom_adapter);

    }

    ArrayList<User> getUsers(){
        ArrayList<User> users_data = new ArrayList<User>();
        users_data.add(new User("Mustofa","mooncseru14@gmail.com",R.drawable.images));
        users_data.add(new User("Konok","konok.gcc@gmail.com",R.drawable.images));
        return users_data;
    }

}
