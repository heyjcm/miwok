package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        String [] wordsArray = new String[10];

        wordsArray[0] = "one";
        wordsArray[1] = "two";
        wordsArray[2] = "three";
        wordsArray[3] = "four";
        wordsArray[4] = "five";
        wordsArray[5] = "six";
        wordsArray[6] = "seven";
        wordsArray[7] = "eight";
        wordsArray[8] = "nine";
        wordsArray[9] = "ten";

        for (int i =0; i < 10; i++) {
            Log.v("Logging", "wordsArray[" + i + "]: " + wordsArray[i]);
        }
    }

}
