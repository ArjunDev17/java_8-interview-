package com.stream.learning;

public class EvenNumber {

    public static void main(String[] args) {
        int[] numbers = {11, 2, 33, 4, 22, 24, 5, 7, 18, 80};

        for (int x : numbers) {
            if (x % 2 == 0) {
                System.out.println("Even number: " + x);
            } else {
                System.out.println("Odd number: " + x);
            }
        }
    }
}
