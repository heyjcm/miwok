package com.example.android.miwok;

import android.content.Context;
import android.view.View;
import android.content.Intent;

/**
 * Created by Christian on 3/17/18.
 * I used the following SO link to help me with making this Intent
 * work the way I implemented it: https://stackoverflow.com/questions/6367509/how-to-use-intent-in-non-activity-class
 * It isn't the most efficient way of writing code but I wanted to preserve
 * this way of doing things to show the difference between this
 * and the inline method found in Colors and Phrases in MainActivity.java
 */

public class FamilyClickListerner implements View.OnClickListener {

    Context context;

    public FamilyClickListerner(Context context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {
        // this is the behavior that I want the onClick method to do

        // this particular behavior is to show a toast message when the
        // user taps on the button
        //Toast.makeText(view.getContext(),"Family Members Here", Toast.LENGTH_SHORT).show();

        // Create new intent to open the {@link ColorsActivity}
        Intent phraseIntent = new Intent(context, FamilyMembersActivity.class);

        // Start the new activity
        context.startActivity(phraseIntent);

    }
}