package com.example.android.westshoretahoe;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Salome on 9/23/17.
 */

public class TahoeAdapter extends ArrayAdapter<Tahoepicslist> {

    private Context context;

    /** Resource ID for the background picture for this list of words */
    //private int mDrawableResourceID;


    public TahoeAdapter(Activity context, ArrayList<Tahoepicslist> tahoe) {

        super(context, 0, tahoe);
        this.context = context;

        //mDrawableResourceID = drawableResourceID;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_layout, parent, false);}

        Tahoepicslist currentPlace = getItem(position);

        final ImageView pictureImageView = listItemView.findViewById(R.id.tahoe_picture);
        pictureImageView.setImageResource(currentPlace.getImageResourceID());

        // Set a click listener on ImageView
        pictureImageView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent pictureIntent = new Intent(getContext(), FullscreenActivity.class);
                context.startActivity(pictureIntent);}
    });

        // Set the picture for the list item
        //View textBackground = listItemView.findViewById(R.id.text_background);

        //textBackground.setBackgroundResource(mDrawableResourceID);


        /**TextView descriptTextView = listItemView.findViewById(R.id.place_description);
        descriptTextView.setText(currentPlace.getPlaceDescription());
        descriptTextView.getBackground();

        TextView linkTextView = listItemView.findViewById(R.id.place_link);
        linkTextView.setText(currentPlace.getPlaceLink());*/

        return listItemView;

    }
}
