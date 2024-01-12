package it.vegelith.test.junit.ia.service;

import org.springframework.stereotype.Service;

@Service
public class MySpringService {

    // Method 1: Get a random number
    public int getRandomNumber() {
        return (int) (Math.random() * 100);
    }

    // Method 2: Concatenate two strings
    public String concatenateStrings(String str1, String str2) {
        return str1 + " " + str2;
    }

    // Method 3: Check if a number is even
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method 4: Get the length of a string
    public int getStringLength(String input) {
        return input.length();
    }

    // Method 5: Reverse a string
    public String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
}

