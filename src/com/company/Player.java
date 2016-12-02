package com.company;

/**
 * Created by student2 on 14.11.16.
 */
public abstract class Player  {
    int wallet=500;
    Hand hand = new Hand();
    private Intellect intellect;
    String name;
    PlayerState state = PlayerState.IN_GAME;
    public int makeBet(){
        this.wallet-=100;
        return 100;
    }

    public void take(Card current) {
        hand.add(current);
    }

    public Player(String name, Intellect intellect) {
        this.intellect = intellect;
        this.name = name;
    }

    public Command decision() {
        int score = hand.getScore();
        if (score>21)
            return Command.STAND;
        return intellect.decide(score);
    }
}
