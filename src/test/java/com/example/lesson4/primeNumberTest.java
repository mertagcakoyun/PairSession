package com.example.lesson4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class primeNumberTest {

    @Test
    public void it_should_return_empty_list(){
        PrimeNumber primeNumber = new PrimeNumber();

        List<Integer> resultList = primeNumber.isprime(3);

        assertEquals(,resultList);

    }

}