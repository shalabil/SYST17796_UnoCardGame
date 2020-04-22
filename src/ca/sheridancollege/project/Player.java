/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author dancye, 2018
 */
public class Player 
{
    private String playerID; //the unique ID for this player
    List<Card> hand;
    
    /**
     * A constructor that allows you to set the player's unique ID
     * @param name the unique ID to assign to this player.
     */
    
    
    public Player(String name)
    {
        playerID= name;
    }



    public Player() {
        this.hand = new ArrayList<Card>();
    }

    public List<Card> getHandOfCards() {
        return hand;
    }

    /**
     * @return the playerID
     */
    public String getPlayerID() 
    {
        return playerID;
    }
    /**
     * A method to check that the palyerId length is 3 letters or more
     * @param name
     * @return 
     */
     public static boolean checkId(String name){
        if (name.length() >= 3) {
            return true;
        }
        return false;
    }
      /**
     * A method that check if the password does not have any special character
     * @param pass
     * @return 
     */

    public static boolean checkChar(String name) {
        for (int i = 0; i < name.length(); i++) {
            int ch = name.charAt(i);
            if (!Character.isLetterOrDigit(ch))
            return true;
        }
        return false;
    }
     

    /**
     * Ensure that the playerID is unique
     * @param givenID the playerID to set
     */
    public void setPlayerID(String givenID) 
    {
        playerID = givenID;
    }
    
  @Override
    public String toString() {
        return "Player{" +
                "hand=" + hand +
                '}';
    }
    
}
