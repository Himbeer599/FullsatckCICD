package com.neuefisch;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class passwordvalidation {
    private static final Set<String> WeakPasswords = new HashSet<>();
    static {
        WeakPasswords.add("welcome");
        WeakPasswords.add("6666");
        WeakPasswords.add("hello");
        WeakPasswords.add("admin");
        WeakPasswords.add("123456");
        WeakPasswords.add("Password1");
        WeakPasswords.add("Aa345678");
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your password: ");
        String password = scanner.nextLine();
        scanner.close();
        if(!isValidLength(password)) {
            System.out.println("Password must be at least 8 characters");
        }else if(!containsDigits(password)) {
            System.out.println("Password must contain digitis");
        }else if (!containsUpperAndLowerCase(password)) {
            System.out.println("Password must contain upper and lower");
        }else if (isWeakPassword(password)) {
            System.out.println("Password is too common and easily guessable. Choose a stronger one.");
        }else{
            System.out.println("Password is valid");
        }
    }

    public static boolean isValidLength(String password){
        return password.length() >= 8;
    }

    public static boolean containsDigits(String password){
//        for( char c : password.toCharArray()){
//            if(Character.isDigit(c)){
//                return true;
//            }
//        }
//        return false;
        return password.matches(".*\\d.*");
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

    public static boolean isWeakPassword(String password){
        return WeakPasswords.contains(password) || WeakPasswords.contains(password.toLowerCase());
    }

    public static boolean containsSpecialCharacter( String password){
        return password.matches(".*[^a-zA-Z0-9].*");
    }

}