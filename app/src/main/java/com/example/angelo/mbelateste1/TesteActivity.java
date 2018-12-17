package com.example.angelo.mbelateste1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TesteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teste);

        //********************************Cena de ScrollBar Horizontal*****************************************************************************************************
        /*LinearLayout gallery = findViewById(R.id.gallery);
        LayoutInflater inflater = LayoutInflater.from(this);
        for (int i = 0; i<6; i++){

            View view = inflater.inflate(R.layout.car_container, gallery, false);
            TextView textView = view.findViewById(R.id.nrItem);
            textView.setText("Item "+i);

            ImageView imageView = view.findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.cell_na_mao);

            gallery.addView(view);
        }*/
        //*************************************Fim de ScrollBar***************************************************************************************************************
    }
}
