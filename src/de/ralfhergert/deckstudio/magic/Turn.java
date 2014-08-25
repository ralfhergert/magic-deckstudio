package de.ralfhergert.deckstudio.magic;

import de.ralfhergert.deckstudio.magic.step.Step;

/**
 * Points out in which turn-state we are.
 */
public class Turn {

    private Player player;
    private Phase phase;
    private Step step;
}
