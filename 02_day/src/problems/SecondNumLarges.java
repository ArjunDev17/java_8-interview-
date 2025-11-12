package problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondNumLarges {
    static void main() {
        List<Integer> arr2= Arrays.asList(11,4,22,5,6,9);

       int val= arr2.stream().sorted(
               Comparator.reverseOrder()
       ).skip(1).findFirst().get();

        System.out.println(val);
    }
}
