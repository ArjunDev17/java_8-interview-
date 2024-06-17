package functionalinterface;

import data.Student;
import data.StudentaDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
class PredicateEx{
    static Predicate<Student>studentPredicate=student -> student.getGradeLevel()>=3;
    static Predicate<Student>getStudentPredicate=student -> student.getGpa()>3.5;
    public static void predicateStudentEx(){
        List<Student>studentList= StudentaDataBase.getAllStudent();
//        Predicate<Student>studentPredicate1=student->{
//            if (studentPredicate.test(student)){
//                System.out.println("student :"+student);
//            }
//            System.out.println();
//        }
        studentList.forEach(student -> {
            if (studentPredicate.test(student)){
                System.out.println("student :"+student);
            }
        });
    }

    public static void predicateStudentEx2(){
        List<Student>studentList= StudentaDataBase.getAllStudent();
//        Predicate<Student>studentPredicate1=student->{
//            if (studentPredicate.test(student)){
//                System.out.println("student :"+student);
//            }
//        };
        studentList.forEach(student -> {
            if (studentPredicate.test(student)){
                System.out.println("student :"+student);
            }
        });
    }
    public static void filterStudents(){
        List<Student>studentList=StudentaDataBase.getAllStudent();
        studentList.forEach(student->{
            if(studentPredicate.and(getStudentPredicate).test(student)){
                System.out.println(student);
        }
        });
    }

}
//predicate is a boolean interface function
public class PredicateFunctionalInterface {
    static Predicate<Integer>predicateEven=x->x%2==0;
    static Predicate<Integer>predicateOdd=y->y%2!=0;
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
    public static void checkAndOr(){
        System.out.println("And Operation result :"+predicateEven.and(predicateOdd).test(12));
        System.out.println("Or Operation result :"+predicateEven.or(predicateOdd).test(12));
        System.out.println("negation Operation result :"+predicateEven.and(predicateOdd).negate().test(12));

    }
    public static void additionalMethod(){
//        PredicateEx.predicateStudentEx();
        PredicateEx.filterStudents();
    }

}
