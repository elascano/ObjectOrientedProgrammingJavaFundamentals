/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import ec.edu.espe.oop_fundamentals.utils.Tax;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author edisonlascano
 */
public class TaxesTest {
    
    public TaxesTest() {
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
     * Test of computeIva method, of class Tax.
     */
    @Test
    public void testComputeIva() {
        System.out.println("computeIva");
        float base = 1.0F;
        float expResult = 112F;
        float actResult = Math.round(Tax.computeIva(base)*100);
        assertEquals(expResult, actResult, 0.0);
    }
    
}
