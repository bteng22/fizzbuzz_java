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

    @Test
    public void threeReturnsFizz() {
        assertEquals("Fizz", fizzBuzz.evaluate(3));
    }

    @Test
    public void fiveReturnsBuzz() {
        assertEquals("Buzz", fizzBuzz.evaluate(5));
    }

    @Test
    public void sixReturnsFizz() {
        assertEquals("Fizz", fizzBuzz.evaluate(6));
    }

    @Test
    public void tenReturnsBuzz() {
        assertEquals("Buzz", fizzBuzz.evaluate(10));
    }

    @Test
    public void fifteenReturnsFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.evaluate(15));
    }

    @Test
    public void thurtyReturnsFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.evaluate(30));
    }
}
