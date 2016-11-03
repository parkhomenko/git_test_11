package exceptions;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DividerTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    Divider divider;

    @Before
    public void tearUp() {
        divider = new Divider();
    }

    @Test (expected = ArithmeticException.class)
    public void divideTest() {
        divider.divide(5, 0);
    }

    @Test
    public void divideTestWithRule() {
        exception.expect(ArithmeticException.class);
        exception.expectMessage("/ by zero");

        divider.divide(5, 0);
    }
}
