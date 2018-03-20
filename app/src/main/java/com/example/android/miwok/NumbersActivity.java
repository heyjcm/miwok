package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // this was implemented before Lesson 2.7
//        String [] wordsArray = new String[10];
//
//        wordsArray[0] = "one";
//        wordsArray[1] = "two";
//        wordsArray[2] = "three";
//        wordsArray[3] = "four";
//        wordsArray[4] = "five";
//        wordsArray[5] = "six";
//        wordsArray[6] = "seven";
//        wordsArray[7] = "eight";
//        wordsArray[8] = "nine";
//        wordsArray[9] = "ten";
//
//        for (int i =0; i < 10; i++) {
//            Log.v("Logging", "wordsArray[" + i + "]: " + wordsArray[i]);
//        }

        // this was implemented at Lesson 2.8
        // change above wordsArray to an ArrayList

        // create new ArrayList
        ArrayList<String> wordsArrayList = new ArrayList<String>();

        // add "one" through "ten" into ArraayList using .add
        wordsArrayList.add("one");
        wordsArrayList.add("two");
        wordsArrayList.add("three");
        wordsArrayList.add("four");
        wordsArrayList.add("five");
        wordsArrayList.add("six");
        wordsArrayList.add("seven");
        wordsArrayList.add("eight");
        wordsArrayList.add("nine");
        wordsArrayList.add("ten");

        for (int i =0; i < 10; i++) {
            Log.v("Logging", "wordsArrayList(" + i + "): " + wordsArrayList.get(i));
        }

    }

}
