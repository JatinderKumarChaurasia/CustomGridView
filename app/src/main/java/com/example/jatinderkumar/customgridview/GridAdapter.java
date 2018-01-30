package com.example.jatinderkumar.customgridview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jatinder Kumar on 30-01-2018.
 */

public class GridAdapter extends BaseAdapter {

    ArrayList<Person> p;
    Context context;

    public GridAdapter(ArrayList<Person> p, Context context) {
        this.p = p;
        this.context = context;
    }

    @Override
    public int getCount() {
        return p.size();
    }

    @Override
    public Object getItem(int position) {
        return p.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Person person = (Person) getItem(position);
        Activity activity =(Activity) context;
        LayoutInflater inflater = activity.getLayoutInflater();
        View view = inflater.inflate(R.layout.gridlayout,null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageBox);
        TextView textView =(TextView) view.findViewById(R.id.txtName);
        TextView textView1 =(TextView) view.findViewById(R.id.txtDescription);
        imageView.setImageResource(person.getImage());
        textView.setText(person.getName());
        textView1.setText(person.getDescription());
        return view;

    }
}
