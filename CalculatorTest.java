import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        this.calculator = new Calculator();
    }

    @Test
    public void addingForTest() {
        assertEquals(11.0f, calculator.Add(5.5f, 5.5f), 0.0001);
    }

    @Test
    public void SubtractionForTest() {
        assertEquals(4.5f, calculator.Subtract(10.0f, 5.5f), 0.0001);
    }

    @Test
    public void MultiplicationForTest() {
        assertEquals(19.68f, calculator.Multiply(8.2f, 2.4f), 0.0001);
    }

    @Test
    public void DivideForTest() {
        assertEquals(4.5f, calculator.Divide(40.05f, 8.9f), 0.0001);
    }
}
