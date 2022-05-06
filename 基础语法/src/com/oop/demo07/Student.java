package com.oop.demo07;

public class Student{
    private static int age;//静态变量  多线程
    private double score;//非静态变量

    public void run(){
        go();
        System.out.println("2");
    }
    public static void go(){
        System.out.println("1");
    }


    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println(Student.age);
        System.out.println(s1.age);
        System.out.println(s1.score);

        s1.run();
        go();

    }
}
