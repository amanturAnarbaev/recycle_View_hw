package com.example.lesson3_2month;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterForNumber extends RecyclerView.Adapter<NumberViewHolder> {
    private ArrayList<Integer> number_list;

    public AdapterForNumber(ArrayList<Integer> number_list) {
        this.number_list = number_list;
    }

    @NonNull
    @Override
    public NumberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NumberViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_numbers,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull NumberViewHolder holder, int position) {
holder.bind(number_list.get(position));
    }

    @Override
    public int getItemCount() {
        return number_list.size();
    }
}
