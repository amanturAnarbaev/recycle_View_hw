package com.example.lesson3_2month;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterOfAdress extends RecyclerView.Adapter<AdressViewHolder> {
    private ArrayList<Object> adress_list;

    public AdapterOfAdress(ArrayList<Object> adress_list) {
        this.adress_list = adress_list;
    }

    @NonNull
    @Override
    public AdressViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AdressViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_adress,parent,false)) ;
    }

    @Override
    public void onBindViewHolder(@NonNull AdressViewHolder holder, int position) {
holder.bind(adress_list.get(position));
    }

    @Override
    public int getItemCount() {
        return adress_list.size();
    }
}
