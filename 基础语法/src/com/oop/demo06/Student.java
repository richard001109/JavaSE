package com.oop.demo06;

public class Student extends Person{

    @Override
    public void run() {
        System.out.println("son");
    }
    public void eat(){
        System.out.println("eat");
    }
}
/*
        //object->String
        //object->Person->Student
        //object->Person->Teacher
        Object object = new Student();

        System.out.println(object instanceof Student);//true
        System.out.println(object instanceof Person);//true
        System.out.println(object instanceof Object);//true
        System.out.println(object instanceof String);//flase
        System.out.println(object instanceof Teacher);//flase

        System.out.println("==========================================================");

        Person person = new Student();

        System.out.println(person instanceof Student);//true
        System.out.println(person instanceof Person);//true
        System.out.println(person instanceof Object);//true
        //System.out.println(person instanceof String);//编译报错
        System.out.println(person instanceof Teacher);//flase

        System.out.println("==========================================================");

        Student student = new Student();

        System.out.println(student instanceof Student);//true
        System.out.println(student instanceof Person);//true
        System.out.println(student instanceof Object);//true
        //System.out.println(person instanceof String);//编译报错
        //System.out.println(student instanceof Teacher);//编译报错

        //System.out.println(x instanceof y);//能不能通过在于x和y之间是有父子关系
 */