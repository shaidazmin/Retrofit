package com.learningbaby.retrofit;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class JavaViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    TextView name,hobey;;

    public JavaViewHolder(@NonNull View itemView) {

        super(itemView);

        itemView.setOnClickListener(this);
        name = itemView.findViewById(R.id.nameTextView);
        hobey = itemView.findViewById(R.id.hobeyTextView);
    }

    @Override
    public void onClick(View view) {

    }
}
