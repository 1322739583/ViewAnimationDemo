package com.xzh.viewanimationdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.util.TimeUtils;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;

import java.util.Timer;

public class TranslateActivity extends AppCompatActivity {

    private View translateView;
    private TranslateAnimation translateAnimation;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate);
        translateView = findViewById(R.id.translateView);

        translateAnimation = new TranslateAnimation(0, 100, 0, 100);
        //必须设置时间默认为0
        translateAnimation.setDuration(2000);
        translateAnimation.setRepeatMode(Animation.REVERSE);
        translateAnimation.setRepeatCount(Animation.INFINITE);
        // translateAnimation.setRepeatCount(2);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.translate);


        translateAnimation.setAnimationListener(new Animation.AnimationListener() {
            long start = System.currentTimeMillis();
            long end = System.currentTimeMillis();
            int repeatCount = 0;

            @Override
            public void onAnimationStart(Animation animation) {
                start = System.currentTimeMillis();
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                end = System.currentTimeMillis();
                Log.d("TranslateActivity", "cast time:" + (end - start) / 1000 + "s");
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                long curTime = System.currentTimeMillis();
                Log.d("TranslateActivity", "repeatCount:" + repeatCount);
                Log.d("TranslateActivity", "onAnimationRepeat on " + (curTime - start) / 1000 + "s");
                if (repeatCount % 3 == 0) {
                    translateView.setBackgroundColor(Color.GREEN);

                }
                if (repeatCount % 3 == 1) {
                    translateView.setBackgroundColor(Color.BLUE);
                }
                if (repeatCount % 3 == 2) {
                    translateView.setBackgroundColor(Color.YELLOW);
                }
                repeatCount++;
            }
        });




//        translateView.post(new Runnable() {
//            @Override
//            public void run() {
//                long start = System.currentTimeMillis();
//                while (true) {
//                    SystemClock.currentThreadTimeMillis();
//                    long curTime = System.currentTimeMillis();
//                    if ((curTime - start) / 1000 == 1) {
//                        translateView.setBackgroundColor(Color.GRAY);
//                        break;
//                    }
//                }
//            }
//        });


    }

    public void start(View view) {


        translateView.setAnimation(translateAnimation);
        translateView.startAnimation(translateAnimation);


    }
}
