package com.mikehouze.rockpaperscissors;

//  Enum: RockPaperScissorType
// Descr: This enum represents the three possible choices for
//        a Rock, Paper, Scissors game.
public enum RockPaperScissorType {
    ROCK("Rock"), PAPER("Paper"), SCISSORS("Scissors");
    private String value;

    RockPaperScissorType(String value){
        this.value=value;
    }

    public String getValue() {
        return value;
    }
}
