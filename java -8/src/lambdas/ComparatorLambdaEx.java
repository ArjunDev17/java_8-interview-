package lambdas;

import java.util.Comparator;

public class ComparatorLambdaEx {
//    Comparator
    public static void priorJava8(){
        Comparator<Integer> comparator=new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return integer.compareTo(t1);
//                0-->integer==t1,
//                1-->integer>t1
//                -1-->integer<t1
            }
        };
        System.out.println("Comparator traditional approach :"+comparator.compare(3,2));
    }
    public static void afterjava8(){

//        Comparator<Integer> comparator=(num1,num2)->num1.compareTo(num2);
        Comparator<Integer> comparator= Integer::compareTo;
        System.out.println("Comparator lambda way approach :"+comparator.compare(3,2));


    }
}
