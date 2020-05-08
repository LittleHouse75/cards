package com.nevits.cards.objects;

import org.junit.Test;

import static com.nevits.cards.objects.Value.*;
import static org.junit.Assert.*;

public class ValueTest {

    @Test
    public void test_ACE() {
        assertEquals("Ace",ACE.toString());
    }

    @Test
    public void test_ONE() {
        assertEquals("One",ONE.toString());
    }

    @Test
    public void test_TWO() {
        assertEquals("Two",TWO.toString());
    }

    @Test
    public void test_THREE() {
        assertEquals("Three",THREE.toString());
    }

    @Test
    public void test_FOUR() {
        assertEquals("Four",FOUR.toString());
    }

    @Test
    public void test_FIVE() {
        assertEquals("Five",FIVE.toString());
    }
    
    @Test
    public void test_SIX() {
        assertEquals("Six",SIX.toString());
    }

    @Test
    public void test_SEVEN() {
        assertEquals("Seven",SEVEN.toString());
    }

    @Test
    public void test_EIGHT() {
        assertEquals("Eight",EIGHT.toString());
    }

    @Test
    public void test_NINE() {
        assertEquals("Nine",NINE.toString());
    }

    @Test
    public void test_TEN() {
        assertEquals("Ten",TEN.toString());
    }

    @Test
    public void test_JACK() {
        assertEquals("Jack",JACK.toString());
    }

    @Test
    public void test_QUEEN() {
        assertEquals("Queen",QUEEN.toString());
    }

    @Test
    public void test_KING() {
        assertEquals("King",KING.toString());
    }

}