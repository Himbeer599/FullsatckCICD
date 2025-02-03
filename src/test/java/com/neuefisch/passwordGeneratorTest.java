package com.neuefisch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passwordGeneratorTest {

    @Test
    void generatePassword() {
        String password = passwordGenerator.generatePassword();
        assertTrue(passwordvalidation.isValidLength(password));
        assertTrue(passwordvalidation.containsDigits(password));
        assertTrue(passwordvalidation.containsUpperAndLowerCase(password));
        assertFalse(passwordvalidation.containsSpecialCharacter(password));
        assertFalse(passwordvalidation.isWeakPassword(password));
    }
}