package com.nevits.cards.objects;

import com.nevits.cards.exceptions.IllegalCardException;
import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {

    @Test
    public void test_CanInstantiateACard() throws IllegalCardException {
        Card card = new Card(Value.JACK,Suit.SPADES);
        assertEquals("J\u2664", card.toString());
    }

    @Test(expected = IllegalCardException.class)
    public void test_nullValuePreventsInstantiation() throws IllegalCardException {
        Card card = new Card(null,Suit.SPADES);
    }

    @Test(expected = IllegalCardException.class)
    public void test_nullSuitPreventsInstantiation() throws IllegalCardException {
        Card card = new Card(Value.JACK,null);
    }

    @Test
    public void test_CardsWithSameSuitAndValueAreEqual() throws IllegalCardException {
        Card kingOfHeartsA = new Card(Value.KING,Suit.HEARTS);
        Card kingOfHeartsB = new Card(Value.KING,Suit.HEARTS);
        assertEquals(kingOfHeartsA,kingOfHeartsB);
    }

    @Test
    public void test_CardsWithDifferentValueAreNotEqual() throws IllegalCardException {
        Card twoOfHearts = new Card(Value.TWO,Suit.HEARTS);
        Card kingOfHearts = new Card(Value.KING,Suit.HEARTS);
        assertNotEquals(twoOfHearts,kingOfHearts);
    }

    @Test
    public void test_CardsWithDifferentSuitsAreNotEqual() throws IllegalCardException {
        Card kingOfHearts = new Card(Value.KING,Suit.HEARTS);
        Card kingOfDiamonds = new Card(Value.KING,Suit.DIAMONDS);
        assertNotEquals(kingOfDiamonds,kingOfHearts);
    }

    @Test
    public void test_CardsWithSameSuitAndValueShareHash() throws IllegalCardException {
        Card kingOfHeartsA = new Card(Value.KING,Suit.HEARTS);
        Card kingOfHeartsB = new Card(Value.KING,Suit.HEARTS);
        assertEquals(kingOfHeartsA.hashCode(),kingOfHeartsB.hashCode());
    }

    @Test
    public void test_CardsWithDifferentValueDoNotShareHash() throws IllegalCardException {
        Card twoOfHearts = new Card(Value.TWO,Suit.HEARTS);
        Card kingOfHearts = new Card(Value.KING,Suit.HEARTS);
        assertNotEquals(twoOfHearts.hashCode(),kingOfHearts.hashCode());
    }

    @Test
    public void test_CardsWithDifferentSuitsDoNotShareHash() throws IllegalCardException {
        Card kingOfHearts = new Card(Value.KING,Suit.HEARTS);
        Card kingOfDiamonds = new Card(Value.KING,Suit.DIAMONDS);
        assertNotEquals(kingOfDiamonds.hashCode(),kingOfHearts.hashCode());
    }

}