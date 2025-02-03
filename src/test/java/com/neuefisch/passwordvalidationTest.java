package com.neuefisch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passwordvalidationTest {

    @Test
    void expectedTrue_WhenLengthIsOver8_Test() {
        String password = "12345678";
        boolean expected = true;
        boolean actual = passwordvalidation.isValidLength(password);
        assertEquals(expected,actual);
    }

    @Test
    void expectedTrue_WhenContainsDigits_Test() {
        String password = "12345hhh";
        boolean expected = true;
        boolean actual = passwordvalidation.containsDigits(password);
        assertEquals(expected,actual);
    }

    @Test
    void expectedTrue_WhenContainsUpperAndLower_Test() {
        String password = "12ZA45hhh";
        boolean expected = true;
        boolean actual = passwordvalidation.containsUpperAndLowerCase(password);
        assertEquals(expected,actual);
    }

    @Test
    void expectedTrue_WhenPwdIsWeak_Test() {
        String password = "Aa345678";
        assertTrue(passwordvalidation.isWeakPassword(password));
    }

    @Test
    void expectedTrue_WhenContiansSpecial_Test() {
        String password = "12ZA45h*!h";
        assertTrue(passwordvalidation.containsSpecialCharacter(password));
    }
}