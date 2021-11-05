package com.company;

public class Student {

    private String name;
    private int age;
    private int group;
    private int res;

    public Student(String name,int age,int group,int res){
        this.name=name;
        this.age=age;
        this.group=group;
        this.res=res;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public int getGroup(){
        return this.group;
    }

    public int getRes(){
        return this.res;
    }
}
