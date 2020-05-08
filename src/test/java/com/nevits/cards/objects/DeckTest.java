package com.nevits.cards.objects;

import com.nevits.cards.exceptions.EmptyDeckException;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DeckTest {

    private Deck deck;

    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void canInstantiate52CardDeck() {
        assertEquals(52,deck.size());
    }

    @Test
    public void cardsAreAllUnique() throws EmptyDeckException {
        List<Card> discardPile = new ArrayList<>();
        int deckSize = deck.size();
        for(int i = 0; i < deckSize; i++) {
            Card card = deck.deal();
            assert(!discardPile.contains(card));
            discardPile.add(card);
        }
    }

    @Test
    public void cardsAreNotNull() throws EmptyDeckException {
        for(int i = 0; i < 52; i++) {
            assertNotNull(deck.deal());
        }
    }

    @Test
    public void dealtCardIsUnique() throws EmptyDeckException {
        Card dealtCard = deck.deal();
        int deckSize = deck.size();
        List<Card> otherCards = convertDeckToList(deck);
        assert(!otherCards.contains(dealtCard));
    }

    @Test
    public void dealtCardIsNotNull() throws EmptyDeckException {
        Card dealtCard = deck.deal();
        assertNotNull(dealtCard);
    }

    @Test
    public void dealingCardReducesDeckSize() throws EmptyDeckException {
        Card dealtCard = deck.deal();
        assertEquals(51,deck.size());
    }

    @Test(expected = EmptyDeckException.class)
    public void dealingCardFromEmptyDeckThrowsException() throws EmptyDeckException {
        int deckSize = deck.size();
        for(int i = 0; i < deckSize + 1; i++) {
            deck.deal();
        }
    }

    @Test
    public void cardsStartOrdered() throws EmptyDeckException {
        List<Card> cards = convertDeckToList(deck);
        int cardsCloseTogether = measureCardCloseness(cards);
        assertEquals(51,cardsCloseTogether);
    }

    @Test
    public void shuffledCardsAreDisordered() throws EmptyDeckException {
        deck.shuffle();
        List<Card> cards = convertDeckToList(deck);
        int cardsCloseTogether = measureCardCloseness(cards);
        // INSIGHT: Occasionally this test will fail.  It is *possible* for a random shuffling to leave
        // a number of cards close together
        assert(cardsCloseTogether < 15);
    }

    private List<Card> convertDeckToList(Deck deck) throws EmptyDeckException {
        int deckSize = deck.size();
        List<Card> cards = new ArrayList<>();
        for(int i = 0; i < deckSize; i++) {
            cards.add(deck.deal());
        }
        return cards;
    }

    private int measureCardCloseness(List<Card> cards) {
        int cardsCloseTogether = 0;
        for(int i = 1; i < cards.size(); i++) {
            if(cardsAreClose(cards.get(i),cards.get(i-1))) {
                cardsCloseTogether++;
            }
        }
        return cardsCloseTogether;
    }

    private boolean cardsAreClose(Card cardA, Card cardB) {
        return Math.abs(cardA.getValue().ordinal() - cardB.getValue().ordinal()) < 2;
    }


}