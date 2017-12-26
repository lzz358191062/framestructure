package com.lzz.framestructure.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lzz.framestructure.R;
import com.lzz.framestructure.adapter.HomePagerAdapter;


public class HomeFragment extends Fragment implements TabLayout.OnTabSelectedListener{
    private static HomeFragment instance = null ;
    public static HomeFragment newInstance(){
        if (instance == null){
            instance = new HomeFragment() ;
        }
        return instance ;
    }

    private TabLayout mHomeTl ;
    private ViewPager mHomeVp ;
    private HomePagerAdapter mHomePagerAdapter ;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home,null);
        initView(rootView);

        return rootView ;
    }

    private void initView(View rootView){
        mHomeTl = (TabLayout) rootView.findViewById(R.id.home_tl) ;
        mHomeVp = (ViewPager) rootView.findViewById(R.id.home_vp) ;
        mHomePagerAdapter = new HomePagerAdapter(getFragmentManager()) ;
        mHomeVp.setAdapter(mHomePagerAdapter);
        mHomeTl.setupWithViewPager(mHomeVp);
        mHomeTl.addOnTabSelectedListener(this);
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        if (tab == mHomeTl.getTabAt(0)){
            mHomeVp.setCurrentItem(0);
        } else if (tab == mHomeTl.getTabAt(1)){
            mHomeVp.setCurrentItem(1);
        } else if (tab == mHomeTl.getTabAt(2)){
            mHomeVp.setCurrentItem(2);
        } else if (tab == mHomeTl.getTabAt(3)){
            mHomeVp.setCurrentItem(3);
        } else if (tab == mHomeTl.getTabAt(4)){
            mHomeVp.setCurrentItem(4);
        } else if (tab == mHomeTl.getTabAt(5)){
            mHomeVp.setCurrentItem(5);
        } else if (tab == mHomeTl.getTabAt(6)){
            mHomeVp.setCurrentItem(6);
        } else if (tab == mHomeTl.getTabAt(7)){
            mHomeVp.setCurrentItem(7);
        } else if (tab == mHomeTl.getTabAt(8)){
            mHomeVp.setCurrentItem(8);
        } else if (tab == mHomeTl.getTabAt(9)){
            mHomeVp.setCurrentItem(9);
        }
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
