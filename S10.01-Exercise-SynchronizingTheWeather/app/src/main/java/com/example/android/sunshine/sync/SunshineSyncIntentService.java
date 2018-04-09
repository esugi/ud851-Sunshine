package com.example.android.sunshine.sync;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

import com.example.android.sunshine.sync.SunshineSyncTask;

// TODO (5) Create a new class called SunshineSyncIntentService that extends IntentService
public class SunshineSyncIntentService extends IntentService {
//  TODO (6) Create a constructor that calls super and passes the name of this class
    public SunshineSyncIntentService() {
        super("SunshineSyncIntentService");
    }

    //  TODO (7) Override onHandleIntent, and within it, call SunshineSyncTask.syncWeather
    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        SunshineSyncTask.syncWeather(this);
    }
}