package org.mavenInt.mavenIntegration;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mavenInt.mavenIntegration.App.Calculator;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(5.0, calculator.add(2.0, 3.0), 0.0);
    }

    @Test
    public void testSubtract() {
        assertEquals(1.0, calculator.subtract(3.0, 2.0), 0.0);
    }

    @Test
    public void testMultiply() {
        assertEquals(6.0, calculator.multiply(2.0, 3.0), 0.0);
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(6.0, 3.0), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(1.0, 0.0);
    }
}