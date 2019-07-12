package com.example.moon.recyclerviewwithdatabinding;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.moon.recyclerviewwithdatabinding.databinding.ItemAdapterBinding;

import java.util.ArrayList;

public class Custom_adapter extends RecyclerView.Adapter<Custom_adapter.MyViewHolder> {

    ArrayList<User> arrayList;
    Context context;

    public Custom_adapter(ArrayList<User> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ItemAdapterBinding itemAdapterBinding = DataBindingUtil.inflate(LayoutInflater.from(context),R.layout.item_adapter,viewGroup,false);
        MyViewHolder myViewHolder = new MyViewHolder(itemAdapterBinding);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        User user = arrayList.get(i);
        myViewHolder.itemAdapterBinding.setUser(user);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ItemAdapterBinding itemAdapterBinding;
        public MyViewHolder(@NonNull ItemAdapterBinding  itemAdapter) {
            super(itemAdapter.getRoot());
            itemAdapterBinding = itemAdapter;
        }
    }
}
