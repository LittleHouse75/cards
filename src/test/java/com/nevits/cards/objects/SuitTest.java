package com.nevits.cards.objects;

import org.junit.Test;

import static com.nevits.cards.objects.Color.BLACK;
import static com.nevits.cards.objects.Color.RED;
import static com.nevits.cards.objects.Suit.*;
import static com.nevits.cards.objects.Suit.DIAMONDS;
import static org.junit.Assert.*;

public class SuitTest {

    @Test
    public void test_HEARTS() {
        assertEquals("\u2661",HEARTS.toUnicode());
        assertEquals(RED,HEARTS.color());
    }

    @Test
    public void test_CLUBS() {
        assertEquals("\u2667",CLUBS.toUnicode());
        assertEquals(BLACK,CLUBS.color());
    }

    @Test
    public void test_DIAMONDS() {
        assertEquals("\u2662",DIAMONDS.toUnicode());
        assertEquals(RED,DIAMONDS.color());
    }

    @Test
    public void test_SPADES() {
        assertEquals("\u2664",SPADES.toUnicode());
        assertEquals(BLACK,SPADES.color());
    }

}