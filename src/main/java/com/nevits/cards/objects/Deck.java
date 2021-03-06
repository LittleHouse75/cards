package com.nevits.cards.objects;

import com.nevits.cards.exceptions.EmptyDeckException;
import com.nevits.cards.exceptions.IllegalCardException;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *  A deck of cards
 */
public class Deck {

    private static final Logger LOGGER = Logger.getLogger(Deck.class.getName());
    private static final SecureRandom RANDOM = new SecureRandom();
    private List<Card> cards = new ArrayList<>();


    /**
     * Constructs a new, standard 52 card deck
     */
    public Deck() {
        initialize52CardDeck();
    }

    /**
     * Arranges the cards within a deck in a random order
     */
    public void shuffle() {
        Collections.shuffle(cards,RANDOM);
    }


    /**
     * @return Returns an int of the number of cards currently in the deck
     */
    public int size() {
        return cards.size();
    }

    /**
     * @return the top card from the deck, decreasing the deck size by one
     * @throws EmptyDeckException
     */
    public Card deal() throws EmptyDeckException {
        if(cards.size()>0) {
            return cards.remove(0);
        } else {
            throw new EmptyDeckException("Cannot be dealt from empty deck");
        }
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
        LOGGER.log(Level.SEVERE,"Unexpected exception while generating deck",e);
    }

}
