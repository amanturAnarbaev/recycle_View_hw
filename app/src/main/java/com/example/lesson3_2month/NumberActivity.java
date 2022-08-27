package com.example.lesson3_2month;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {
    private RecyclerView recyclerViewNumber;
    private ArrayList<Integer> number_list = new ArrayList<>();
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        button1=findViewById(R.id.bt_exit);
        recyclerViewNumber=findViewById(R.id.numberRecycle_xml);
        number_list.add(48949);
        number_list.add(48949);
        number_list.add(48949);
        number_list.add(48949);
        number_list.add(48949);

        AdapterForNumber adapterForNumber = new AdapterForNumber(number_list);
            recyclerViewNumber.setAdapter(adapterForNumber);


            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                }
            });
    }
}