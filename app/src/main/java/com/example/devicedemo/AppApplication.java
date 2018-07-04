package com.example.devicedemo;

import android.app.Application;

/**
 * @author zuoguozhen
 * @date 2018/5/17
 */
public class AppApplication extends Application {
    private static AppApplication appApplication;

    public static AppApplication getInstance() {
        return appApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appApplication = this;
    }
}
