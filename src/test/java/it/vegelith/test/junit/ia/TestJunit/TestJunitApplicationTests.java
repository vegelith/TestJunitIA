package it.vegelith.test.junit.ia.TestJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import it.vegelith.test.junit.ia.service.MyClientService;

@Disabled
@SpringBootTest
public class TestJunitApplicationTests {

    @Autowired
    private MyClientService myClientService;

    @Test
    public void testGetRandomNumber() {
        int randomNumber = myClientService.getRandomNumber();
        assertTrue(randomNumber >= 0 && randomNumber <= 100);
    }

    @Test
    public void testConcatenateStrings() {
        String result = myClientService.concatenateStrings("Hello", "World");
        assertEquals("Hello World", result);
    }

    @Test
    public void testIsEven() {
        assertTrue(myClientService.isEven(2));
        assertTrue(!myClientService.isEven(3));
        assertTrue(myClientService.isEven(0));
    }

    @Test
    public void testGetStringLength() {
        int length = myClientService.getStringLength("Hello");
        assertEquals(5, length);
    }

    @Test
    public void testReverseString() {
        String reversed = myClientService.reverseString("Hello World");
        assertEquals("dlroW olleH", reversed);
    }
}
