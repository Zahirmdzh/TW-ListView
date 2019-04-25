package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CourseAdapter extends ArrayAdapter<Course> {

    private ArrayList<Course> course;
    private Context context;
    private TextView tvCourseName;
    private ImageView ivPro;

    public CourseAdapter(Context context, int resource, ArrayList<Course> objects){
        super(context, resource, objects);

        course = objects;

        this.context = context;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.row,parent,false);

        tvCourseName = rowView.findViewById(R.id.tvCourse);
         ivPro = rowView.findViewById(R.id.ivPro);

         Course currentCourse = course.get(position);

         tvCourseName.setText(currentCourse.getModule());

         if(currentCourse.isProg()) {
             ivPro.setImageResource(R.drawable.prog);
         }
         else {
             ivPro.setImageResource(R.drawable.nonprog);
         }

         return rowView;

    }

}
