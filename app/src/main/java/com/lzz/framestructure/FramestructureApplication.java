package com.lzz.framestructure;

import android.app.Application;

public class FramestructureApplication extends Application {
    private static FramestructureApplication context = null ;
    public static FramestructureApplication getInstance(){
        return context ;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = this ;
    }
}