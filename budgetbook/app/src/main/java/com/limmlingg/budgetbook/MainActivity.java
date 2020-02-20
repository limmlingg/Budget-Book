package com.limmlingg.budgetbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

//    public static final String ADD_MESSAGE = "com.limmlingg.budgetbook.ADD_MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Goes to add item screen */
    public void addItem(View view) {
        Intent intent = new Intent(this, Add.class);
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

