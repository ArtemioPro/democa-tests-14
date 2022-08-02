package com.demoqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.lang.module.Configuration;

public class ExampleJUni5Test {

    @Test
    void FirstTest(){
        Assertions.assertTrue(3>2);
    }
}
