package com.aihelp;

import java.util.ArrayList;
import java.util.List;

public class Generator {

    // Method to generate the first n prime numbers
    public static List<Integer> generatePrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        if (n <= 0) return primes;

        int num = 2; // Start from the first prime number
        while (primes.size() < n) {
            if (isPrime(num)) {
                primes.add(num);
            }
            num++;
        }
        return primes;
    }

    // Helper method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
