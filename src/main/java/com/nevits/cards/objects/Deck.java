package com.nevits.cards.objects;

import com.nevits.cards.exceptions.EmptyDeckException;
import com.nevits.cards.exceptions.IllegalCardException;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Deck {

    private static final Logger LOGGER = Logger.getLogger(Deck.class.getName());
    private static final SecureRandom RANDOM = new SecureRandom();
    private List<Card> cards;

    public Deck() {
        initialize52CardDeck();
    }

    private void initialize52CardDeck() {
        cards = new ArrayList<>();
        for (Value value : Value.values()) {
            for (Suit suit : Suit.values()) {
                try {
                    add(new Card(value, suit));
                } catch (IllegalCardException e) {
                    handleException(e);
                }
            }
        }
    }

    private void add(Card card) {
        cards.add(card);
    }

    private void handleException(IllegalCardException e) {
        LOGGER.log(Level.SEVERE,"Unexpected error while generating deck",e);
    }

    public void shuffle() {
        Collections.shuffle(cards,RANDOM);
    }

    public int size() {
        return cards.size();
    }

    public Card deal() throws EmptyDeckException {
        if(cards.size()>0) {
            return cards.remove(0);
        } else {
            throw new EmptyDeckException("Cannot be dealt from empty deck");
        }
    }

}
