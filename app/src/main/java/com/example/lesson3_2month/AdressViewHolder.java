package com.example.lesson3_2month;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class AdressViewHolder extends RecyclerView.ViewHolder {
    private TextView adres_tx;
    public AdressViewHolder(@NonNull View itemView) {
        super(itemView);
        adres_tx=itemView.findViewById(R.id.adress_item);

    }
public void bind (Object adress_name){
        adres_tx.setText(adress_name.toString());
}
}
