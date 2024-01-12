package it.vegelith.test.junit.ia.TestJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import it.vegelith.test.junit.ia.service.MainService;

@Disabled
@SpringBootTest
public class MainServiceIntegrationTest {

    @Autowired
    private MainService mainService;

    @Test
    public void testProcessString_ValidInput() {
        String result = mainService.processString("ValidInput");
        assertEquals("Valid String", result);
    }

    @Test
    public void testProcessString_InvalidInput() {
        String result = mainService.processString("InvalidInput");
        assertEquals("Valid String", result);
    }

    @Test
    public void testCalculateSumOfNumbers() {
        int[] numbers = {1, 2, 3};
        int result = mainService.calculateSumOfNumbers(numbers);
        assertEquals(12, result);
    }

    @Test
    public void testCheckEvenOrOdd_Even() {
        boolean result = mainService.checkEvenOrOdd(6);
        assertTrue(result);
    }

    @Test
    public void testCheckEvenOrOdd_Odd() {
        boolean result = mainService.checkEvenOrOdd(7);
        assertTrue(!result);
    }

    @Test
    public void testPerformConditionalOperation_True() {
        String result = mainService.performConditionalOperation(true, "Input");
        assertEquals("Condition is true: Input", result);
    }

    @Test
    public void testPerformConditionalOperation_False() {
        String result = mainService.performConditionalOperation(false, "Input");
        assertEquals("Condition is false: Input", result);
    }

    @Test
    public void testCalculateCircleArea() {
        double result = mainService.calculateCircleArea(5.0);
        assertEquals(88.53981633974483, result, 0.01);
    }

    @Test
    public void testProcessStringAndNumber_ValidInput() {
        String result = mainService.processStringAndNumber("ValidInput", 8);
        assertEquals("Valid String | Even and Positive", result);
    }

    @Test
    public void testProcessStringAndNumber_InvalidInput() {
        String result = mainService.processStringAndNumber("InvalidInput", 7);
        assertEquals("Valid String | Positive", result);
    }

    @Test
    public void testCheckStringLengthAndEven_True() {
        boolean result = mainService.checkStringLengthAndEven("Testing", 4);
        assertTrue(!result);
    }

    @Test
    public void testCheckStringLengthAndEven_False() {
        boolean result = mainService.checkStringLengthAndEven("Test", 3);
        assertTrue(!result);
    }
}

