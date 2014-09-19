package com.mikehouze.rockpaperscissors;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

// Class: ResultActivity
// Descr: This class represents the logic of the ResultActivity, in which
//        the computer makes its Rock,Paper,Scissors selection, it is compared
//        to the user selection and the result is displayed.
public class ResultsActivity extends Activity {

    // Method: onCreate
    // Descri: Calls the logic that determines the winner of the Rock, Paper, Scissors
    //         match and outputs the results
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        Intent intent = getIntent();
        int clickedType = intent.getIntExtra(RockPaperScissorsUtil.INPUT_TYPE,0);

        RockPaperScissorType player1Choice = RockPaperScissorType.ROCK;
        if(clickedType==R.id.imageRock){
            player1Choice=RockPaperScissorType.ROCK;
        }else if(clickedType==R.id.imagePaper){
            player1Choice=RockPaperScissorType.PAPER;
        }else if(clickedType==R.id.imageScissors){
            player1Choice=RockPaperScissorType.SCISSORS;
        }

        RockPaperScissorsAI player2 = new RockPaperScissorsAI();
        RockPaperScissorType player2Choice = player2.play();

        // Displays the picture that correlates with the computer selection
        ImageView imageComputer = (ImageView)findViewById(R.id.imageComputer);
        if(player2Choice==RockPaperScissorType.ROCK){
            imageComputer.setImageResource(R.drawable.rock);
        }else if(player2Choice==RockPaperScissorType.PAPER){
            imageComputer.setImageResource(R.drawable.paper);
        }else if(player2Choice==RockPaperScissorType.SCISSORS){
            imageComputer.setImageResource(R.drawable.scissors);
        }

        //Displays the text of the results of the match
        String result = RockPaperScissorsUtil.eval(player1Choice,player2Choice);
        TextView textView = (TextView)findViewById(R.id.textResult);
        textView.setText(result);

        //Sets button to close the results activity
        Button button = (Button) findViewById(R.id.btnAgain);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ResultsActivity.this.finish();
            }
        });
    }

}
