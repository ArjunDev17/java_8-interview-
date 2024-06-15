package functionalinterface;

import java.util.function.BiConsumer;

public class BiConsumerInterfaceEx {
    public static void intro(){
        BiConsumer<String,String>biConsumer=(s, s2) -> {
            System.out.println("s :"+s+" s2 :"+s2);
        };
        biConsumer.accept("Ram","Ji");
    }
}
