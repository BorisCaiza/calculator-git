package ec.edu.epn.git.calculator;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class ICalculatorTest {

    @Test
    public void given_two_integers_when_addition_then_ok() {
        ICalculator c = Mockito.mock(ICalculator.class);

        Mockito.when(c.addition(2,3, 5)).thenReturn(10);

        assertEquals(10, c.addition(2,3, 5) );
    }
}