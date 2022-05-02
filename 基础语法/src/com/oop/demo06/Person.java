package com.oop.demo06;

public class Person {
    public void run(){
        System.out.println("run");
    }
}
/*
多态注意事项
1、多态是方法的多态，属性没有多态
2、父类和子类，有联系  类型转换异常 ClassCastException
3、存在条件 继承关系，方法需要重写，父类引用指向子类都西昂  father f1 = new son();

       1、static  方法 属于类 不属于实例
       2、final  常量
       3、private 方法
 */
/*
        //一个对象的实际类型是确定的
        //new Student();
        //new Person();

        //可以指向的引用类型就不确定了
        //Student子类能调用的方法都是自己的或者继承父类的
        Student s1 = new Student();
        //Person 父类型，可以指向子类，但不能调用子类独有的方法
        Person s2 = new Student();//父类的引用指向子类
        Object s4 = new Student();

        s2.run();//子类重写了父类的方法就使用子类的方法
        s1.run();


        //对象能执行哪些方法，主要看左边的类型
        ((Student) s2).eat();
        s1.eat();


 */