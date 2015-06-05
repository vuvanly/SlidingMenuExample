package com.example.apple.slidingmenu;

import android.content.Context;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by apple on 6/5/15.
 */
public class Utils {
    public static ImageView setActionBarBackButton(final Context context, ActionBar actionBar, String title) {
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.custom_action_bar, null);
        TextView tvTitle = (TextView) view.findViewById(R.id.actionBarTitle);
        tvTitle.setText(title);
        actionBar.setCustomView(view);
        Toolbar parent = (Toolbar) view.getParent();//first get parent toolbar of current action bar
        parent.setContentInsetsAbsolute(0, 0);
        ImageView im_BackButton = (ImageView) view.findViewById(R.id.actionBarBackButton);
        return im_BackButton;
    }
}
