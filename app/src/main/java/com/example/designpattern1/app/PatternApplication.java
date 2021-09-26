package com.example.designpattern1.app;

import android.app.Application;

/**
 * Created by test on 2016/10/22.
 */

public class PatternApplication extends Application {

    private static PatternApplication patternApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        patternApplication = this;
    }

    public static PatternApplication getInstance() {
        return patternApplication;
    }
}
