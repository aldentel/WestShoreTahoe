package com.example.android.westshoretahoe;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Salome on 9/15/17.
 */

public class TahoeFragmentPagerAdapter extends FragmentPagerAdapter {

    /** Context of the app */

    private Context mContext;

    public TahoeFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);

        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ForestFragment();
        } else if (position == 1){
            return new SnowFragment();
        } else if (position == 2){
            return new WaterFragment();
        } else return new BeerFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.forest);
        } else if (position == 1) {
            return mContext.getString(R.string.snow);
        } else if (position == 2) {
            return mContext.getString(R.string.water);
        } else {
            return mContext.getString(R.string.beer);
        }
    }
}

