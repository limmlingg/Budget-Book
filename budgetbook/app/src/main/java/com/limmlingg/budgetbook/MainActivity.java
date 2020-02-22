package com.limmlingg.budgetbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

//    public static final String ADD_MESSAGE = "com.limmlingg.budgetbook.ADD_MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Goes to add item screen */
    public void addItem(View view) {
        Intent intent = new Intent(this, AddItemActivity.class);
//        EditText editText = (EditText) findViewById(R.id.editText);
//        String message = editText.getText().toString();
//        intent.putExtra(ADD_MESSAGE, message);
        startActivity(intent);
    }

    /** Goes to viewGoal screen */
    public void viewGoal(View view) {
        Intent intent = new Intent(this, ViewGoalActivity.class);
//        EditText editText = (EditText) findViewById(R.id.editText);
//        String message = editText.getText().toString();
//        intent.putExtra(ADD_MESSAGE, message);
        startActivity(intent);
    }

    /** Goes to settings screen */
    public void settings(View view) {
        // Do something in response to button
    }
}

