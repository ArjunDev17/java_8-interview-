package problems;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccurrence {

    public static void main(String[] args) {

        // Input string
        String input = "AAADGJUSSSD";

        /*
         * Steps:
         * 1. Convert the string into a stream of characters.
         * 2. Collect the result into a Map< Character, Long > where:
         *      - Key = character
         *      - Value = count of that character
         */
        Map<Character, Long> frequencyMap = input
                .chars()                                     // Step 1: Convert to IntStream of character ASCII values
                .mapToObj(c -> (char) c)                     // Step 2: Convert ASCII → Character object
                .collect(Collectors.groupingBy(              // Step 3: group by character
                        Function.identity(),                 // group by the character itself as key
                        Collectors.counting()                // count how many times it appears
                ));

        // Print each character and its count
        frequencyMap.forEach((character, count) -> {
            System.out.println(character + " → " + count);
        });
    }
}
