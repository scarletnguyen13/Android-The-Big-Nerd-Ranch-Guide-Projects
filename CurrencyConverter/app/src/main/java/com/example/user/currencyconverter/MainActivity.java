package com.example.user.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view) {
        EditText numbers = (EditText) findViewById(R.id.editText);
        double result = 0.8 * (Double.parseDouble(numbers.getText().toString()));
        Toast.makeText(MainActivity.this, "$" + String.format("%.2f", result), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
