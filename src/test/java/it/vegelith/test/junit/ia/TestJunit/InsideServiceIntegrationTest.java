package it.vegelith.test.junit.ia.TestJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import it.vegelith.test.junit.ia.service.InsideService;

@Disabled
@SpringBootTest
public class InsideServiceIntegrationTest {

    @Autowired
    private InsideService insideService;

    @Test
    public void testComplexMethod1_EvenPositive() {
        String result = insideService.complexMethod1(4);
        assertEquals("Even and Positive", result);
    }

    @Test
    public void testComplexMethod1_Positive() {
        String result = insideService.complexMethod1(7);
        assertEquals("Positive", result);
    }

    @Test
    public void testComplexMethod1_Negative() {
        String result = insideService.complexMethod1(-3);
        assertEquals("Negative", result);
    }

    @Test
    public void testComplexMethod1_Zero() {
        String result = insideService.complexMethod1(0);
        assertEquals("Zero", result);
    }

    @Test
    public void testComplexMethod2() {
        int[] numbers = {1, 2, 3};
        int result = insideService.complexMethod2(numbers);
        assertEquals(6, result);
    }

    @Test
    public void testComplexMethod3_Alphanumeric() {
        boolean result = insideService.complexMethod3("Abc123");
        assertTrue(result);
    }

    @Test
    public void testComplexMethod3_NonAlphanumeric() {
        boolean result = insideService.complexMethod3("Special@");
        assertTrue(!result);
    }

    @Test
    public void testComplexMethod4_True() {
        String result = insideService.complexMethod4(true, "Input");
        assertEquals("Condition is true: Input", result);
    }

    @Test
    public void testComplexMethod4_False() {
        String result = insideService.complexMethod4(false, "Input");
        assertEquals("Condition is false: Input", result);
    }

    @Test
    public void testComplexMethod5() {
        double result = insideService.complexMethod5(2.0);
        assertEquals(12.566, result, 0.001);
    }
}

