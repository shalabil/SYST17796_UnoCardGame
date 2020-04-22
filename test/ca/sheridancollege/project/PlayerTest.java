/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author leens
 */
public class PlayerTest {
    
    public PlayerTest() {
    }
    
   

    /**
     * Test of getHandOfCards method, of class Player.
     */
//    @Test
//    public void testGetHandOfCards() {
//        System.out.println("getHandOfCards");
//        Player instance = new Player();
//        List<Card> expResult = null;
//        List<Card> result = instance.getHandOfCards();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getPlayerID method, of class Player.
//     */
//    @Test
//    public void testGetPlayerID() {
//        System.out.println("getPlayerID");
//        Player instance = new Player();
//        String expResult = "";
//        String result = instance.getPlayerID();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

     /**
     * Test of checkLength method, of class Player. This test gives a
     * good input of , which should easily be long enough to be a
     * good length.
     */
    @Test
    public void testCheckIdGood() {
        System.out.println("checkIdGood");
        String name = "ali";
        boolean expResult = true;
        boolean result = Player.checkId(name);
        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

     /**
     * A test that gives the checkId() a bad password and expects a bad
     * result
     */
    @Test
     public void testCheckIdBad() {
        System.out.println("checkIdBad");
        String name = "";
        boolean expResult = false;
        boolean result = Player.checkId(name);
        assertEquals(expResult, result);

    }
     
     /**
     * A test that checks that when we give a userId of exactly length 8, we
     * see a pass. 
    @Test 
     
          public void testCheckIdBoundary() {
        System.out.println("checkIdBad");
        String name = "ali";
        boolean expResult = true;
        boolean result = Player.checkId(name);
        assertEquals(expResult, result);

    }
     
    /**
     Checks that the checkDigit() method will return true on a valid length
     * password
     */
    @Test
    public void testCheckCharGood() {
        System.out.println("checkChar");
        String name = "ali 1";
        boolean expResult = true;
        boolean result = Player.checkChar(name);
        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
     /**
      * A test that gives the checkDigit() a bad id
      * and expects a bad result
     */
    @Test
     public void testCheckCharBad() {
        System.out.println("checkChar");
        String name = "";
        boolean expResult = false;
        boolean result = Player.checkChar(name);
        assertEquals(expResult, result);
     } 
     
      /**
     * A method that checks that id contains at least one special
     * character
     */
    @Test
     public void testCheckCharBoundary() {
        System.out.println("checkChar");
        String name = "ali";
        boolean expResult = true;
        boolean result = Player.checkChar(name);
        assertEquals(expResult, result);
     }

    /**
     * Test of setPlayerID method, of class Player.
     */
    @Test
    public void testSetPlayerID() {
        System.out.println("setPlayerID");
        String givenID = "";
        Player instance = new Player();
        instance.setPlayerID(givenID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

 
    
}
