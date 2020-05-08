package com.nevits.cards;

import com.nevits.cards.exceptions.EmptyDeckException;
import com.nevits.cards.objects.Deck;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        System.out.println("\n\n*****************************************************");
        System.out.println("Generating new standard deck of 52 cards...");
        Deck unshuffledDeck = new Deck();
        System.out.println("Dealing unshuffled cards:");
        dealCards(unshuffledDeck);

        System.out.println("\n\n*****************************************************");
        System.out.println("Generating new standard deck of 52 cards, then shuffling...");
        Deck shuffledDeck = new Deck();
        shuffledDeck.shuffle();
        System.out.println("Dealing shuffled cards:");
        dealCards(shuffledDeck);

    }

    private static void dealCards(Deck deck) {
        int deckSize = deck.size();
        for(int i = 0; i < deckSize; i++) {
            try {
                if(i % 4 == 0) {
                    System.out.print("\n");
                }
                System.out.print(deck.deal() + " ");
            } catch(EmptyDeckException e) {
                LOGGER.log(Level.SEVERE,"Deck unexpectedly empty!",e);
            }
        }
        System.out.print("\n");
    }

}
