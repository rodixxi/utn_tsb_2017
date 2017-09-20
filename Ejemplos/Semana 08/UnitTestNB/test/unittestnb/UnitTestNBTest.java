/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittestnb;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author federico
 */
public class UnitTestNBTest {
    
    public UnitTestNBTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("BeforeClass");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("AfterClass");
    }
    
    @Before
    public void setUp() {
        System.out.println("Before");
    }
    
    @After
    public void tearDown() {
        System.out.println("After");
    }

    /**
     * Test of main method, of class UnitTestNB.
     */
    @Test(expected = NullPointerException.class)
    public void testMain() {
        System.out.println("TestMain");
        UnitTestNB nb = null;
        nb.toString();        
    }

    @Test(timeout = 100)
    public void testMain2() throws Exception {
        System.out.println("TestMain2");
        Thread.sleep(100);
    }

    
}
