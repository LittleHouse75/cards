package com.nevits.cards.objects;

import static com.nevits.cards.objects.Color.BLACK;
import static com.nevits.cards.objects.Color.RED;

/**
 * Enums representing the possible suits of a playing card
 */
public enum Suit {

    CLUBS("\u2667", BLACK),
    DIAMONDS("\u2662", RED),
    HEARTS("\u2661", RED),
    SPADES("\u2664", BLACK);

    private String unicodeCharacter;
    private Color color;

    Suit(String unicodeCharacter, Color color) {
        this.unicodeCharacter = unicodeCharacter;
        this.color = color;
    }

    /**
     * @return the unicode character representing the suit
     */
    @Override
    public String toString() {
        return unicodeCharacter;
    }

    /**
     * @return the color of the suit
     */
    public Color color() {
        return color;
    }

}
