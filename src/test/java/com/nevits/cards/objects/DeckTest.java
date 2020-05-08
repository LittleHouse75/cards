package com.nevits.cards.objects;

import com.nevits.cards.exceptions.EmptyDeckException;
import org.junit.Before;
import org.junit.Test;
import org.junit.internal.runners.statements.ExpectException;

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
        for(int i = 0; i < deck.size(); i++) {
            Card card = deck.deal();
            assert(!discardPile.contains(card));
            discardPile.add(card);
        }
    }

    @Test
    public void cardsAreNotNull() throws EmptyDeckException {
        for(int i = 0; i < deck.size(); i++) {
            assertNotNull(deck.deal());
        }
    }

    @Test
    public void dealtCardIsUnique() throws EmptyDeckException {
        Card dealtCard = deck.deal();
        List<Card> otherCards = new ArrayList<>();
        for(int i = 0; i < deck.size(); i++) {
            otherCards.add(deck.deal());
        }
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
        for(int i = 0; i < 53; i++) {
            deck.deal();
        }
    }

}