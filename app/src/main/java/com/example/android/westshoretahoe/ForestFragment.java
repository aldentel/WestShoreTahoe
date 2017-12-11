package com.example.android.westshoretahoe;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.android.westshoretahoe.R.string.haiku1;

/**
 * A simple {@link Fragment} subclass.
 */
public class ForestFragment extends Fragment {

    public ForestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_layout, container, false);

        TextView textView = rootView.findViewById(R.id.haiku);

        textView.setText(R.string.haiku1);

        textView.setBackgroundResource(R.drawable.forest);
        textView.setTextColor(getResources().getColor(R.color.colorPrimary));


        // Set a click listener on fragment
        textView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the TextView is clicked on.
            @Override
            public void onClick(View view) {
                Intent forestIntent = new Intent(getActivity(), ForestActivity.class);
                startActivity(forestIntent);
            }


        });
        return rootView;
    }

}