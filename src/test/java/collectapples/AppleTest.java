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
public class AppleTest {
    
    Apple apple;
    Apple appleD;
    
    public AppleTest() {
    }
    
    @BeforeEach
    public void setUp() {
        apple = new Apple();
        appleD = new Apple('d');
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testCorrectSymbol() {
        assertEquals('o', apple.getSymbol(), "Apple Symbol did not get initialized with '@'");
        assertEquals('d', appleD.getSymbol(), "Custom Apple symbol was not saved or returned properly");
    }
    
}
