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
public class WallTest {
    
    Wall wall;
    Wall wallD;
    
    public WallTest() {
    }
    
    @BeforeEach
    public void setUp() {
        wall = new Wall();
        wallD = new Wall('d');
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testCorrectSymbol() {
        assertEquals('#', wall.getSymbol(), "Wall Symbol did not get initialized with '@'");
        assertEquals('d', wallD.getSymbol(), "Custom Wall symbol was not saved or returned properly");
    }
    
}
