package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

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

//        for (int i =0; i < 10; i++) {
//            Log.v("Logging", "wordsArrayList(" + i + "): " + wordsArrayList.get(i));
//        }

        // create a LinearLayout parent view called rootView (use the rootView id from XML
        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        // make a child view that is of type TextView; call it wordView (pass context this so
        // it knows what context -- in this case, context this is NumbersActivity class
//        TextView wordView = new TextView(this);
//        // sets the text of the TextView that I just created to the first element in the ArrayList
//        wordView.setText(wordsArrayList.get(0));
//
//        // add child wordView to parent rootView
//        rootView.addView(wordView);

        // playing with while loops
        // while loop makes 10 child views and adds them to the rootView LinearLayout view
//        int i = 0;
//        while (i < wordsArrayList.size()) {
//            TextView wordView = new TextView(this);
//            wordView.setText(wordsArrayList.get(i));
//            rootView.addView(wordView);
//            i++;
//        }

        // changing the while loop into a for loop (Lesson 2.12)
        for (int i = 0; i < wordsArrayList.size(); i++) {
            TextView wordView = new TextView(this);
            wordView.setText(wordsArrayList.get(i));
            rootView.addView(wordView);
        }

    }

}
