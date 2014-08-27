package de.ralfhergert.deckstudio.magic;

/**
 * This class represents one mana. It might fit different colors or be colorless.
 */
public class Mana {

    private final boolean isRed;
    private final boolean isGreen;
    private final boolean isBlue;
    private final boolean isWhite;
    private final boolean isBlack;

    public Mana(boolean red, boolean green, boolean blue, boolean white, boolean black) {
        isRed = red;
        isGreen = green;
        isBlue = blue;
        isWhite = white;
        isBlack = black;
    }

    /** Copy-Constructor */
    public Mana(Mana other) {
        isRed = other.isRed;
        isGreen = other.isGreen;
        isBlue = other.isBlue;
        isWhite = other.isWhite;
        isBlack = other.isBlack;
    }

    public boolean isRed() {
        return isRed;
    }

    public boolean isGreen() {
        return isGreen;
    }

    public boolean isBlue() {
        return isBlue;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public boolean isBlack() {
        return isBlack;
    }

    @Override
    public String toString() {
        return "Mana{red=" + isRed + ", green=" + isGreen + ", blue=" + isBlue + ", white=" + isWhite + ", black=" + isBlack + '}';
    }
}
