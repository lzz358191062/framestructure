package com.lzz.framestructure.interfaces;

import android.os.Handler;
import android.os.Message;

import java.lang.ref.WeakReference;

public abstract class AbsMainHandler<T> extends Handler {
    private WeakReference<T> mHost = null ;

    public AbsMainHandler(T host){
        mHost = new WeakReference<T>(host) ;
    }

    @Override
    public final void handleMessage(Message msg) {
        if (mHost == null) {
            return;
        }
        T t = mHost.get();
        if (t == null) {
            return;
        }
        onHandleMessage(msg, t);
    }

    public abstract void onHandleMessage(Message msg, T t);
}