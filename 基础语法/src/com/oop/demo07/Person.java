package com.oop.demo07;

public class Person {

    {
        //代码块（匿名代码块）
        System.out.println("匿名代码块");
        //赋初始值
    }
    static {
        //静态代码块
        System.out.println("静态代码块");//只执行一次
    }
    public Person(){
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println("===========================");
        Person person2 = new Person();
    }

}
