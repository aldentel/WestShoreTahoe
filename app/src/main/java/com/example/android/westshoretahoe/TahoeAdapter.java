package com.example.android.westshoretahoe;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.v4.content.ContextCompat;
import android.text.method.LinkMovementMethod;
import android.text.method.Touch;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.RelativeLayout.LayoutParams;

import java.util.ArrayList;

/**
 * Created by Salome on 9/23/17.
 */

public class TahoeAdapter extends ArrayAdapter<Tahoeplace> {

    private Context context;

    public TahoeAdapter(Activity context, ArrayList<Tahoeplace> tahoe) {

        super(context, 0, tahoe);
        this.context = context;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_layout, parent, false);}

        final Tahoeplace currentPlace = getItem(position);

        ImageView imageView = listItemView.findViewById(R.id.tahoe_picture);
        imageView.setImageResource(currentPlace.getImageResourceID());

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Dialog dialog = new Dialog(context);
                dialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);

                RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
                lp.addRule(RelativeLayout.CENTER_IN_PARENT);
                ImageView iv = new ImageView(context);
                iv.setLayoutParams(lp);
                iv.setImageResource(currentPlace.getImageResourceID());

                dialog.addContentView(iv,lp);
                dialog.show();

                iv.setOnClickListener (new View.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        dialog.hide();
                    }
            });}});


        TextView descriptTextView = listItemView.findViewById(R.id.place_description);
        descriptTextView.setText(currentPlace.getPlaceDescription());
        descriptTextView.getBackground();

        TextView linkTextView = listItemView.findViewById(R.id.place_link);
        linkTextView.setText(currentPlace.getPlaceLink());

        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());

        return listItemView;

}}
