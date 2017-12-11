package com.example.android.westshoretahoe;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.android.westshoretahoe.R.*;

/**
 * A simple {@link Fragment} subclass.
 */
public class WaterFragment extends Fragment {


    public WaterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_layout, container, false);

        TextView textView = rootView.findViewById(R.id.haiku);

        textView.setText(string.haiku3);

        textView.setBackgroundResource(drawable.waterbackground);
        textView.setTextColor(getResources().getColor(R.color.textdark));


        // Set a click listener on fragment
        textView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the TextView is clicked on.
            @Override
            public void onClick(View view) {
                Intent waterIntent = new Intent(getActivity(), WaterActivity.class);
                startActivity(waterIntent);
            }


        });
        return rootView;
    }

}
