package com.oop;

import com.oop.demo06.Person;
import com.oop.demo06.Student;

public class Application {
    public static void main(String[] args) {
        //一个对象的实际类型是确定的
        //new Student();
        //new Person();

        //可以指向的引用类型就不确定了
        Student s1 = new Student();
        Person s2 = new Student();//父类的引用指向子类
        Object s3 = new Student();

        s2.run();//子类重写了父类的方法就使用子类的方法
        s1.run();


        //对象能执行哪些方法，主要看左边的类型
        //s2.eat();
        s1.eat();


    }
}
