import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testAdd(){
        assertEquals(5, calculator.add(2,3));
    }
}
