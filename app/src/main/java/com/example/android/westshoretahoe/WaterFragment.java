package com.example.android.westshoretahoe;


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
        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        rootView.setBackgroundResource(drawable.waterbackground);

        final ArrayList<Tahoepicslist> water = new ArrayList<>();
        water.add(new Tahoepicslist(drawable.westshore_rainbow));
        water.add(new Tahoepicslist(drawable.sugarpine_beach));
        water.add(new Tahoepicslist(drawable.fannybridge));
        water.add(new Tahoepicslist(drawable.powerboat));
        water.add(new Tahoepicslist(drawable.sailboats));
        water.add(new Tahoepicslist(R.drawable.roughwater));

        TahoeAdapter adapter = new TahoeAdapter(getActivity(), water);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        TextView textView = rootView.findViewById(R.id.haiku);

        textView.setText(R.string.haiku4);

        return rootView;

    }

}
