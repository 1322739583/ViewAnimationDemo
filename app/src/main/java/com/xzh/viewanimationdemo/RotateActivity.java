package com.xzh.viewanimationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;

public class RotateActivity extends AppCompatActivity {

    private View rotateView;
    private RotateAnimation rotateAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotate);

        rotateView = findViewById(R.id.view);

        rotateAnimation = new RotateAnimation(0,90,100,100);
        rotateAnimation.setRepeatCount(Animation.INFINITE);
        rotateAnimation.setDuration(2000);
        rotateAnimation.setAnimationListener(new Animation.AnimationListener() {
            int count=0;
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                if (count%3==0){
                    rotateView.setBackgroundColor(Color.BLUE);

                }
                if (count%3==1){
                    rotateView.setBackgroundColor(Color.GREEN);

                }
                if (count%3==2){

                    rotateView.setBackgroundColor(Color.YELLOW);
                }

                count++;

            }
        });

        //view.setAnimation(rotateAnimation);

    }

    int count;
    public void start(View view) {
        if (count==0) {
            rotateView.startAnimation(rotateAnimation);
        }else {

            rotateAnimation.cancel();
        }
    }
}
