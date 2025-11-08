package Predicate;

import java.util.function.Predicate;

public class PredicateWithLambda {
    public static void main(String[] args) {

        // 1️⃣ Create two simple predicates using lambda expressions
        Predicate<Integer> isEven = number -> number % 2 == 0;     // checks if even
        Predicate<Integer> isPositive = number -> number > 0;      // checks if positive

        // 2️⃣ Test the predicates with some numbers
        int num1 = 10;
        int num2 = -4;
        int num3 = 5;

        System.out.println("---- TESTING test() ----");
        System.out.println(num1 + " even? " + isEven.test(num1));
        System.out.println(num2 + " positive? " + isPositive.test(num2));

        // 3️⃣ Combine predicates using 'and' (both must be true)
        Predicate<Integer> evenAndPositive = isEven.and(isPositive);
        System.out.println("\n---- TESTING and() ----");
        System.out.println(num1 + " even and positive? " + evenAndPositive.test(num1)); // true
        System.out.println(num2 + " even and positive? " + evenAndPositive.test(num2)); // false
        System.out.println(num3 + " even and positive? " + evenAndPositive.test(num3)); // false

        // 4️⃣ Combine predicates using 'or' (either condition true)
        Predicate<Integer> evenOrPositive = isEven.or(isPositive);
        System.out.println("\n---- TESTING or() ----");
        System.out.println(num1 + " even or positive? " + evenOrPositive.test(num1));   // true
        System.out.println(num2 + " even or positive? " + evenOrPositive.test(num2));   // true
        System.out.println(num3 + " even or positive? " + evenOrPositive.test(num3));   // true

        // 5️⃣ Negate a predicate (reverse the result)
        Predicate<Integer> notEven = isEven.negate();
        System.out.println("\n---- TESTING negate() ----");
        System.out.println(num1 + " not even? " + notEven.test(num1)); // false
        System.out.println(num3 + " not even? " + notEven.test(num3)); // true
    }
}
