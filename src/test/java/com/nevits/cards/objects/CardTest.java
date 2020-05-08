package com.nevits.cards.objects;

import com.nevits.cards.exceptions.IllegalCardException;
import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {

    @Test
    public void test_CanInstantiateACard() throws IllegalCardException {
        Card card = new Card(Value.JACK,Suit.SPADES);
        assertEquals("Jack of \u2664", card.toString());
    }

    @Test(expected = IllegalCardException.class)
    public void test_nullValuePreventsInstantiation() throws IllegalCardException {
        Card card = new Card(null,Suit.SPADES);
    }

    @Test(expected = IllegalCardException.class)
    public void test_nullSuitPreventsInstantiation() throws IllegalCardException {
        Card card = new Card(Value.JACK,null);
    }

}