package com.sanifrey.test1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Formula2Test {

	private Formula formula;

    @Before
    public void setup() {
    	formula = new Formula(null);
    }

    @Test
    public void testGetMessage() {
    	assertEquals("39.0",formula.PFormula("60", "2.5", "8.4"));
    }

    @Test
    public void testGetMessage2() {
    	assertEquals("49.0",formula.PFormula("70", "3", "7"));
    }

}
