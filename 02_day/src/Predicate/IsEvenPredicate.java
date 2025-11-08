package Predicate;

import java.util.function.Predicate;

public class IsEvenPredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer){
        if(integer!=null){
            return integer%2==0;
        }
        return false;
    }
}
