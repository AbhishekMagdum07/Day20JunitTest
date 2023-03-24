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
}