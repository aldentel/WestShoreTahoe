package com.example.android.westshoretahoe;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;

public class BeerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);

        final ArrayList<Tahoeplace> beer = new ArrayList<>();
        beer.add(new Tahoeplace(R.drawable.tahoemtn_brew, R.string.tmb_desc, R.string.tahoe_mountain_brew));
        beer.add(new Tahoeplace(R.drawable.wspizza, R.string.wsp_desc, R.string.westshore_pizza));
        beer.add(new Tahoeplace(R.drawable.chambers, R.string.chambers_desc, R.string.chambers_landing));
        beer.add(new Tahoeplace(R.drawable.bridge, R.string.bridge_desc, R.string.bridgetender));
        beer.add(new Tahoeplace(R.drawable.wsc, R.string.wsc_desc, R.string.west_shore_cafe));


        TahoeAdapter picAdapter = new TahoeAdapter(this, beer);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(picAdapter);
    }

}

