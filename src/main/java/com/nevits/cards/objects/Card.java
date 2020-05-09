package com.nevits.cards.objects;

import com.nevits.cards.exceptions.IllegalCardException;

import java.util.Objects;

public class Card {

    private Value value;
    private Suit suit;

    /**
     * Constructs a playing card from the value and suit provided.  Null values are not accepted.
     * @param value
     * @param suit
     * @throws IllegalCardException
     */
    public Card(Value value, Suit suit) throws IllegalCardException {
        validateCardInputs(value, suit);
        this.suit = suit;
        this.value = value;
    }

    private void validateCardInputs(Value value, Suit suit) throws IllegalCardException {
        if(value == null) {
            throw new IllegalCardException("Value cannot be null.");
        }
        if(suit == null) {
            throw new IllegalCardException("Suit cannot be null.");
        }
    }

    /**
     * @return the value of the card
     */
    public Value getValue() {
        return value;
    }

    /**
     * @return the suite of the card
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * @return a two to three character string indicating the value and suit of the playing card
     */
    @Override
    public String toString() {
        return value.toString() + suit.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return value == card.value &&
                suit == card.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, suit);
    }

}
