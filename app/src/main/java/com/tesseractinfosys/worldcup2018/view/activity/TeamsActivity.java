package com.tesseractinfosys.worldcup2018.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tesseractinfosys.worldcup2018.R;

public class TeamsActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.teams_layout);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }




}
