package com.smirk.adapter;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.viewpager.widget.PagerAdapter;
import com.smirk.R;
import com.smirk.data.HomeBean;

import java.util.ArrayList;

public class ViewPagerAdapter extends PagerAdapter {


    private ArrayList<HomeBean> infoModelArrayList;
    private LayoutInflater inflater;
    private Context context;


    public ViewPagerAdapter(Context context, ArrayList<HomeBean> infoModelArrayList) {
        this.context = context;
        this.infoModelArrayList = infoModelArrayList;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return infoModelArrayList.size();
    }

    @Override
    public Object instantiateItem(ViewGroup view, int position) {
        View imageLayout = inflater.inflate(R.layout.home_item, view, false);




        view.addView(imageLayout, 0);

        return imageLayout;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }

    @Override
    public void restoreState(Parcelable state, ClassLoader loader) {
    }

    @Override
    public Parcelable saveState() {
        return null;
    }


}