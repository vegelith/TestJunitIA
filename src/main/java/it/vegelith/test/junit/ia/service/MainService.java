package it.vegelith.test.junit.ia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    private final InsideService insideService;

    @Autowired
    public MainService(InsideService insideService) {
        this.insideService = insideService;
    }

    public String processString(String input) {
        // Complex logic involving InsideService's method
        return insideService.complexMethod3(input) ? "Valid String" : "Invalid String";
    }

    public int calculateSumOfNumbers(int[] numbers) {
        // Complex logic involving InsideService's method
        int sum = insideService.complexMethod2(numbers);
        return sum * 2;
    }

    public boolean checkEvenOrOdd(int number) {
        // Complex logic involving InsideService's method
        String result = insideService.complexMethod1(number);
        return result.equals("Even and Positive") || result.equals("Even");
    }

    public String performConditionalOperation(boolean condition, String input) {
        // Complex logic involving InsideService's method
        return insideService.complexMethod4(condition, input);
    }

    public double calculateCircleArea(double radius) {
        // Complex logic involving InsideService's method
        double area = insideService.complexMethod5(radius);
        return area + 10;
    }

    public String processStringAndNumber(String str, int number) {
        // Complex logic involving InsideService's methods
        String strResult = insideService.complexMethod3(str) ? "Valid String" : "Invalid String";
        String numResult = insideService.complexMethod1(number);
        return strResult + " | " + numResult;
    }

    public boolean checkStringLengthAndEven(String str, int number) {
        // Complex logic involving InsideService's methods
        int length = str.length();
        boolean isEven = insideService.complexMethod1(number).equals("Even");
        return length > 5 && isEven;
    }
}

