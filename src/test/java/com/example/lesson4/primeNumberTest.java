package com.example.lesson4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class primeNumberTest {

    @Test
    public void it_should_return_empty_list(){
        List<Integer> expected = new ArrayList<>();

        List<Integer> resultList = PrimeNumber.isPrime(1);

        assertEquals(expected,resultList);

    }

    @Test
    public void it_should_return_2_and_3_in_list_for_6(){
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(3);
        List<Integer> resultList = PrimeNumber.isPrime(6);

        assertEquals(expected,resultList);

    }

}