package com.dapl.androidmvvmdemo.di.builder;


import com.dapl.androidmvvmdemo.ui.splash.SearchActivityModule;
import com.dapl.androidmvvmdemo.ui.splash.SplashActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;


@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = SearchActivityModule.class)
    abstract SplashActivity bindSearchActivity();

}
