package com.oop.demo02;

//学生类
public class Student {
    //属性:字段
    String name;//null
    int age;//0

    //方法
    public void study(){
        System.out.println(this.name+"在学习");
    }

}


//Person-->身高，体重，年龄，国家
//学程序好？  对世界进行更好的建模！
/*
测试类
public class Application {
    public static void main(String[] args) {
        //类：抽象的，需要实例化
        //类实例化后会返回一个自己的对象
        //student对象就是就是一个Student类的具体实例

        Student xiaoming = new Student();
        Student xh = new Student();

        xiaoming.name = "小明";
        xiaoming.age = 15;

        System.out.println(xiaoming.name);
        System.out.println(xiaoming.age);

        xh.name="小红";
        xh.age = 15;

        System.out.println(xh.name);
        System.out.println(xh.age);
    }
}
 */