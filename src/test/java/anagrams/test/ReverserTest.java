package anagrams.test;

import com.bkolomiets.anagrams.Reverser;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverserTest {

    @Test
    public void reverseLineTest() {

        Reverser reverser = new Reverser();

        String expectedResult = "cba123";
        String actualMethod = reverser.reverseLine("abc123");

        assertEquals("The test is failed!", expectedResult, actualMethod);
    }
}
