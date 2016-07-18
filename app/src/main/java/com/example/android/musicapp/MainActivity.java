package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView instruments = (TextView) findViewById(R.id.instruments);

        // Set a click listener on that View
        instruments.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent InstrumentsIntent = new Intent(MainActivity.this, InstrumentsActivity.class);

                // Start the new activity
                startActivity(InstrumentsIntent);
            }
        });

        // Find the View that shows the numbers category
        TextView levels = (TextView) findViewById(R.id.levels);

        // Set a click listener on that View
        levels.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent LevelsIntent = new Intent(MainActivity.this, LevelsActivity.class);

                // Start the new activity
                startActivity(LevelsIntent);
            }
        });

        // Find the View that shows the numbers category
        TextView playingNow = (TextView) findViewById(R.id.playing_now);

        // Set a click listener on that View
        playingNow.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent PlayingNow = new Intent(MainActivity.this, PlayingNowActivity.class);

                // Start the new activity
                startActivity(PlayingNow);
            }
        });

        // Find the View that shows the numbers category
        TextView history = (TextView) findViewById(R.id.history);

        // Set a click listener on that View
        history.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent HistoryActivity = new Intent(MainActivity.this, HistoryActivity.class);

                // Start the new activity
                startActivity(HistoryActivity);
            }
        });

        // Find the View that shows the numbers category
        TextView search = (TextView) findViewById(R.id.search);

        // Set a click listener on that View
        search.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent SearchActivity = new Intent(MainActivity.this, SearchActivity.class);

                // Start the new activity
                startActivity(SearchActivity);
            }
        });

        // Find the View that shows the numbers category
        TextView ratings = (TextView) findViewById(R.id.ratings);

        // Set a click listener on that View
        ratings.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent RatingIntent = new Intent(MainActivity.this, RatingActivity.class);

                // Start the new activity
                startActivity(RatingIntent);
            }
        });

    }

}
