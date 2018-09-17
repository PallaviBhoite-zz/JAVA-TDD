import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.time.format.TextStyle;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldReturn1for1() {
        assertEquals("1", fizzBuzz.process(1));
    }

    @Test
    public void shouldReturnFizzFor3() {
        assertEquals("fizz", fizzBuzz.process(3));
    }

    @Test
    public void shouldReturnBuzzFor5() {
        assertEquals("buzz", fizzBuzz.process(5));
    }

    @Test
    public void shouldReturnFizzFor6() {
        assertEquals("fizz", fizzBuzz.process(6));
    }

    @Test
    public void shouldReturnBuzzFor10() {
        assertEquals("buzz", fizzBuzz.process(10));
    }

    @Test
    public void shouldReturnFizzBuzzFor15() {
        assertEquals("fizzbuzz", fizzBuzz.process(15));
    }

    @Test
    public void shouldReturnFizzForMinus3() {
        assertEquals("fizz", fizzBuzz.process(-3));
    }
}