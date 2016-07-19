package com.kelin.cart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindowTest();
    }

    private void getWindowTest(){

        Window window = getWindow();
        View decorView = window.getDecorView();
        if (decorView instanceof ViewGroup) {
            ViewGroup rootVite = (ViewGroup) decorView;

            ImageView imageView = new ImageView(this);

            imageView.setImageResource(R.mipmap.ic_launcher);

            rootVite.addView(imageView);
        }

    }
}
