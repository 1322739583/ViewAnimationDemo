package com.xzh.viewanimationdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Intent intent = new Intent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void translate(View view) {
        intent.setClass(this,TranslateActivity.class);
        startActivity(intent);

    }

    public void rotate(View view) {
        intent.setClass(this,RotateActivity.class);
        startActivity(intent);
    }

    public void alpha(View view) {
        intent.setClass(this, AlphaActivity.class);
        startActivity(intent);
    }

    public void scale(View view) {
        intent.setClass(this, ScaleActivity.class);
        startActivity(intent);
    }
}
