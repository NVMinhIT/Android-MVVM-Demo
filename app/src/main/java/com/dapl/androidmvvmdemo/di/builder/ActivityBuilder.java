package com.dapl.androidmvvmdemo.di.builder;


import com.dapl.androidmvvmdemo.ui.splash.SplashActivity;
import com.dapl.androidmvvmdemo.ui.splash.SplashActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;


@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = SplashActivityModule.class)
    abstract SplashActivity bindSearchActivity();

}
