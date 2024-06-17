package functionalinterface;
import java.util.function.Function;
public class FunctionIntefaceEx {
    static Function<String,String>stringStringFunction=name->name.toUpperCase();
//    Function<String,String>stringStringFunction= String::toUpperCase;
    static Function<String,String>stringConcat=name->name.toUpperCase().concat(" ayodhya");

    public static void functionfeature(){
        System.out.println("name in capital :"+stringStringFunction.apply("ram ji"));
        System.out.println("use case of andThen :"+stringStringFunction.andThen(stringConcat).apply("ram ji"));
        System.out.println("use case of compose :"+stringStringFunction.compose(stringConcat).apply("ram ji"));
    }

}
