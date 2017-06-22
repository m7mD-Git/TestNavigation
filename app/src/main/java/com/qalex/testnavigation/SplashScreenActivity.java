package com.qalex.testnavigation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread thread = new Thread(){
            public void run(){

                try{
                    sleep(5000);
                }catch(InterruptedException e){
                    e.printStackTrace();

                }finally{
                        Intent intent = new Intent(SplashScreenActivity.this, SignInActivity.class);
                        startActivity(intent);
                    finish();

                }
            }

        };
        thread.start();
    }
}
