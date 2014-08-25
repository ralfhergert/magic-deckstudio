package de.ralfhergert.deckstudio.magic.event;

import de.ralfhergert.deckstudio.magic.step.Step;

/**
 * This event is used when a step begins or ends.
 */
public abstract class StepEvent {

    private final Step step;

    protected StepEvent(Step step) {
        this.step = step;
    }
}
