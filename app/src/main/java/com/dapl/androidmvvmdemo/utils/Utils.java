package com.dapl.androidmvvmdemo.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.dapl.androidmvvmdemo.AppController;

/**
 * TODO: Created by Tanay Mondal on 16-10-2017
 */

public class Utils {

    private Utils(){}

    public static Boolean isInternetON() {
        ConnectivityManager connectivityManager = (ConnectivityManager) AppController.getInstance().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        return networkInfo != null && networkInfo.isConnected();
    }
}
