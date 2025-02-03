package com.neuefisch;

import java.util.HashSet;
import java.util.Set;

public class passwordvalidation {
    private static final Set<String> CommonPasswords = new HashSet<>();
    static {
        CommonPasswords.add("welcome");
        CommonPasswords.add("6666");
        CommonPasswords.add("hello");
        CommonPasswords.add("admin");
        CommonPasswords.add("123456");
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public static boolean isValidLength(String password){
        return password.length() >= 8;
    }

    public static boolean containsDigits(String password){
        for( char c : password.toCharArray()){
            if(Character.isDigit(c)){
                return true;
            }
        }
        return false;
    }

    public static boolean containsUpperAndLowerCase(String password){
        boolean hasUpper = false;
        boolean hasLower = false;

        for( char c : password.toCharArray()){
            if(Character.isUpperCase(c)){
                hasUpper = true;
            }
            if(Character.isLowerCase(c)){
                hasLower = true;
            }
            if(hasUpper&&hasLower){
                return true;
            }
        }
        return false;
    }

    public static boolean isCommonPassword(String password){
        return CommonPasswords.contains(password.toLowerCase());
    }

}