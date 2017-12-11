package com.example.android.westshoretahoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OpeningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening);

        // Find the Enter Button
        Button enterHere = findViewById(R.id.enter_here);

        // Set a click listener on Enter Button
        enterHere.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Enter Here Button is clicked on.
            @Override
            public void onClick(View view) {
                Intent enterIntent = new Intent(OpeningActivity.this, MainActivity.class);
                startActivity(enterIntent);
            }
        });
    }
}
