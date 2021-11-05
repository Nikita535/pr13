package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        //Task1 in Task2 and Task3
        //Task2
        System.out.println("TASK 2 and 1");
        System.out.println();
        System.out.println("Без сортировок");
        Students st = new Students();
        st.outArray();
        System.out.println("\nQuicksort по res");
        st.quicksort(0,4);
        System.out.println();
        st.outArray();



        System.out.println("Task 3");
	    List<Student> list1=new ArrayList<Student>();


        Student st1=new Student("Nikita",15,16,5);
        list1.add(st1);
        Student st2=new Student("Sasha",20,14,6);
        list1.add(st2);
        Student st3=new Student("Pasha",19,7,15);
        list1.add(st3);

        List<Student> list2=new ArrayList<Student>();
        Student st4=new Student("Artem",17,3,12);
        list2.add(st4);
        Student st5=new Student("Katya",19,16,0);
        list2.add(st5);
        Student st6=new Student("Georgiy",18,13,1);
        list2.add(st6);

        List<Student> list12=new ArrayList<Student>(list1);
        list12.addAll(list2);
        list12.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });

        System.out.println("Сортировка по возрасту");
        System.out.println("Name"+"\t"+"Age"+"\t"+"Group"+" "+"Res");
        for (Student p: list12){

            System.out.println(p.getName()+"\t"+p.getAge()+"\t"+p.getGroup()+"\t"+p.getRes());
        }
    }
}
