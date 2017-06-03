package ru.dolgov.testapp.calc;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author M. Dolgov
 *         03.06.2017.
 */
@RunWith(Parameterized.class)
public class CalculatorTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, 0, 0, 0},
                {1, 2, 3, 6},
                {10, 20, 30, 60},
                
        })
    }

    public void test
}
