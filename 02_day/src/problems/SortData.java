package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
*
*
* */
public class SortData {
//    int []arr={};
//    List<Integer> arr=new ArrayList<>();

    public static boolean printEve(int num){
        return num % 2 == 0;
    }
static void main() {
    List<Integer> arr2= Arrays.asList(11,4,22,5,6,9);
    arr2.stream().sorted().forEach(System.out::println);
    System.out.println("-----------------------------------");

    arr2.stream().filter(a->a%2==0).forEach(System.out::println);
    System.out.println("-----------------------------------");
    arr2.stream().filter(SortData::printEve).forEach(System.out::println);
    System.out.println("-----------------------------------");
    List<Integer> sortedList = arr2.stream()
            .sorted(Comparator.comparing((Integer a) -> a).reversed()) // sorting in descending order
            .collect(Collectors.toList()); // collecting the sorted result

    System.out.println("-----------------------------------");

    System.out.println(sortedList);

}


}
