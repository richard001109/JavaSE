package com.oop.demo10;

/**
 * @author:Richard
 * @version:1.0
 */
public class Outer {

    private int id;
    public void out(){
        System.out.println("这是外部类的方法");
    }
    public class Inner{
        public void in(){
            System.out.println("这是内部类的方法");
        }
//        public void getID(){
//            System.out.println(id);
//        }
    }
}

//可以有多个class 但只能有一个public class
class A{

}