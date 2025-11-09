package Function;

import java.util.function.Function;

public class NewSchoolApproach {

    // Function that returns length of a string, or 0 if null
    Function<String, Integer> stringIntegerFunction = str ->
            str == null ? 0 : str.length();

    public void lengthIs() {
        int result = stringIntegerFunction.apply("CodeNeeTi");
        System.out.println(result);
    }

    // Optional: make it more flexible
    public int lengthOf(String input) {
        return stringIntegerFunction.apply(input);
    }

    public static void main(String[] args) {
        NewSchoolApproach obj = new NewSchoolApproach();
        obj.lengthIs(); // prints 8
        System.out.println(obj.lengthOf("Java")); // prints 4
    }
}
