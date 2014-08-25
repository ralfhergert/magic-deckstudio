package de.ralfhergert.deckstudio.magic.event;

import de.ralfhergert.deckstudio.magic.step.Step;

/**
 * This event is thrown when a step ends.
 */
public class StepEndEvent extends StepEvent {

    public StepEndEvent(Step step) {
        super(step);
    }
}
