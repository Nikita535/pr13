package com.company;

import java.util.*;
import java.lang.Object;

public class Students implements Comparator<Student> {

    private ArrayList<Student> iDNumber=new ArrayList<Student>();

    static String[] names = new String[] { "Nikita", "Ivan", "Pasha", "Igor", "Sasha", "Ilya" };

    public Students() {
        for (int i = 0; i < 5; i++) {
            int a = (int) (Math.random() * 40 + 20);
            int b = (int) (Math.random() * 40 + 10);
            int c=(int) (Math.random()*40+1);
            iDNumber.add(i,new Student(names[i % names.length], a, b, c));
        }
    }

    public void outArray(){
        System.out.println("Name"+"\t"+"Age"+"\t"+"Group"+" "+"Res");
        iDNumber.stream().forEach(el ->{ // StreamAPI
            System.out.print(el.getName()+ "\t"+el.getAge()+"\t"+el.getGroup()+"\t\t"+el.getRes()+"\n");
        });

        }

        @Override
        public int compare(Student o1, Student o2) {return Integer.compare(o1.getRes(), o2.getRes());}






    public void quicksort(int low,int high){
        if (iDNumber.size() == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        Student opora=iDNumber.get(middle);
        int i = low, j = high;
        while (i <= j) {
            while (compare(iDNumber.get(i), opora) > 0)
                i++;
            while (compare(iDNumber.get(j), opora) < 0)
                j--;
            if (i <= j) {

                Collections.swap(iDNumber,i,j);

                i++;
                j--;}}
        if (low < j)
            quicksort(low, j);
        if (high > i)
            quicksort(i, high);
    }

   

}

