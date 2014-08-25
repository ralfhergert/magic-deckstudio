package de.ralfhergert.deckstudio.magic;

/**
 * Super class for all cards.
 */
public class Card {

    private boolean isTapped;
    private Player owner;
    private Player controller;

    public boolean isTapped() {
        return isTapped;
    }

    public void setTapped(boolean tapped) {
        isTapped = tapped;
    }
}
