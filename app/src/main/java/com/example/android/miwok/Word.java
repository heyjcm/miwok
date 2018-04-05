package com.example.android.miwok;

import android.content.Context;
import android.view.View;

/**
 * Created by Christian on 4/4/18.
 * For Lessons 2.26: https://classroom.udacity.com/courses/ud839/lessons/7709673667/concepts/5920a900-a578-4dba-855d-81389455484b
 */

public class Word {

    // the two states
    private String mDefaultTranslation;
    private String mCebuanoTranslation;


    // constructor
    public void Word(String defaultTranslation, String cebuanoTranslation) {
        mDefaultTranslation = defaultTranslation;
        mCebuanoTranslation = cebuanoTranslation;
    }

    // getter
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    // getter
    public String getCebuanoTranslation() {
        return mCebuanoTranslation;
    }
}