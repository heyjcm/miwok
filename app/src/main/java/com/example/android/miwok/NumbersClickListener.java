package com.example.android.miwok;


import android.content.Context;
import android.view.View;
import android.content.Intent;

/**
 * Created by Christian on 3/12/18.
 */


public class NumbersClickListener implements View.OnClickListener {

    Context context;

    public NumbersClickListener(Context context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {
        // this is the behavior that I want the onClick method to do

        // this particular behavior is to show a toast message when the
        // user taps on the button
        //Toast.makeText(view.getContext(),"Numbers Here", Toast.LENGTH_SHORT).show();

        // Create new intent to open the {@link ColorsActivity}
        Intent numbersIntent = new Intent(context, NumbersActivity.class);

        // Start the new activity
        context.startActivity(numbersIntent);
    }
}
