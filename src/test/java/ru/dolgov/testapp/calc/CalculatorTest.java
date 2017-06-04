package ru.dolgov.testapp.calc;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author M. Dolgov
 *         03.06.2017.
 */
public class CalculatorTest {

    @Test
    public void testAdd() {
        Assert.assertEquals("Ответ: 0", Calculator.commandParser("add 0 0 0"));
    }

    @Test
    public void testAddWithWrongParameters() {
        Assert.assertEquals("Неверные входные параметры", Calculator.commandParser("add 2"));
    }

    @Test
    public void testMull() {
        Assert.assertEquals("Ответ: 6", Calculator.commandParser("mul 1 2 3"));
    }

    @Test
    public void testMulWithWrongParameters() {
        Assert.assertEquals("Неверные входные параметры", Calculator.commandParser("mul 1"));
    }

    @Test
    public void testMullAndAdd() {
        Assert.assertEquals("Ответ: 18", Calculator.commandParser("mulAndAdd 3 4 6"));
    }

    @Test
    public void testMulAndAddWithWrongParameters() {
        Assert.assertEquals("Неверные входные параметры", Calculator.commandParser("mulAndAdd 3"));
    }
}
