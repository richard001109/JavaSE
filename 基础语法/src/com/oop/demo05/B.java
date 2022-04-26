package com.oop.demo05;

//重写都是方法的重写，与属性无关
public class B {
    public void test(){
        System.out.println("B=>test()");
    }
}
/*

    //静态方法和非静态方法区别很大
    public static void main(String[] args) {

        //静态方法：方法调用只和左边，定义的数据类型有关

        //非静态方法：重写
        A a = new A();
        a.test();//A

        //父类的引用可以指向子类
        B b = new A();
        b.test();//B

 */