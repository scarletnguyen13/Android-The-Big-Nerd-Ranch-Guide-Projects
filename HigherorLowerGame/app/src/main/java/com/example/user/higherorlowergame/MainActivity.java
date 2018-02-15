package com.example.user.higherorlowergame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int result;
    Random r;
    
    public void clickFunction(View view) {
        EditText guessedNumber = (EditText) findViewById(R.id.guessedNumber);
        int num = Integer.parseInt(guessedNumber.getText().toString());
        if (num == result) {
            makeToast("That's right! Try again.");
            result = r.nextInt(21)+1;
        } else if (result < num) {
            makeToast("Lower!");
        } else {
            makeToast("Higher!");
        }

    }

    public void makeToast(String msg) {
        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();
        result = r.nextInt(20)+1;
    }
}
