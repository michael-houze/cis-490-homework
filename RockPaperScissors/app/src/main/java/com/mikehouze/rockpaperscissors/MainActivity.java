package com.mikehouze.rockpaperscissors;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

// Class: MainActivity
// Descr: This class represents the UI logic of the MainActivity,
//        where the user makes their Rock,Paper,Scissors selection.
public class MainActivity extends Activity implements View.OnClickListener{

    // Method: onCreate
    // Descri: Creates the event listeners that will wait for user input
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageViewRock = (ImageView)findViewById(R.id.imageRock);
        imageViewRock.setOnClickListener(this);

        ImageView imageViewPaper = (ImageView)findViewById(R.id.imagePaper);
        imageViewPaper.setOnClickListener(this);

        ImageView imageViewScissors = (ImageView)findViewById(R.id.imageScissors);
        imageViewScissors.setOnClickListener(this);
    }

    // Method: onClick
    // Descri: Creates an intent that will direct user to ResultsActivity,
    //         along with user selection
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this,ResultsActivity.class);
        intent.putExtra(RockPaperScissorsUtil.INPUT_TYPE,view.getId());
        startActivity(intent);
    }
}
