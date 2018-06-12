package com.tesseractinfosys.worldcup2018.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class TableActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.table_layout);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }




}
