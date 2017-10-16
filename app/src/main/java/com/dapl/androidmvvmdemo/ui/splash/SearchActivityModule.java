package com.dapl.androidmvvmdemo.ui.splash;


import com.dapl.androidmvvmdemo.utils.rx.SchedulerProvider;

import dagger.Module;
import dagger.Provides;


@Module
public class SearchActivityModule {

    @Provides
    SplashViewModel provideSearchViewModel(SchedulerProvider schedulerProvider) {
        return new SplashViewModel(schedulerProvider);
    }

}
