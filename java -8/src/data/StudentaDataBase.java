package data;

import java.util.Arrays;
import java.util.List;

public class StudentaDataBase {

    public static List<Student> getAllStudent(){
        Student student1=new Student("Kabbu",1,9,"male", Arrays.asList("swiming","basketball"));
        Student student2 = new Student("AAru", 2, 10, "female", Arrays.asList("reading", "painting"));

        // Student 3
        Student student3 = new Student("shiv", 3, 9, "male", Arrays.asList("football", "cricket"));

        // Student 4
        Student student4 = new Student("rupa", 4, 10, "female", Arrays.asList("dancing", "singing"));

        // Student 5
        Student student5 = new Student("dev", 5, 8, "male", Arrays.asList("chess", "coding"));

        List<Student>students=Arrays.asList(student1,student2,student3,student4,student5);
        return students;
    }
}
