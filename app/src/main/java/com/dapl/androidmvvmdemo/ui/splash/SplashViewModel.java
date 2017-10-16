package com.dapl.androidmvvmdemo.ui.splash;

import com.dapl.androidmvvmdemo.ui.base.BaseViewModel;
import com.dapl.androidmvvmdemo.utils.rx.SchedulerProvider;

public class SplashViewModel extends BaseViewModel<SplashNavigator> {


    SplashViewModel(SchedulerProvider schedulerProvider) {
        super(schedulerProvider);
    }
}
