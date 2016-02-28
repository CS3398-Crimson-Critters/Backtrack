package com.example.crimson.backtrack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //test comment for commit

    @Override
    //method to open main activity on first open app
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //method to navigate to Profile activity after "View Profile" button is clicked
    public void viewProfile(View view) {
        //navigate to profile page
        /****************************************************************************
            Creates an "Intent" that represents an app's "intent to do something".
            You can use intents for a wide variety of tasks, but most often they
            are used to start another activity. For more info, see:
            http://developer.android.com/guide/components/intents-filters.html
         ***************************************************************************/
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }
}
