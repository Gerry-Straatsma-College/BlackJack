/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

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
public class BlackJackTest {
    
    public BlackJackTest() {
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
     * Test of getPlayers method, of class BlackJack.
     */
    
    public void testGetPlayers() {
        System.out.println("getPlayers");
        BlackJack.getPlayers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deal method, of class BlackJack.
     */
    
    public void testDeal() {
        System.out.println("deal");
        BlackJack.deal();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of round method, of class BlackJack.
     */
    
    public void testRound() {
        System.out.println("round");
        BlackJack.round();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHandValue method, of class BlackJack.
     */
    
    public void testGetHandValue() {
        System.out.println("getHandValue");
        Player player = null;
        int expResult = 0;
        int result = BlackJack.getHandValue(player);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isBust method, of class BlackJack.
     */
    @Test
    public void testIsBustBad() {
        System.out.println("isBust bad test code.");
        Player player = null;
        boolean expResult = false;
        boolean result = BlackJack.isBust(player);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of printHand method, of class BlackJack.
     */
    @Test
    public void testPrintHandBad() {
        System.out.println("printHand bad test code.");
        Player player = null;
        String expResult = "";
        String result = BlackJack.printHand(player);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class BlackJack.
     */
    
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        BlackJack.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
