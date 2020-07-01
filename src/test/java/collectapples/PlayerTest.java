/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectapples;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Marcel Krepinsky <marcel@mkrepinsky.de>
 */
public class PlayerTest {
    
    Player player;
    Player playerD;
    
    public PlayerTest() {
    }
    
    @BeforeEach
    public void setUp() {
        player = new Player();
        playerD = new Player('d');
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getScore method, of class Player.
     */
    @Test
    public void testScore() {
        assertEquals(0, player.getScore(), "Initial Score was not 0");
        player.increaseScore();
        assertEquals(1, player.getScore(), "Increasing by one did not return correct result");
        player.increaseScore(7);
        assertEquals(8, player.getScore(), "Increasing by seven did not return correct result");
        player.increaseScore(-1);
        assertEquals(8, player.getScore(), "Negative Increase should not be possible");
    }

    /**
     * Test of increaseScore method, of class Player.
     */
    @Test
    public void testCorrectSymbol() {
        assertEquals('@', player.getSymbol(), "Player Symbol did not get initialized with '@'");
        assertEquals('d', playerD.getSymbol(), "Custom Player symbol was not saved or returned properly");
    }
    
}
