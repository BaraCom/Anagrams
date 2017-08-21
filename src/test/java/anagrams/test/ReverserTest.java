package anagrams.test;

import com.bkolomiets.anagrams.Reverser;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverserTest {
    private final Reverser reverser = new Reverser();

    @Test
    public void reverseLineTest() {
        String expected = "cba123 jk o8";
        String actual = reverser.reverseLine("abc123 kj o8");

        assertEquals(expected, actual);
    }

    @Test
    public void reverseWordTest() {
        String expectedResult = "cba123";
        String actualResult = reverser.reverseWord("abc123");

        assertEquals(expectedResult, actualResult);
    }
}
