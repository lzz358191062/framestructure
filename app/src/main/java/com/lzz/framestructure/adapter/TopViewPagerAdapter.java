package com.lzz.framestructure.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;


public class TopViewPagerAdapter extends FragmentPagerAdapter
{
    private Context mContext;
    private List<Fragment> mFragments;

    public TopViewPagerAdapter(FragmentManager fm, Context context, List<Fragment> fragments)
    {
        super(fm);
        mContext = context;
        mFragments = fragments;
    }
    @Override
    public Fragment getItem(int position)
    {
        return mFragments.get(position);
    }

    @Override
    public int getCount()
    {
        return mFragments.size();
    }
}