package com.oop.demo01;
//引用传递，对象，本质还是值传递
public class Demo05 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);//null
        Demo05.change(person);
        System.out.println(person.name);//秦疆
    }
    public static void change(Person person){
        person.name="秦疆";
    }
}
//定义一个Person类，有一个属性，name
class Person{
    String name;//null
}