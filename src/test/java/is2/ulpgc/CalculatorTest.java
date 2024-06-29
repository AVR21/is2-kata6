package is2.ulpgc;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testAdd(){
        assertEquals(5, calculator.add(2,3));
    }

    @Test
    public void testSub(){
        assertEquals(1, calculator.sub(3,2));
    }

    @Test
    public void testMult(){
        assertEquals(10, calculator.mult(2,5));
    }

    @Test
    public void testDiv(){
        assertEquals(4, calculator.div(8,2));
    }

}
