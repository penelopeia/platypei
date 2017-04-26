package com.platypus.platypusapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    /**
     * Called when the user taps the Yes! or What? button
     */
    public void GoToHome(View view) {
        /** YES button sends user to Home */
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    public void GoToLogin(View view) {
        /** What? button sends user to Login */
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}
