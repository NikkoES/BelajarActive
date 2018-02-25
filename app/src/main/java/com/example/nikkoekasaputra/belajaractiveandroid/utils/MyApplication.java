package com.example.nikkoekasaputra.belajaractiveandroid.utils;

import android.app.Application;

import com.activeandroid.ActiveAndroid;

/**
 * Created by Nikko Eka Saputra on 25/02/2018.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Initializing Active Android
        ActiveAndroid.initialize(this);
    }
}