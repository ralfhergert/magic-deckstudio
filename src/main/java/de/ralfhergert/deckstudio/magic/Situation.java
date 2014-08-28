package de.ralfhergert.deckstudio.magic;

import de.ralfhergert.deckstudio.magic.event.StepEvent;
import de.ralfhergert.deckstudio.magic.step.Step;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a state in the game.
 */
public class Situation {

    private List<PlayerSituation> players = new ArrayList<PlayerSituation>();
    private List<Card> battlefield = new ArrayList<Card>();
    private List<Card> stack = new ArrayList<Card>();
    private List<Card> exile = new ArrayList<Card>();
    private List<Card> command = new ArrayList<Card>();
    private List<Card> outsideTheGame = new ArrayList<Card>();
    private Step nextStep;

    private Player activePlayer;

    public void receiveEvent(StepEvent event) {
    }
}
