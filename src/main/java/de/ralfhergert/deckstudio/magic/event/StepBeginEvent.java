package de.ralfhergert.deckstudio.magic.event;

import de.ralfhergert.deckstudio.magic.step.Step;

/**
 * This event is thrown when a step begins.
 */
public class StepBeginEvent extends StepEvent {

    public StepBeginEvent(Step step) {
        super(step);
    }
}
