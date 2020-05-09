package com.nevits.cards.objects;

/**
 * Enums representing the possible values of a playing card
 */
public enum Value {

    ACE("A"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("J"),
    QUEEN("Q"),
    KING("K");

    private String output;

    Value(String output) {
        this.output = output;
    }

    /**
     * @return a one or two character string representing the value
     */
    @Override
    public String toString() {
        return output;
    }

}
