package com.nevits.cards.objects;

import com.nevits.cards.exceptions.IllegalCardException;

public class Card {

    private Value value;
    private Suit suit;

    public Card(Value value, Suit suit) throws IllegalCardException {
        validateCardInputs(value, suit);
        this.suit = suit;
        this.value = value;
    }

    private void validateCardInputs(Value value, Suit suit) throws IllegalCardException {
        if(value == null) {
            throw new IllegalCardException("Value cannot be null");
        }
        if(suit == null) {
            throw new IllegalCardException("Suit cannot be null");
        }
    }

    public Value getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return value.toString() + " of " + suit.toUnicode();
    }
}
