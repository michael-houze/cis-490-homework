package com.mikehouze.rockpaperscissors;

import java.util.Date;
import java.util.Random;

// Class: RockPaperScissorsAI
// Descr: This class represents the logic behind creating the random
//        computer choice in a game of Rock, Paper, Scissors.
public class RockPaperScissorsAI {
    private static int counter=0;
    public RockPaperScissorType play(){
        Random random = new Random(new Date().getTime() + counter++);
        int randomNumber = random.nextInt(3);
        switch(randomNumber){
            case 0 : return RockPaperScissorType.ROCK;
            case 1 : return RockPaperScissorType.PAPER;
            default : return RockPaperScissorType.SCISSORS;
        }
    }
}
