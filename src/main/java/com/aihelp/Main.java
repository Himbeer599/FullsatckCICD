package com.aihelp;

import static com.aihelp.Generator.generatePrimes;
import static com.aihelp.StringUtils.isPalindrome;
import static com.aihelp.StringUtils.reverseString;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverseString("Hello"));
        System.out.println(isPalindrome("Hello"));
        System.out.println(reverseString("anna"));
        System.out.println(isPalindrome("anna"));

        System.out.println(generatePrimes(10));
    }
}
