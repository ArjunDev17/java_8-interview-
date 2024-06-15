package functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//predicate is a boolean interface function
public class PredicateFunctionalInterface {
    public static void afterJava8(){
        Predicate<Integer> predicate=x->x>100;
        System.out.println("number is grater then 100 :"+predicate.test(1000));
    }
    public static void checkEvenOdd(){
        List<Integer>list= Arrays.asList(1,2,3,4,5);
        Predicate<Integer>isEven=num->num%2==0;
        for (Integer i:list){
            if (isEven.test(i)){
                System.out.println("even number is :"+i);
            }else{
                System.out.println("odd number is :"+i);
            }
        }
    }
}
