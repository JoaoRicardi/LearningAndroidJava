package com.example.retrofit_tutorial;

import android.app.Application;

import com.facebook.stetho.Stetho;

public class CharacterApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
