package com.mertyeniadim.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button arrayAdapterButton = findViewById(R.id.array);
        arrayAdapterButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ArrayAdapterActivity.class);
            startActivity(intent);
        });
    }
}