package com.androidtraining.designsupportlibraryexample;

import android.support.design.widget.Snackbar;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private NestedScrollView myNestedScrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myNestedScrollView = findViewById(R.id.myNestedScrollView);


    }

    public void floatingActionButton_OnClick(View view) {
        // Pass in the click listener when displaying the Snackbar
        Snackbar.make(myNestedScrollView, "My snack text", Snackbar.LENGTH_LONG)
                .setAction("Action", null)
                .show(); // Don’t forget to show!
    }
}
