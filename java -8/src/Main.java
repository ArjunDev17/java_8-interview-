import functionalinterface.BiConsumerInterfaceEx;
import functionalinterface.ConsumerFuncInterface;
import functionalinterface.PredicateFunctionalInterface;
import lambdas.ComparatorLambdaEx;
import lambdas.LambdaRunnableEx;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        System.out.println("welcome here !!! learn Java 8");
        runLambdaEx();
        runConsumerFunctionalInterfaces();
        runBiConsumerFunctionalInterfaces();
        runPredicateFunctionalInterface();
    }

    public static void runLambdaEx() {
//      LambdaRunnableEx.tradionalApproch();
//        ComparatorLambdaEx.priorJava8();
//        ComparatorLambdaEx.afterjava8();

    }
    public static void runConsumerFunctionalInterfaces() {
//        ConsumerFuncInterface.afterJava8();
//        ConsumerFuncInterface.andthenMethod();
//        ConsumerFuncInterface.forEach();
//        ConsumerFuncInterface.printStudentName();
//        ConsumerFuncInterface.printNameAndActivities();
//        ConsumerFuncInterface.printNameAndActivitiesFilterBasedOnGrade();
//

    }
    public static void  runBiConsumerFunctionalInterfaces(){
//        BiConsumerInterfaceEx.intro();
//        BiConsumerInterfaceEx.biConsumerMore();
//        BiConsumerInterfaceEx.NameAndActivityByUsingBiConsumerInterfaceEx2();
    }
    public static void runPredicateFunctionalInterface(){
//        PredicateFunctionalInterface.afterJava8();
//        PredicateFunctionalInterface.checkEvenOdd();
//        PredicateFunctionalInterface.checkAndOr();
        PredicateFunctionalInterface.additionalMethod();
    }
}