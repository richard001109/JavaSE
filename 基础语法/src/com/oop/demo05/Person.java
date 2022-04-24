package com.oop.demo05;
//Person 人  ：父类

//在Java中所有类都直接或者间接继承object类
public class Person {
    //public
    //private私有属性无法被继承
    public  Person(){
        System.out.println("Person无参构造执行");
    }

    protected  String name = "kuangshen";

    public void print(){
        System.out.println("Person");
    }
}
