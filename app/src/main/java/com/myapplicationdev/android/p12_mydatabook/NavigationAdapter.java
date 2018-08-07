package com.myapplicationdev.android.p12_mydatabook;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class NavigationAdapter extends ArrayAdapter {

    Context context;
    int resource;
    ArrayList<NavigationItem> navigationItems;

    public NavigationAdapter(Context context, int resource,ArrayList<NavigationItem> navigationItems) {
        super(context, resource, navigationItems);
        this.context = context;
        this.resource = resource;
        this.navigationItems = navigationItems;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(resource, parent, false);
        TextView tvNavigationItem = (TextView) rowView.findViewById(R.id.tvNavigationItem);
        ImageView ivNavigationItem = (ImageView) rowView.findViewById(R.id.ivNavigationItem);

        NavigationItem currentItem = navigationItems.get(position);

        if(currentItem.getName().equals("Bio")) {
            String navigationTitle = currentItem.getName();
            tvNavigationItem.setText(navigationTitle);
            ivNavigationItem.setImageResource(android.R.drawable.ic_menu_info_details);
        } else if(currentItem.getName().equals("Vaccination")) {
            String navigationTitle = currentItem.getName();
            tvNavigationItem.setText(navigationTitle);
            ivNavigationItem.setImageResource(android.R.drawable.ic_menu_edit);
        } else if(currentItem.getName().equals("Anniversary")) {
            String navigationTitle = currentItem.getName();
            tvNavigationItem.setText(navigationTitle);
            ivNavigationItem.setImageResource(android.R.drawable.ic_menu_my_calendar);
        } else {
            String navigationTitle = currentItem.getName();
            tvNavigationItem.setText(navigationTitle);
            ivNavigationItem.setImageResource(android.R.drawable.btn_star_big_on);
        }
        return rowView;
    }
}
