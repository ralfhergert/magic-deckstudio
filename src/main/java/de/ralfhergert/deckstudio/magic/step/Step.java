package de.ralfhergert.deckstudio.magic.step;

import de.ralfhergert.deckstudio.magic.Situation;

/**
 * Super class for all steps.
 */
public class Step {

    private Situation situation;

    public Step(Situation situation) {
        this.situation = situation;
    }
}
