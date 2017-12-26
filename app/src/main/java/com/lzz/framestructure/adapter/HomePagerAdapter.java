package com.lzz.framestructure.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.lzz.framestructure.FramestructureApplication;
import com.lzz.framestructure.R;
import com.lzz.framestructure.ui.CategoryFragment;


public class HomePagerAdapter extends FragmentPagerAdapter {

    private int[] mTitles = new int[]{R.string.category, R.string.category, R.string.category
            ,R.string.category,R.string.category,R.string.category,R.string.category
            ,R.string.category,R.string.category,R.string.category};

    public HomePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new CategoryFragment();
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return FramestructureApplication.getInstance().getString(mTitles[position]) ;
    }
}
