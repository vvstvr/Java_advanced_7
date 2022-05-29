import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {


    @Test
    public void testAddition() {

        double res = Calculator.addition(3,7);
        assertFalse(res != 10);
    }

    @Test
    public void testSubtraction() {

        double res = Calculator.subtraction(3,7);
        assertTrue(res == -4);
    }

    @Test
    public void testMultiplication() {

        double res = Calculator.multiplication(3,7);
        assertEquals(res, 21);
    }

    @Test
    public void testDivision() throws Calculator.MyException {

        double res = Calculator.division(10,2);
        assertFalse(res != 5);
    }

    @Test
    public void testDivision2() throws Calculator.MyException {
        try {
            Calculator.division(10, 0);
        } catch (Exception e) {
            assertEquals("деление на ноль невозможно!", e.getMessage());
            return;
        }
    }


}
