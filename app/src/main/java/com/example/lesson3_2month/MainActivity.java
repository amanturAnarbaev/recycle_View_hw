package com.example.lesson3_2month;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView charactersRecycleView;
    private ArrayList<String> characters_list = new ArrayList<>();
    private Button buttom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttom = findViewById(R.id.bottomForAdress);
        charactersRecycleView = findViewById(R.id.recycleOfCharacters);
        characters_list.add("aman");
        characters_list.add("aman2");
        characters_list.add("aman3");
        characters_list.add("aman4");
        characters_list.add("aman5");
        characters_list.add("aman6");
        characters_list.add("aman7");

        AdapterOfCharacters adapterOfCharacters = new AdapterOfCharacters(characters_list);
        charactersRecycleView.setAdapter(adapterOfCharacters);

        buttom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, adressActivity.class);
                startActivity(intent);
            }
        });


    }
}