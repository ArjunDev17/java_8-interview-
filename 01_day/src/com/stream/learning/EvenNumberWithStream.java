package com.stream.learning;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EvenNumberWithStream {

    // Define a Predicate outside the main stream logic
    static Predicate<Integer> isEven = x -> x % 2 == 0;

    // Method to filter even numbers using the Predicate
    public static List<Integer> getEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(isEven) // using Predicate here
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        // Call the method that uses the Predicate
        List<Integer> evenNums = getEvenNumbers(nums);

        System.out.println("Even numbers: " + evenNums);
    }
}
