package com.oop.demo02;

public class Person {
    //一个类即使什么都不写，他也会存在一个方法
    //显式定义一个构造器
    String name;
    int age;

    public Person(String name) {
        this.name = name;
    }
//    public Person(int age) {
//        this.age = age;
//    }
/*
    //实例化初始值
    //1.使用new关键字，本质调用构造器
    //2.用来初始化值
    public Person(){
        //this.name="qingjiang";
    }
    //有参构造.一旦定义了有参构造，无参构造就必须显式定义
    public Person(String name){
        this.name=name;
    }

 */
    //alt+insert
/*
测试类
public class Application {
    public static void main(String[] args) {
        //new关键词实例化了一个对象
        Person person = new Person("kuangshen");

        System.out.println(person.name);
    }
}
 */
/*
构造器：
    1.和类名相同
    2.没有返回值
作用：
    1.new本质在调用构造方法
    2.初始化对象的值
注意点：
    1.定义有参构造之后，如果想使用无参构造，显式的定义一个无参的构造
    Alt+insert
    this. =


*/
}
