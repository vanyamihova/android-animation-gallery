package com.fos.viewpageranimation.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.fos.viewpageranimation.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Vanya Mihova on 11/23/2015.
 */
public class ImageFragment extends Fragment {

    private int mResourceId;

    @Bind(R.id.image_view)
    ImageView imageView;

    public static ImageFragment GetInstance(int resourceId) {
        return new ImageFragment(resourceId);
    }


    private ImageFragment(int resourceId) {
        this.mResourceId = resourceId;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.view_pager_item, container, false);

        ButterKnife.bind(ImageFragment.this, view);

        imageView.setImageResource(mResourceId);

        return view;
    }
}
