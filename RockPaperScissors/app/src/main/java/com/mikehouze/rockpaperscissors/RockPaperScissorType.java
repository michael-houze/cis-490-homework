package com.mikehouze.rockpaperscissors;

/**
 * Created by Michael on 9/18/2014.
 */
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
