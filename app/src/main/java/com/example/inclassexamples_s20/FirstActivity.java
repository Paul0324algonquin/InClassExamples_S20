package com.example.inclassexamples_s20;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class FirstActivity extends AppCompatActivity {
    MyListAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Your program starts here
        super.onCreate(savedInstanceState);

        // setContentView loads objects onto the screen.
        // Before this function, the screen is empty.
        setContentView(R.layout.activity_main);

        ListView myList = findViewById(R.id.theListView);
        myList.setAdapter( myAdapter );
    }

}
