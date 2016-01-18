package com.fos.viewpageranimation.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.fos.viewpageranimation.R;
import com.fos.viewpageranimation.fragment.ImageFragment;

/**
 * Created by Vanya Mihova on 11/23/2015.
 */
public class CustomPageAdapter extends FragmentPagerAdapter {


    public CustomPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {

            default: case 0: return ImageFragment.GetInstance(R.drawable.image_1);
            case 1: return ImageFragment.GetInstance(R.drawable.image_2);
            case 2: return ImageFragment.GetInstance(R.drawable.image_3);
            case 3: return ImageFragment.GetInstance(R.drawable.image_4);
            case 4: return ImageFragment.GetInstance(R.drawable.image_5);
            case 5: return ImageFragment.GetInstance(R.drawable.image_6);
        }

    }

    @Override
    public int getCount() {
        return 6;
    }
}
