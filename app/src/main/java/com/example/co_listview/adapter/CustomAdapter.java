package com.example.co_listview.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.co_listview.R;
import com.example.co_listview.activity.MainActivity;
import com.example.co_listview.model.College;

import java.util.List;

/**
 * Created by Patrick Ian Co on 9/7/2017.
 */

public class CustomAdapter extends BaseAdapter{
    Context context;
    List<College> colleges;
    ImageView collegeLogo;
    TextView collegeName, collegeEst;

    public CustomAdapter(Context context, List<College> colleges) {
        this.context = context;
        this.colleges = colleges;
    }

    @Override
    public int getCount() {
        return colleges.size();
    }

    @Override
    public Object getItem(int i) {
        return colleges.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = View.inflate(context, R.layout.row_layout, null);
        collegeLogo = (ImageView) v.findViewById(R.id.collegeLogo);
        collegeName = (TextView) v.findViewById(R.id.collegeName);
        collegeEst = (TextView) v.findViewById(R.id.collegeEst);

        collegeName.setText(colleges.get(i).getCollegeName());
        collegeLogo.setImageResource(colleges.get(i).getLogo());
        collegeEst.setText(colleges.get(i).getCollegeEst());

        return v;
    }
}
