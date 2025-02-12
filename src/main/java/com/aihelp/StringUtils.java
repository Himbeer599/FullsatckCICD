package com.aihelp;

public class StringUtils {
    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static boolean isPalindrome(String s) {
        return s.equals(reverseString(s));
    }
}
