package com.dapl.androidmvvmdemo;

import android.app.Activity;
import android.app.Application;

import com.dapl.androidmvvmdemo.di.component.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

public class AppController extends Application implements HasActivityInjector {

    private static AppController instance = null;
    @Inject
    DispatchingAndroidInjector<Activity> activityDispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();

        DaggerAppComponent.builder()
                .application(this)
                .build()
                .inject(this);


        instance = this;
    }

    @Override
    public DispatchingAndroidInjector<Activity> activityInjector() {
        return activityDispatchingAndroidInjector;
    }

    public static AppController getInstance() {
        return instance;
    }
}
