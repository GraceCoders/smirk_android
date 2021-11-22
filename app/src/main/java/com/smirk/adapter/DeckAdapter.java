package com.smirk.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.smirk.R;
import com.smirk.data.HomeBean;

import java.util.ArrayList;

public class DeckAdapter extends BaseAdapter {
	
	// on below line we have created variables
	// for our array list and context.
	private ArrayList<HomeBean> courseData;
	private Context context;

	// on below line we have created constructor for our variables.
	public DeckAdapter(ArrayList<HomeBean> courseData, Context context) {
		this.courseData = courseData;
		this.context = context;
	}

	@Override
	public int getCount() {
		// in get count method we are returning the size of our array list.
		return courseData.size();
	}

	@Override
	public Object getItem(int position) {
		// in get item method we are returning the item from our array list.
		return courseData.get(position);
	}

	@Override
	public long getItemId(int position) {
		// in get item id we are returning the position.
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// in get view method we are inflating our layout on below line.
		View v = convertView;
		if (v == null) {
			// on below line we are inflating our layout.
			v = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_item, parent, false);
		}
		// on below line we are initializing our variables and setting data to our variables.

		((ImageView) v.findViewById(R.id.img)).setImageResource(courseData.get(position).getImg());
		return v;
	}
}
