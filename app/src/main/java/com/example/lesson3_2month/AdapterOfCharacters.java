package com.example.lesson3_2month;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterOfCharacters extends RecyclerView.Adapter<CharactersViewHolder> {
    private ArrayList<String> nameOfCharacters;

    public AdapterOfCharacters(ArrayList<String> nameOfCharacters) {
        this.nameOfCharacters = nameOfCharacters;
    }

    @NonNull
    @Override
    public CharactersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CharactersViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_characters,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CharactersViewHolder holder, int position) {
        holder.bind(nameOfCharacters.get(position));
    }



    @Override
    public int getItemCount() {
        return nameOfCharacters.size()  ;
    }
}
