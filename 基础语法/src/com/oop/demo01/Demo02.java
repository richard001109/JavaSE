package com.oop.demo01;

public class Demo02 {
    public static void main(String[] args) {
        Student.say1();
        //实例化这个类 new
        //对象类型 对象名  = 对象值
        Student student = new Student();
        student.say2();
    }
    // 和类一起加载的
    public static void a(){
        //b();
    }
    //类实例化之后才存在
    public void b(){
        a();
    }

}
