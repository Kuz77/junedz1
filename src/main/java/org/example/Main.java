package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        double avg = numbers.stream()
                .filter(number -> number%2==0)
                .mapToInt(number -> number)
                .average()
                .orElse(0);
        System.out.println(avg);

    }
}