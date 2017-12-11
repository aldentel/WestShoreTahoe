package com.example.android.westshoretahoe;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;

public class WaterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);

        final ArrayList<Tahoeplace> water = new ArrayList<>();
        water.add(new Tahoeplace(R.drawable.commonsrocks, R.string.commons_desc, R.string.commons_beach));
        water.add(new Tahoeplace(R.drawable.sailboats, R.string.sailing_desc, R.string.sailing));
        water.add(new Tahoeplace(R.drawable.obex, R.string.obex_desc, R.string.obexers_boat));
        water.add(new Tahoeplace(R.drawable.powerboat, R.string.highdry_desc, R.string.high_and_dry));
        water.add(new Tahoeplace(R.drawable.sugarpine_beach, R.string.sugarbeach_desc, R.string.sugar_pine_beach));
        water.add(new Tahoeplace(R.drawable.meeks, R.string.meeks_desc, R.string.meeks_bay));

        TahoeAdapter picAdapter = new TahoeAdapter(this, water);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(picAdapter);
    }

}

