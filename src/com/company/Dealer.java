package com.company;

/**
 * Created by student2 on 14.11.16.
 */
public class Dealer extends Computer {
    Deck deck = new Deck();

    public Dealer() {
        super(new DealerIntellect());
        name="DEALER";
    }

    public void deal(Player player) {
        Card current = deck.pop();
        player.take(current);
    }
}
