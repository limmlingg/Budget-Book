package com.limmlingg.budgetbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Add extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
//        String message = intent.getStringExtra(MainActivity.ADD_MESSAGE);

    }
}
