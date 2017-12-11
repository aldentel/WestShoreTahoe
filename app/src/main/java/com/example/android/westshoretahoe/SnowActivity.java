package com.example.android.westshoretahoe;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;

public class SnowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);

        final ArrayList<Tahoeplace> snow = new ArrayList<>();
        snow.add(new Tahoeplace(R.drawable.sugarpine_snowshoe, R.string.sugarpine_desc, R.string.ed_zburg));
        snow.add(new Tahoeplace(R.drawable.homewood, R.string.homewood_desc, R.string.homewood_mountain));
        snow.add(new Tahoeplace(R.drawable.tahoexcmap, R.string.xc_desc, R.string.tahoe_city_ski));
        snow.add(new Tahoeplace(R.drawable.jakes, R.string.jakes_desc, R.string.jakes_peak));
        snow.add(new Tahoeplace(R.drawable.blackwood, R.string.blackwood_desc, R.string.blackwood));
        snow.add(new Tahoeplace(R.drawable.granlibakken, R.string.gran_desc, R.string.granlibakken));

        TahoeAdapter picAdapter = new TahoeAdapter(this, snow);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(picAdapter);
    }

}

