package com.example.android.westshoretahoe;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class ForestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);
        Toolbar myToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);

        final ArrayList<Tahoeplace> forest = new ArrayList<>();
        forest.add(new Tahoeplace(R.drawable.burtoncreek, R.string.burton_desc, R.string.burton_creek));
        forest.add(new Tahoeplace(R.drawable.barkerpass, R.string.pct_desc, R.string.pct));
        forest.add(new Tahoeplace(R.drawable.pct, R.string.trt_desc, R.string.tahoe_rim_trail));
        forest.add(new Tahoeplace(R.drawable.eagle_rock, R.string.eagle_desc, R.string.eagle_rock));
        forest.add(new Tahoeplace(R.drawable.dlbliss, R.string.bliss_desc, R.string.dl_bliss));
        forest.add(new Tahoeplace(R.drawable.emeraldbay, R.string.emerald_desc, R.string.emerald_bay));

        TahoeAdapter picAdapter = new TahoeAdapter(this, forest);

        ListView listView= findViewById(R.id.list);

        listView.setAdapter(picAdapter);
    }

}
