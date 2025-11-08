package Predicate;

import java.util.function.Predicate;

// Predicate to check if a number is positive
public class IsPositivePredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer number) {
        System.out.println("Testing if " + number + " is positive");
        return number > 0;
    }
}
