package com.example.android.miwok;

import android.view.View;
import android.widget.Toast;

/**
 * Created by Christian on 3/17/18.
 */

public class PhrasesClickListener implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        // this is the behavior that I want the onClick method to do

        // this particular behavior is to show a toast message when the
        // user taps on the button
        Toast.makeText(view.getContext(),"Phrases Here", Toast.LENGTH_SHORT).show();
    }
}
