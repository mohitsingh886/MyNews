package com.mutwakilmo.android.mynews.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.mutwakilmo.android.mynews.Fragments.MainFragment;
import com.mutwakilmo.android.mynews.Utils.NYTConstants;

/**
 * Created by Mutwakil Mo🐮🐮🐮 on 04/03/2020
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return NYTConstants.NEWS_SECTIONS[position];
    }

    @NonNull
    @Override
    public MainFragment getItem(int position) {
        return MainFragment.newInstance(NYTConstants.NEWS_SECTIONS[position]);
    }

    @Override
    public int getCount() {
        return NYTConstants.NEWS_SECTIONS.length;
    }
}
