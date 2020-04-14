/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DISPA
 */
public class DeckTest {
    
    public DeckTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of deal method, of class Deck.
     */
   
    public void testDeal() {
        System.out.println("deal");
        int numOfCards = 0;
        Deck instance = new Deck();
        instance.deal(numOfCards);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValue method, of class Deck.
     */
   
    public void testGetValue() {
        System.out.println("getValue");
        String card = "";
        Deck instance = new Deck();
        int expResult = 0;
        int result = instance.getValue(card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCardName method, of class Deck.
     */
   
    public void testGetCardName() {
        System.out.println("getCardName");
        String card = "";
        Deck instance = new Deck();
        String expResult = "";
        String result = instance.getCardName(card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCards method, of class Deck.
     */
    
    public void testGetCards() {
        System.out.println("getCards");
        Deck instance = new Deck();
        String[] expResult = null;
        String[] result = instance.getCards();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCards method, of class Deck.
     */
    
    public void testSetCards() {
        System.out.println("setCards");
        String[] cards = null;
        Deck instance = new Deck();
        instance.setCards(cards);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValues method, of class Deck.
     */
   
    public void testGetValues() {
        System.out.println("getValues");
        Deck instance = new Deck();
        String[] expResult = null;
        String[] result = instance.getValues();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValues method, of class Deck.
     */
    
    public void testSetValues() {
        System.out.println("setValues");
        String[] values = null;
        Deck instance = new Deck();
        instance.setValues(values);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHand method, of class Deck.
     */
    
    public void testGetHand() {
        System.out.println("getHand");
        Deck instance = new Deck();
        LinkedList<String> expResult = null;
        LinkedList<String> result = instance.getHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHand method, of class Deck.
     */
    
    public void testSetHand() {
        System.out.println("setHand");
        LinkedList<String> hand = null;
        Deck instance = new Deck();
        instance.setHand(hand);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
