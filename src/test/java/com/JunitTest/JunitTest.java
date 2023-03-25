package com.JunitTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class JunitTest {
    Junit runner = new Junit();

    @Test
    void firstName() {
        boolean output = runner.firstName("Abhishek");
        assertEquals(true, output);
    }

    @Test
    void lastName() {
        boolean output = runner.lastName("Magdum");
        assertEquals(true, output);
    }

    @Test
    void validEmail() {
        boolean output = runner.validEmail("abhishek.magdum.07@gmail.com");
        assertEquals(true, output);
    }

    @Test
    void phoneNumber() {
        boolean output = runner.phoneNumber("+91 7066987376");
        assertEquals(true, output);
    }

    @Test
    void password() {
        boolean output = runner.password("Abhi@1234");
        assertEquals(true, output);
    }

    @ParameterizedTest
    @ValueSource(strings = {"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net",
                                  "abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc+100@gmail.com"})
    public void emails(String emails) {
        boolean output = runner.validEmail(emails);
        assertEquals(true, output);
    }
}



