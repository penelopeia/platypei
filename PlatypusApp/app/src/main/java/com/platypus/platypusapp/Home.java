package com.platypus.platypusapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    /**
     * Called when the user taps the Explore or Chat button
     */
    public void GoToExplore(View view) {
        /** Explore button sends user to Home */
        Intent intent = new Intent(this, Explore_home.class);
        startActivity(intent);
    }

    public void GoToChat(View view) {
        /** What? button sends user to Login */
        Intent intent = new Intent(this, Chat_home.class);
        startActivity(intent);

    }
}


