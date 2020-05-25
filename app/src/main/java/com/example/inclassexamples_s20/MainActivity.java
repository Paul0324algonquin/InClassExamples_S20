package com.example.inclassexamples_s20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Your program starts here
        super.onCreate(savedInstanceState);
        //Load your screen:
        setContentView(R.layout.activity_main);

        ImageButton iBtn = findViewById(R.id.image_Button);
        iBtn.setOnClickListener( btn -> {  /* code goes here */  });
    }
}