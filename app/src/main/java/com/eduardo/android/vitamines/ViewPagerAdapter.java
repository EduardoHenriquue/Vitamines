package com.eduardo.android.vitamines;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eduardo on 06/04/2016.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter{
    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final List<String> mFragmentTitleList = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return this.mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return this.mFragmentList.size();
    }

    public void addFragment(Fragment fragment, String title){
        this.mFragmentList.add(fragment);
        this.mFragmentTitleList.add(title);
    }

    @Override
    public CharSequence getPageTitle(int position){
        return this.mFragmentTitleList.get(position);
    }
}
