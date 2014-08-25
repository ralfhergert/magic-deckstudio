package de.ralfhergert.deckstudio.magic;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents the game state of one of the players.
 */
public class PlayerSituation {

    private int lifePoints = 20;
    private int manapool = 0;
    private List<Card> hand = new ArrayList<Card>();
    private List<Card> library = new ArrayList<Card>();
    private List<Card> graveyard = new ArrayList<Card>();
}
