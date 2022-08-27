package com.example.lesson3_2month;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NumberViewHolder extends RecyclerView.ViewHolder {
    private TextView number_tx;
    public NumberViewHolder(@NonNull View itemView) {
        super(itemView);
        number_tx=itemView.findViewById(R.id.item_numbers);

    }
    public void bind(Integer number_int ){
        number_tx.setText(number_int);
    }
}
