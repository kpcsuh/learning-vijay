package com.example.learning_vijay.module1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsLearning {


    public static void main(String[] args) {
        // Example of using streams to filter and collect data
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Andrew", "Ana");

        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Filtered Names: " + filteredNames);

        // Example of using streams to perform a calculation
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of Numbers: " + sum);
    }
}
