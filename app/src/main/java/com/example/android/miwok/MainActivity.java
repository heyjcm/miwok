/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);



        /**
         * This is the first way I learned to implement an OnClickListener
         * This method uses a java class called NumbersClickListener (reference
         * NumbersClickListener.java file). It creates a new object from
         * the NumbersClickListener class and calls the setOnClickListener method
         * and passes the NumbersClickListener object to it
         */
        // <-- Start Number button click behavior -->
        // The following is for the Number click behavior
        // note: must pass context (this), look in NumbersClickListener.java for method
        NumbersClickListener numbersListener = new NumbersClickListener(this);

        // Find view of numbers
        TextView numbersButton = (TextView) findViewById(R.id.numbers);

        numbersButton.setOnClickListener(numbersListener);
        // <-- End Number button click behavior -->



        /**
         * This is the second way I learned to implement an OnClickListener
         * This is the same except that the FamilyClickListener object
         * This method still uses another java class called FamilyClickListener
         * (reference FamilyClickListener.java file)
         */
        // The following is for the Family Members click behavior
        //FamilyClickListerner famClickListener = new FamilyClickListerner();
        // above deleted and added inline below because only used once so no need to make a once-used variable

        // Find view of numbers
        TextView familyMembersButton = (TextView) findViewById(R.id.family);

        familyMembersButton.setOnClickListener(new FamilyClickListerner(this));
        // <-- End Family Member button click behavior -->



        /**
         * This is yet another way of implementing the onClickListener
         * This does away with having a separate java class and overrides
         * the onClick method inline when the OnClickListener object is created
         */
        // <-- Start Colors  button click behavior -->
        // The following is for the Colors click behavior

        // Find view of numbers
        TextView colorsButton = (TextView) findViewById(R.id.colors);

        colorsButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create new intent to open the {@link ColorsActivity}
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);

                // Start the new activity
                startActivity(colorsIntent);
            }
        });
        // <-- End Colors button click behavior -->



        // <-- Start Phrases  button click behavior -->
        // The following is for the Phrases click behavior
        // PhrasesClickListener phrasesListener = new PhrasesClickListener();

        // Find view of numbers
        TextView phraseButton = (TextView) findViewById(R.id.phrases);

        phraseButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create new intent to open the {@link PhrasesActivity}
                Intent phraseIntent = new Intent(MainActivity.this, PhrasesActivity.class);

                // Start the new activity
                startActivity(phraseIntent);
            }
        });
        // <-- End Phrases button click behavior -->

    }
}
