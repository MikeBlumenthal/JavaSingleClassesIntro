import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calc;

    @Before
    public void before(){
        calc = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(4, calc.add(2,2));
    }

    @Test
    public void canSubtract(){
        assertEquals(3, calc.subtract(7,4));
    }

    @Test
    public void canMultiply(){
        assertEquals(9, calc.multiply(3,3));
    }

    @Test
    public void canDivideWithIntegerResult(){
        assertEquals(4.0, calc.divide(8,2), 0.1);
    }

    @Test
    public void canDivideWithDecimalResult(){
        assertEquals(3.5, calc.divide(7,2), 0.1);
    }
}
