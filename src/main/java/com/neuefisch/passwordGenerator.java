package com.neuefisch;

import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static com.neuefisch.passwordvalidation.containsSpecialCharacter;
import static com.neuefisch.passwordvalidation.isWeakPassword;

public class passwordGenerator {
    private static final String LowerCase = "abcdefghijklmnopqrstuvwxyz";
    private static final String UpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String Digits = "0123456789";

    private static final SecureRandom rnd = new SecureRandom();
    public static String generatePassword() {
        int passwordLength = 12;

        StringBuilder password = new StringBuilder();
        password.append(randomChar(LowerCase));
        password.append(randomChar(UpperCase));
        password.append(randomChar(Digits));

        String allChars = LowerCase+UpperCase+Digits;
        for(int i =password.length(); i <passwordLength; i++){
            password.append(randomChar(allChars));
        }

        String finalPassword = password.toString();
        if(containsSpecialCharacter(finalPassword)){
            return generatePassword();
        }
        if(isWeakPassword(finalPassword)){
            return generatePassword();
        }
        return finalPassword;
    }

    private static char randomChar(String c){
        return c.charAt(rnd.nextInt(c.length()));
    }

    public static void main(String[] args) {
        String securePassword = generatePassword();
        System.out.println("Generated password: " + securePassword);
    }



}