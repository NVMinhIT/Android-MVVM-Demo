package com.dapl.androidmvvmdemo.ui.splash;

import android.os.Bundle;

import com.dapl.androidmvvmdemo.BR;
import com.dapl.androidmvvmdemo.R;
import com.dapl.androidmvvmdemo.databinding.ActivitySplashBinding;
import com.dapl.androidmvvmdemo.ui.base.BaseActivity;

import javax.inject.Inject;

public class SplashActivity extends BaseActivity<ActivitySplashBinding, SplashViewModel> {


    @Inject
    SplashViewModel splashViewModel;
    ActivitySplashBinding activitySplashBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activitySplashBinding = getViewDataBinding();
    }

    @Override
    public SplashViewModel getViewModel() {
        return null;
    }

    @Override
    public int getBindingVariable() {
        return BR._all;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_splash;
    }
}
