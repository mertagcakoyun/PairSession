package com.example.lesson4;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

    public static List<Integer> isPrime(int number) {
        ArrayList<Integer> result = new ArrayList<>();

        if (number < 2) {
            return result;
        }

        int i = 2;
        do {
            int remainder = number % i;

            if (remainder != 0) {
                i++;
            } else {
                result.add(i);
                number = number / i;
            }

        } while (number != 1);

        return result;
    }

}
