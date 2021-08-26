package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    private UserValidator userValidator = new UserValidator();

    @Test
    public void shouldReturnUserName() {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._-]{3,}$");
        Matcher matcher = pattern.matcher("");

        assertTrue(matcher.find());
    }

    @Test
    public void shouldReturnValidEmail() {
        Pattern pattern = Pattern.compile("^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$");
        Matcher matcher = pattern.matcher("matt.kutelek@kociemchy.com");

        assertTrue(matcher.find());
    }
}