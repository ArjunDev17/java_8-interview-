package functionalinterface;

import data.Student;
import data.StudentaDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentEx {
    static Function<List<Student>, Map<String,Double>>listMapFunction=(studentList -> {
      Map<String,Double>studentGradeMap=new HashMap<>();
      studentList.forEach(student -> {
          studentGradeMap.put(student.getName(),student.getGpa());
      });
      return  studentGradeMap;
    });
    public static void studentNameAndGPAByfilter(){
        System.out.println("data :"+ listMapFunction.apply(StudentaDataBase.getAllStudent()));
    }
}
