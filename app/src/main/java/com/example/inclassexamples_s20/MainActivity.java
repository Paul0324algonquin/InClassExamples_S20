package com.example.inclassexamples_s20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Your program starts here
        super.onCreate(savedInstanceState);
        //Load your screen:
        setContentView(R.layout.activity_main_linear);
    }
}