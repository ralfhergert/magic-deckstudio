package de.ralfhergert.deckstudio.magic.step;

import de.ralfhergert.deckstudio.magic.Player;
import de.ralfhergert.deckstudio.magic.Situation;
import de.ralfhergert.deckstudio.magic.event.StepBeginEvent;
import de.ralfhergert.deckstudio.magic.event.StepEndEvent;

/**
 * Super class for all steps.
 */
public abstract class Step {

    private final String stepName;
    private final int turn;
    private final Player activePlayer;
    private final Situation situation;

    protected Step(String stepName, int turn, Player activePlayer, Situation situation) {
        this.stepName = stepName;
        this.turn = turn;
        this.activePlayer = activePlayer;
        this.situation = situation;
    }

    public void perform() {
        situation.receiveEvent(new StepBeginEvent(this));

        situation.receiveEvent(new StepEndEvent(this));
    }
}
