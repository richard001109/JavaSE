package com.oop.demo01;

public class Demo04 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);//1
        Demo04.change(a);
        System.out.println(a);//1

        System.out.println(Demo04.change1(a));//10
    }

    public static void change(int a){
        a=10;
    }
    public static int change1(int a){
        a=10;
        return a;
    }
}
