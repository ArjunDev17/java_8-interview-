package functionalinterface;

import data.Student;
import data.StudentaDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerEx {
    Predicate<Student>gradeLePredicate=student -> student.getGradeLevel()>=3;
    Predicate<Student >gpaLevelPredicate=student -> student.getGpa()>=3.9;

    BiConsumer<String, List<String>>studentListBiConsumer=(name,activities)-> System.out.println(name +" : "+activities);

    Consumer<Student>studentConsumer=student -> {
        if(gradeLePredicate.and(gpaLevelPredicate).test(student)){
            studentListBiConsumer.accept(student.getName(),student.getActivities());
        }
    };

    public void printNameAndActivities(){
        List<Student>studentList= StudentaDataBase.getAllStudent();
        studentList.forEach(studentConsumer);
    }
}


