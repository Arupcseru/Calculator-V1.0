package com.example.calculatorv10;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class CalculationTest {
    @Test
    public void checkAdd() throws Exception{
        assertEquals("4", Calculation.add("2.0","2.0"));
        assertEquals("9", Calculation.add("7.0","2.0"));
        assertEquals("4.80", Calculation.add("2.5","2.3"));
    }

    @Test
    public void checkSub() throws Exception{
        assertEquals("0", Calculation.subtract("2.0","2.0"));
        assertEquals("5", Calculation.subtract("7","2"));
        assertEquals("0.20", Calculation.subtract("2.5","2.3"));
    }
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
}