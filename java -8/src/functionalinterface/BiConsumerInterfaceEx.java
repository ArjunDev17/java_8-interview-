package functionalinterface;

import data.Student;
import data.StudentaDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerInterfaceEx {
    public static void intro(){
        BiConsumer<String,String>biConsumer=(s, s2) -> {
            System.out.println("s :"+s+" s2 :"+s2);
        };
        biConsumer.accept("Ram","Ji");
    }

    public static void biConsumerMore(){
        BiConsumer<Integer,Integer> biConsumerMultiply=(a,b)->{
            System.out.println("multiplication :"+a*b);
        };
        BiConsumer<Integer,Integer> biConsumerDevision=(a,b)->{
            System.out.println("devision :"+a/b);
        };
        biConsumerMultiply.andThen(biConsumerDevision).accept(10,5);
    }

    public static void NameAndActivityByUsingBiConsumerInterfaceEx(){
        List<Student>studentList= StudentaDataBase.getAllStudent();
        BiConsumer<String,List<String>>listBiConsumer=((name, activities) -> {
            System.out.println(name+" "+activities);
        });
      studentList.forEach(student ->listBiConsumer.accept(student.getName(),student.getActivities()) );
    }
    public static void NameAndActivityByUsingBiConsumerInterfaceEx2(){
        List<Student>studentList= StudentaDataBase.getAllStudent();
        BiConsumer<String,List<String>>listBiConsumer=((name, activities) -> {
            System.out.println(name+" "+activities);
        });
        BiConsumer<Student,BiConsumer<String,List<String>>>consumerBiConsumer=(student,consumer)->{
consumer.accept(student.getName(),student.getActivities());
        };
       studentList.forEach(student -> {
           consumerBiConsumer.accept(student,listBiConsumer);
       });
           }



}
