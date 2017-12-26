package com.lzz.framestructure.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.lzz.framestructure.R;
import com.lzz.framestructure.adapter.TopViewPagerAdapter;
import com.lzz.framestructure.ui.views.BottomIndicator;
import com.lzz.framestructure.ui.views.NoScrollViewPager;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.id_viewPager)
    NoScrollViewPager idViewPager;
    @BindView(R.id.id_bottom_indicator)
    BottomIndicator idBottomIndicator;

    private List<Fragment> mFragments = new ArrayList<>();
    private TopViewPagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        String[] mTitles = {getResources().getString(R.string.tab_home),  getResources().getString(R.string.tab_rank),getResources().getString(R.string.tab_setting),  getResources().getString(R.string.tab_my)};
        for (String title : mTitles) {
            if (title.equals(getResources().getString(R.string.tab_home))) {
                HomeFragment mSettingFragment = HomeFragment.newInstance();
                mFragments.add(mSettingFragment);
            } else if (title.equals(getResources().getString(R.string.tab_rank))) {
                SimpleFragment groupFragment = SimpleFragment.newInstance(getResources().getString(R.string.tab_rank));
                mFragments.add(groupFragment);
            } else if (title.equals(getResources().getString(R.string.tab_setting))) {
                SimpleFragment mHomeFragment = SimpleFragment.newInstance(getResources().getString(R.string.tab_setting));
                mFragments.add(mHomeFragment);
            } else if (title.equals(getResources().getString(R.string.tab_my))) {
                SimpleFragment mMyFragment = SimpleFragment.newInstance(getResources().getString(R.string.tab_my));
                mFragments.add(mMyFragment);
            }
            mPagerAdapter = new TopViewPagerAdapter(getSupportFragmentManager(), this, mFragments);
            idViewPager.setAdapter(mPagerAdapter);
            idViewPager.setOffscreenPageLimit(5);
            idBottomIndicator.setViewPager(idViewPager);

        }
    }
}
