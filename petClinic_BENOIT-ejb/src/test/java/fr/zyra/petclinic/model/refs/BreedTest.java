/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.zyra.petclinic.model.refs;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author mickael
 */
public class BreedTest {

    public BreedTest() {
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
     * Test of values method, of class Breed.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Breed[] expResult = new Breed[]{Breed.DOG, Breed.CAT, Breed.RABBIT, Breed.HAMSTER, Breed.REPTILE, Breed.OTHER};
        Breed[] result = Breed.values();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of valueOf method, of class Breed.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "CAT";
        Breed expResult = Breed.CAT;
        Breed result = Breed.valueOf(name);
        assertEquals(expResult, result);
    }

}
