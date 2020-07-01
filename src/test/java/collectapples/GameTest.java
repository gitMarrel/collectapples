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
public class GameTest {

    Game game1;
    Game game2;

    public GameTest() {
    }

    @BeforeEach
    public void setUp() {
        game1 = new Game(5, 6);
        game2 = new Game(7, 7);
    }

    @AfterEach
    public void tearDown() {
    }

    /*@Test
    public void testPlaceObjectRandomly() {
        System.out.println("placeObjectRandomly");
        GameObject obj = null;
        Game instance = null;
        instance.placeObjectRandomly(obj);
        // TODO review the generated test code and remove the default call to fail.W
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPlayerPos() {
        System.out.println("getPlayerPos");
        Game instance = null;
        int[] expResult = null;
        int[] result = instance.getPlayerPos();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    @Test
    public void testGetGameWidth() {
        assertEquals(5, game1.getGameWidth(), "Game did return false width");
        assertEquals(7, game2.getGameWidth(), "Game did return false width");
    }

    @Test
    public void testGetGameHeight() {
        assertEquals(6, game1.getGameHeight(), "Game did return false height");
        assertEquals(7, game2.getGameHeight(), "Game did return false height");
    }

    @Test
    public void testMovePlayerLeft() {
        int[] pos = game2.getPlayerPos();
        game2.movePlayer(Game.DIRECTIONS.LEFT);
        int[] pos2 = game2.getPlayerPos();
        assertEquals(pos[0] - 1, pos2[0], "Left-Movement returned wrong result");
    }
    
    @Test
    public void testMovePlayerRight() {
        int[] pos = game2.getPlayerPos();
        game2.movePlayer(Game.DIRECTIONS.RIGHT);
        int[] pos2 = game2.getPlayerPos();
        assertEquals(pos[0] + 1, pos2[0], "Right-Movement returned wrong result");
    }
    
    @Test
    public void testMovePlayerUp() {
        int[] pos = game2.getPlayerPos();
        game2.movePlayer(Game.DIRECTIONS.UP);
        int[] pos2 = game2.getPlayerPos();
        assertEquals(pos[1] - 1, pos2[1], "Up-Movement returned wrong result");
    }
    
    @Test
    public void testMovePlayerDown() {
        int[] pos = game2.getPlayerPos();
        game2.movePlayer(Game.DIRECTIONS.DOWN);
        int[] pos2 = game2.getPlayerPos();
        assertEquals(pos[1] + 1, pos2[1], "Down-Movement returned wrong result");
    }
}
