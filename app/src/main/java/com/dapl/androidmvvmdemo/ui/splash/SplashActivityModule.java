package com.dapl.androidmvvmdemo.ui.splash;


import com.dapl.androidmvvmdemo.utils.rx.SchedulerProvider;

import dagger.Module;
import dagger.Provides;


@Module
public class SplashActivityModule {

    @Provides
    SplashViewModel provideSplashViewModel(SchedulerProvider schedulerProvider) {
        return new SplashViewModel(schedulerProvider);
    }

}
