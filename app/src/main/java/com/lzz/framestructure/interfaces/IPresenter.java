package com.lzz.framestructure.interfaces;

/**
 * Created by lzz on 2017/12/8.
 */

public interface IPresenter <V extends IView> {
    void onStop();
    void onResume();
    void onDestroy();
    void onPause();
    void onStart();
    void init(V view);
}
