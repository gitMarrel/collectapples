/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectapples;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Marcel Krepinsky <marcel@mkrepinsky.de>
 */
public class GameObjectTest {
    
    GameObject go;
    
    public GameObjectTest() {
    }
    
    @BeforeEach
    public void setUp() {
        go = new GameObject();
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSymbol() {
        assertEquals(0, go.getSymbol(), "Symbol should not be initialized with avalue different to 0");
        go.setSymbol('q');
        assertEquals('q', go.getSymbol(), "Symbol was not set or returned properly");
    }

    /**
     * Test of toString method, of class GameObject.
     */
    @Test
    public void testToString() {
        go.setSymbol('q');
        assertEquals("q", go.toString(), "String-Conversion did not return proper result");
    }
    
}
