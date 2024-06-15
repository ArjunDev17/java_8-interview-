package functionalinterface;

import data.Student;
import data.StudentaDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//using anonymous class
class ConsumerDemo2 {
    public void tradionalyApprochc(){
        Consumer<String> consumer=new Consumer<String>() {
            @Override
            public void accept(String str) {
                System.out.println("data in capital later(Anonymous way) "+str.toUpperCase());
            }
        };
        consumer.accept("ram ji");
    }
}

class ConsumerDemo implements Consumer<String>{
    public void accept(String str){
        System.out.println("data in capital later "+str.toUpperCase());
    }
    public void tradionalyApproch(){
        Consumer<String> consumer=new ConsumerDemo();
        consumer.accept("ram ji");
    }
}

public class ConsumerFuncInterface {
    public static void afterJava8(){
        Consumer<String> consumer=(str)-> System.out.println("data in capital later "+str.toUpperCase());
        consumer.accept("ram ji");
    }
    public static void andthenMethod(){
        Consumer<String> consumer=(str)-> System.out.println(str+" "+"world ");
        Consumer<String> consumer1=(str)->System.out.println(str+" "+"java 8");
        consumer1.andThen(consumer).accept("Hello");
    }
    public static void forEach(){

//        List<Integer>integers= Arrays.asList(1,2,3,4,5,6,7);
//        Consumer<Integer>consumer=(num)-> System.out.println("number :"+num);
//       integers.forEach(consumer);

        List<Integer>integers= Arrays.asList(1,2,3,4,5,6,7);
        integers.forEach((num)-> System.out.println("number :"+num));
    }
    public static void printStudentName(){
//        Consumer<Student> studentConsumer=student -> System.out.println(student);
//        List<Student>studentList= StudentaDataBase.getAllStudent();
//        studentList.forEach(studentConsumer);

//        we can remove one line code -----------------
//        List<Student>studentList= StudentaDataBase.getAllStudent();
//        studentList.forEach(student -> System.out.println(student));

//        we can do something more
        List<Student>studentList= StudentaDataBase.getAllStudent();
        studentList.forEach(System.out::println);
    }
    public static  void printNameAndActivities(){
        Consumer<Student>studentConsumerName=student -> System.out.print(" "+student.getName());
        Consumer<Student>studentConsumerAct=student -> System.out.println(" "+student.getActivities());
        List<Student>studentList=StudentaDataBase.getAllStudent();
        studentList.forEach(studentConsumerName.andThen(studentConsumerAct));
    }
    public static  void printNameAndActivitiesFilterBasedOnGrade(){
        Consumer<Student>studentConsumerName=student -> System.out.print(" "+student.getName());
        Consumer<Student>studentConsumerAct=student -> System.out.println(" "+student.getActivities());

        List<Student> studentList=StudentaDataBase.getAllStudent();
        studentList.forEach(student -> {
            if (student.getGradeLevel()>=3){
                studentConsumerName.andThen(studentConsumerAct).accept(student);
            }
        });
    }

}
//predicate
//Function


//Note in this code some place we are doing cod eduplication if we comparing to whole code
//we can avoide that thing by creating that variable outside of function