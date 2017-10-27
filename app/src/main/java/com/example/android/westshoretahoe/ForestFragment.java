package com.example.android.westshoretahoe;


import android.os.Bundle;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
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
        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        rootView.setBackgroundResource(R.drawable.forest);

        final ArrayList<Tahoepicslist> forest = new ArrayList<>();
        forest.add(new Tahoepicslist(R.drawable.edzeeburg));
        forest.add(new Tahoepicslist(R.drawable.barkerpass));
        forest.add(new Tahoepicslist(R.drawable.pct));
        forest.add(new Tahoepicslist(R.drawable.creek));
        forest.add(new Tahoepicslist(R.drawable.forest));
        forest.add(new Tahoepicslist(R.drawable.forest));

        TahoeAdapter picAdapter = new TahoeAdapter(getActivity(), forest);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(picAdapter);

        TextView textView = rootView.findViewById(R.id.haiku);

        textView.setText(R.string.haiku1);

        return rootView;

    }

}
