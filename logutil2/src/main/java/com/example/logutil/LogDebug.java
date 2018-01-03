package com.example.logutil;

import android.util.Log;

/**
 * Created by larendon on 3/01/2018.
 */

public class LogDebug {

    private static final String TAG = "SUPER_AWESOME_APP";

    public static void d(String message){
        Log.d(TAG, message);
    }
}
