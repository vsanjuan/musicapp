package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RatingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

        // Find the View that shows the numbers category
        TextView instruments = (TextView) findViewById(R.id.instruments);

        // Set a click listener on that View
        instruments.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent InstrumentsIntent = new Intent(RatingActivity.this, InstrumentsActivity.class);

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
                Intent LevelsIntent = new Intent(RatingActivity.this, LevelsActivity.class);

                // Start the new activity
                startActivity(LevelsIntent);
            }
        });


        // Find the View that shows the numbers category
        TextView main = (TextView) findViewById(R.id.main);

        // Set a click listener on that View
        main.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent MainIntent = new Intent(RatingActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(MainIntent);
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
                Intent HistoryIntent = new Intent(RatingActivity.this, HistoryActivity.class);

                // Start the new activity
                startActivity(HistoryIntent);
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
                Intent SearchIntent = new Intent(RatingActivity.this, SearchActivity.class);

                // Start the new activity
                startActivity(SearchIntent);
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
                Intent PlayingNowIntent = new Intent(RatingActivity.this, PlayingNowActivity.class);

                // Start the new activity
                startActivity(PlayingNowIntent);
            }
        });
    }
}
