package com.example.android.westshoretahoe;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SnowFragment extends Fragment {


    public SnowFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        rootView.setBackgroundResource(R.drawable.snow);

        final ArrayList<Tahoepicslist> snow = new ArrayList<>();
        snow.add(new Tahoepicslist(R.drawable.homewood));
        snow.add(new Tahoepicslist(R.drawable.sugarpine_snowshoe));
        snow.add(new Tahoepicslist(R.drawable.homewood));
        snow.add(new Tahoepicslist(R.drawable.homewood));
        snow.add(new Tahoepicslist(R.drawable.homewood));
        snow.add(new Tahoepicslist(R.drawable.homewood));

        TahoeAdapter adapter = new TahoeAdapter(getActivity(), snow);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        TextView textView = rootView.findViewById(R.id.haiku);

        textView.setText(R.string.haiku3);

        return rootView;

    }

}
