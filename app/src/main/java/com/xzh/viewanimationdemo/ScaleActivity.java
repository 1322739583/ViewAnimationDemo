package com.xzh.viewanimationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;

public class ScaleActivity extends AppCompatActivity {

    private View scaleView;
    private ScaleAnimation scaleAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale);
        scaleView = findViewById(R.id.view);
        //scaleAnimation = new ScaleAnimation(0,1.5f,0,1.5f,100,100);
        scaleAnimation = new ScaleAnimation(1.0f,2.0f,1.0f,2.0f,Animation.RELATIVE_TO_PARENT,0,Animation.RELATIVE_TO_PARENT,0 );

        scaleAnimation.setDuration(2000);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setRepeatMode(Animation.REVERSE);
        scaleAnimation.setRepeatCount(Animation.INFINITE);
    }

    public void start(View view) {
        scaleView.setAnimation(scaleAnimation);
        scaleView.startAnimation(scaleAnimation);
    }
}
