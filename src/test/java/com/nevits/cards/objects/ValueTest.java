package com.nevits.cards.objects;

import org.junit.Test;

import static com.nevits.cards.objects.Value.*;
import static org.junit.Assert.*;

public class ValueTest {

    @Test
    public void test_ACE() {
        assertEquals("A",ACE.toString());
    }

    @Test
    public void test_TWO() {
        assertEquals("2",TWO.toString());
    }

    @Test
    public void test_THREE() {
        assertEquals("3",THREE.toString());
    }

    @Test
    public void test_FOUR() {
        assertEquals("4",FOUR.toString());
    }

    @Test
    public void test_FIVE() {
        assertEquals("5",FIVE.toString());
    }

    @Test
    public void test_SIX() {
        assertEquals("6",SIX.toString());
    }

    @Test
    public void test_SEVEN() {
        assertEquals("7",SEVEN.toString());
    }

    @Test
    public void test_EIGHT() {
        assertEquals("8",EIGHT.toString());
    }

    @Test
    public void test_NINE() {
        assertEquals("9",NINE.toString());
    }

    @Test
    public void test_TEN() {
        assertEquals("10",TEN.toString());
    }

    @Test
    public void test_JACK() {
        assertEquals("J",JACK.toString());
    }

    @Test
    public void test_QUEEN() {
        assertEquals("Q",QUEEN.toString());
    }

    @Test
    public void test_KING() {
        assertEquals("K",KING.toString());
    }

}