package com.nevits.cards.objects;

import static com.nevits.cards.objects.Color.BLACK;
import static com.nevits.cards.objects.Color.RED;

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

    @Override
    public String toString() {
        return unicodeCharacter;
    }

    public Color color() {
        return color;
    }

}
