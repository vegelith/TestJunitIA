package it.vegelith.test.junit.ia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyClientService {

    private final MySpringService mySpringService;

    @Autowired
    public MyClientService(MySpringService mySpringService) {
        this.mySpringService = mySpringService;
    }

    // Method 1: Get a random number using MySpringService
    public int getRandomNumber() {
        return mySpringService.getRandomNumber();
    }

    // Method 2: Concatenate two strings using MySpringService
    public String concatenateStrings(String str1, String str2) {
        return mySpringService.concatenateStrings(str1, str2);
    }

    // Method 3: Check if a number is even using MySpringService
    public boolean isEven(int number) {
        return mySpringService.isEven(number);
    }

    // Method 4: Get the length of a string using MySpringService
    public int getStringLength(String input) {
        return mySpringService.getStringLength(input);
    }

    // Method 5: Reverse a string using MySpringService
    public String reverseString(String input) {
        return mySpringService.reverseString(input);
    }
}

