package com.oop.demo05;
//学生 is 人 ：派生类，子类
//子类继承了父类，就会拥有父类的所有方法
public class Student extends Person {

    public Student(){
        //隐藏代码，调用了父类的无参构造
        System.out.println("Student无参构造执行");
    }

    private String name ="qinjiang";

    public void print(){
        System.out.println("Student");
    }

    public void test1(){
        print();//Student
        this.print();//Student
        super.print();//Preson
    }

    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
