package com.JunitTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JunitTest {
    Junit runner = new Junit();
    @Test
    void firstName(){
        boolean output = runner.firstName("Abhishek");
        assertEquals(true,output);
    }
    @Test
    void lastName(){
        boolean output = runner.lastName("Magdum");
        assertEquals(true,output);
    }
    @Test
    void validEmail(){
        boolean output = runner.validEmail("abhishek.magdum.07@gmail.com");
        assertEquals(true,output);
    }
}