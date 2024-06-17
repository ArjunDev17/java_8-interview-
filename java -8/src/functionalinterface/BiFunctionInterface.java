package functionalinterface;

import data.Student;
import data.StudentaDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionInterface {
   static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>>biFunction=((studentList, studentPredicate) -> {
       Map<String,Double>studentGradeMap=new HashMap<>();
       studentList.forEach(student -> {
           if (studentPredicate.test(student)){
               studentGradeMap.put(student.getName(),student.getGpa());
           }
       });
       return studentGradeMap;
    });
    public static void printNameAndGPA(){
        System.out.println(biFunction.apply(StudentaDataBase.getAllStudent(),student -> student.getGpa()>3.9));
    }
}
