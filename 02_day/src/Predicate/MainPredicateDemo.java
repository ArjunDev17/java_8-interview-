package Predicate;

import java.util.function.Predicate;

public class MainPredicateDemo {
     static void main(String[] args) {
        Predicate<Integer> isEven = new IsEvenPredicate();
        Predicate<Integer> isPositive = new IsPositivePredicate();

        int num1 = 10;
        int num2 = -4;
        int num3 = 5;

        System.out.println("---- TESTING test() ----");
        System.out.println(num1 + " even? " + isEven.test(num1));
        System.out.println(num2 + " positive? " + isPositive.test(num2));

        System.out.println("\n---- TESTING and() ----");
        Predicate<Integer> evenAndPositive = isEven.and(isPositive);
        System.out.println(num1 + " even and positive? " + evenAndPositive.test(num1));
        System.out.println(num2 + " even and positive? " + evenAndPositive.test(num2));
        System.out.println(num3 + " even and positive? " + evenAndPositive.test(num3));

        System.out.println("\n---- TESTING or() ----");
        Predicate<Integer> evenOrPositive = isEven.or(isPositive);
        System.out.println(num1 + " even or positive? " + evenOrPositive.test(num1));
        System.out.println(num2 + " even or positive? " + evenOrPositive.test(num2));
        System.out.println(num3 + " even or positive? " + evenOrPositive.test(num3));

        System.out.println("\n---- TESTING negate() ----");
        Predicate<Integer> notEven = isEven.negate();
        System.out.println(num1 + " not even? " + notEven.test(num1));
        System.out.println(num3 + " not even? " + notEven.test(num3));
    }
}
