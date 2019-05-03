package com.learningbaby.retrofit;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<JavaViewHolder> {

    private List<User> userList;

    public RecyclerViewAdapter (List<User> userList){
        this.userList = userList;
    }


    @Override
    public JavaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.customo_layout,null);
        JavaViewHolder javaViewHolder =  new JavaViewHolder(view);
        return javaViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull JavaViewHolder javaViewHolder, int i) {

        javaViewHolder.name.setText(userList.get(i).getName());
        javaViewHolder.hobey.setText(userList.get(i).getHobey());

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }
}
