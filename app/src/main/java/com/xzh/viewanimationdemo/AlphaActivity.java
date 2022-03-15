package com.xzh.viewanimationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

public class AlphaActivity extends AppCompatActivity {

    private View alphaView;
    private AlphaAnimation alphaAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpha);
        alphaView = findViewById(R.id.view);

        alphaAnimation = new AlphaAnimation(0,1);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setDuration(2000);
        alphaAnimation.setRepeatMode(Animation.REVERSE);
        alphaAnimation.setRepeatCount(Animation.INFINITE);



    }

    public void start(View view) {
        alphaView.startAnimation(alphaAnimation);
    }
}
