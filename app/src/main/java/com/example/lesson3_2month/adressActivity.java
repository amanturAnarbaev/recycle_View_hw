package com.example.lesson3_2month;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class adressActivity extends AppCompatActivity {
    private RecyclerView adressRecycle;
    private ArrayList <Object> adress_list=new ArrayList<>();
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adress);
        button=findViewById(R.id.bottomForNumbers);
        adressRecycle=findViewById(R.id.adress);
        adress_list.add("aman20070712");
        adress_list.add("aman20070712");
        adress_list.add("aman20070712");
        adress_list.add("aman20070712");
        adress_list.add("aman20070712");

        AdapterOfAdress adapterOfAdress=new AdapterOfAdress(adress_list);
        adressRecycle.setAdapter(adapterOfAdress);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(adressActivity.this,NumberActivity.class);
                startActivity(intent);
            }
        });
    }
}