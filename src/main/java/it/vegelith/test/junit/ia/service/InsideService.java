package it.vegelith.test.junit.ia.service;

import org.springframework.stereotype.Service;

@Service
public class InsideService {

    public String complexMethod1(int input) {
        if (input > 0 && input % 2 == 0) {
            return "Even and Positive";
        } else if (input > 0) {
            return "Positive";
        } else if (input < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    public int complexMethod2(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public boolean complexMethod3(String str) {
        return str.matches("[A-Za-z0-9]+");
    }

    public String complexMethod4(boolean condition, String input) {
        return condition ? "Condition is true: " + input : "Condition is false: " + input;
    }

    public double complexMethod5(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        return Math.PI * Math.pow(radius, 2);
    }
}

