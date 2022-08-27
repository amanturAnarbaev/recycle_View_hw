package com.example.lesson3_2month;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CharactersViewHolder extends RecyclerView.ViewHolder {
    private TextView characters;

    public CharactersViewHolder(@NonNull View itemView) {
        super(itemView);
        characters=itemView.findViewById(R.id.characters);
    }
    public void bind (String characters_name){

        characters.setText(characters_name);
    }
}
