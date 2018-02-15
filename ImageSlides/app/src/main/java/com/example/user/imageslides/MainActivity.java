package com.example.user.imageslides;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void changeImage(View view) {
        ImageView image = (ImageView) findViewById(R.id.imageView);
        image.setImageResource(R.drawable.cpp_logo);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
