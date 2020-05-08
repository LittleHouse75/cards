package com.nevits.cards.objects;

public enum Value {

    ACE("Ace"),
    TWO("Two"),
    THREE("Three"),
    FOUR("Four"),
    FIVE("Five"),
    SIX("Six"),
    SEVEN("Seven"),
    EIGHT("Eight"),
    NINE("Nine"),
    TEN("Ten"),
    JACK("Jack"),
    QUEEN("Queen"),
    KING("King");

    private String output;

    Value(String output) {
        this.output = output;
    }

    @Override
    public String toString() {
        return output;
    }

}
