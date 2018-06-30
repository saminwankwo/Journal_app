package com.example.android.journal_app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    public static int SPLASH_TIME_OUT = 2500;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Context context = SplashScreen.this;
                Class destinationActivity = LoginActivity.class;
                Intent startChildActivityIntent = new Intent(context, destinationActivity);
                startActivity(startChildActivityIntent);

//                Intent intent = new Intent(SplashScreen.this, LoginActivity.class);
//                startActivity(intent);
//                finish();

            }
        }, SPLASH_TIME_OUT);
    }


}
