package com.example.deafanddumbcommunicator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.deafanddumbcommunicator.Activities.LoginActivity;

public class SplashScreen extends AppCompatActivity {
    private static int SPLASH_SCREEN =5000;
    Handler handler ;
    //variabels
    Animation topAnim,bottomAnim;
    ImageView image;
    TextView slogan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);
        handler= new Handler();

        //animation
        topAnim= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        //hooks
        image = findViewById(R.id.logo);
        slogan = findViewById(R.id.slogan);

        image.setAnimation(topAnim);
        slogan.setAnimation(bottomAnim);

        handler.postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent i=new Intent(SplashScreen.this, LoginActivity.class);
                startActivity(i);
                finish();
            }
        },SPLASH_SCREEN);
    }
}