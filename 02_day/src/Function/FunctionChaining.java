package Function;

import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args) {

        Function<String, Integer> getLength = str -> str.length();
        Function<Integer, Integer> square = num -> num * num;

        // andThen: first getLength, then square
        Function<String, Integer> lengthSquared = getLength.andThen(square);
        System.out.println(lengthSquared.apply("CodeNeeTi")); // (8)^2 = 64

        // compose: first square, then add prefix
        Function<String, Integer> lengthPlusOne = getLength.andThen(num -> num + 1);
        System.out.println(lengthPlusOne.apply("Java")); // (4) + 1 = 5
    }
}
