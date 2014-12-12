import FizzBuzz.FizzBuzz;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by brandonteng on 12/11/14.
 */
public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void oneReturnsOne() {
        assertEquals("1", fizzBuzz.evaluate(1));
    }

    @Test
    public void twoReturnsTwo() {
        assertEquals("2", fizzBuzz.evaluate(2));
    }
}
