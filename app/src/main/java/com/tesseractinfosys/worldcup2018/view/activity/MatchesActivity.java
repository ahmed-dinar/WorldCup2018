package com.tesseractinfosys.worldcup2018.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.squareup.leakcanary.LeakCanary;
import com.tesseractinfosys.worldcup2018.R;

public class MatchesActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.matches_layout);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }



}
