package com.streammmm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> newNumbers = numbers.stream()
                .filter(number->number% 2 ==0)
                .map(number->number*2)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(newNumbers);

        int sum = newNumbers.stream()
                .reduce(0,Integer::sum);
        newNumbers.forEach(System.out::println);
        System.out.println("Sum of processed numbers: " +sum);
        System.out.println("Collected List: "+newNumbers);

    }
}
