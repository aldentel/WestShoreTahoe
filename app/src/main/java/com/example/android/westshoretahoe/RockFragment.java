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
public class RockFragment extends Fragment {


    public RockFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        rootView.setBackgroundResource(R.drawable.granite);

        final ArrayList<Tahoepicslist> rock = new ArrayList<>();
        rock.add(new Tahoepicslist(R.drawable.commonsrocks));
        rock.add(new Tahoepicslist(R.drawable.eaglerock));
        rock.add(new Tahoepicslist(R.drawable.eaglerock_geo));
        rock.add(new Tahoepicslist(R.drawable.eaglerock_geo));
        rock.add(new Tahoepicslist(R.drawable.eaglerock_geo));
        rock.add(new Tahoepicslist(R.drawable.eaglerock_geo));

        TahoeAdapter adapter = new TahoeAdapter(getActivity(), rock);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        TextView textView = rootView.findViewById(R.id.haiku);

        textView.setText(R.string.haiku2);

        return rootView;

    }

}
