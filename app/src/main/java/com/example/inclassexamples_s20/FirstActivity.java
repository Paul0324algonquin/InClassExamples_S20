package com.example.inclassexamples_s20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Your program starts here
        super.onCreate(savedInstanceState);
        // setContentView loads objects onto the screen.
        // Before this function, the screen is empty.
        setContentView(R.layout.activity_main);
        Button secondButton = findViewById(R.id.buttonToSecond);
        EditText inputText = findViewById(R.id.inputText);

        //This creates a transition to load SecontActivity.java:
        Intent nextPage = new Intent(this, SecondActivity.class);
        //when you click the button, start the next activity:
        secondButton.setOnClickListener( click ->
        {
            nextPage.putExtra("name", "Eric");      //name = Eric
            nextPage.putExtra("age", 20);           // age = 20
            nextPage.putExtra("typed", inputText.getText().toString() ); //typed = what user typed
            startActivity(nextPage);    //go to SecondActivity.java
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}
