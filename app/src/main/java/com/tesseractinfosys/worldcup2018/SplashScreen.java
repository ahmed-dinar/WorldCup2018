package com.tesseractinfosys.worldcup2018;

import android.content.Intent;
import android.os.Bundle;

import android.app.Activity;

public class SplashScreen extends Activity {

    private final int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        Thread timerThread = new Thread() {
            public void run() {
                try {
                    sleep(SPLASH_TIME_OUT);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(SplashScreen.this, WorldCupApp.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();

    }


    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }

}
