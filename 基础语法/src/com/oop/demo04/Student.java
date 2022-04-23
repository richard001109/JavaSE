package com.oop.demo04;
//类
public class Student {

    //属性私有
    private String name;//名字

    private int id;//学号

    private char sex;//性别

    private int age;//年龄

    //提供一些可以操作这个属性的方法
    //提供一些public的get、set方法

    //get获取这个数据
    public String getName() {
        return name;
    }
    //set给这个数据设置值
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<120 && age>0) {
            this.age = age;
        }else{
            this.age = 3;
        }
    }
    //学习（）

    //睡觉（）

}


/*

    1.提高系统的安全性，保护数据
    2.隐藏代码的实现细节
    3.统一接口
    4.系统可维护性增加了


    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.setName("秦疆");

        //方法名，参数列表
        String name = s1.getName();

        System.out.println(name);
        System.out.println(s1.getName());

        s1.setAge(999);//不合法的
        System.out.println(s1.getAge());
        s2.setAge(70);
        System.out.println(s2.getAge());
        s3.setAge(-1);//不合法的
        System.out.println(s3.getAge());
    }


*/