package functionalinterface;

import data.Student;
import data.StudentaDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.BiPredicate;

public class BiPredicateEx {
    static Predicate<Student> gradeLePredicate= student -> student.getGradeLevel()>=3;
    static Predicate<Student >gpaLevelPredicate=student -> student.getGpa()>=3.9;

    static BiPredicate<Integer,Double> biPredicate=(gradeLevel, gpaLevel)->gradeLevel>=3 &&gpaLevel>=3.9;

    static BiConsumer<String, List<String>> studentListBiConsumer=(name, activities)-> System.out.println(name +" : "+activities);

    static Consumer<Student> studentConsumer= student -> {
//        if(gradeLePredicate.and(gpaLevelPredicate).test(student)){
//            studentListBiConsumer.accept(student.getName(),student.getActivities());
//        }
        if (biPredicate.test(student.getGradeLevel(),student.getGpa())){
            studentListBiConsumer.accept(student.getName(),student.getActivities());
        }
    };

    public static void printNameAndActivities(){
        List<Student>studentList= StudentaDataBase.getAllStudent();
        studentList.forEach(studentConsumer);
    }
}
