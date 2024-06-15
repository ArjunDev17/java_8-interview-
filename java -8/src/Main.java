import functionalinterface.ConsumerFuncInterface;
import functionalinterface.PredicateFunctionalInterface;
import lambdas.ComparatorLambdaEx;
import lambdas.LambdaRunnableEx;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        System.out.println("welcome here !!! learn Java 8");
        runLambdaEx();
        runFunctionalInterfaces();
    }

    public static void runLambdaEx() {
//      LambdaRunnableEx.tradionalApproch();
//        ComparatorLambdaEx.priorJava8();
//        ComparatorLambdaEx.afterjava8();

    }

    public static void runFunctionalInterfaces() {
//        ConsumerFuncInterface.afterJava8();
//        ConsumerFuncInterface.andthenMethod();
//        ConsumerFuncInterface.forEach();
//        ConsumerFuncInterface.printStudentName();
//        ConsumerFuncInterface.printNameAndActivities();
          ConsumerFuncInterface.printNameAndActivitiesFilterBasedOnGrade();
//        PredicateFunctionalInterface.afterJava8();
//        PredicateFunctionalInterface.checkEvenOdd();

    }
}