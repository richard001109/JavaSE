package com.oop.demo01;

import java.io.IOException;

public class Demo01 {

    //main方法
    public static void main(String[] args) {
        String str1 = sayHello();
        System.out.println(str1);
        print();
        int max = max(1,56);
        System.out.println(max);
    }
    /*
    修饰符 返回值类型 方法名 （……）{
        方法体
        return 返回值;
    }
    方法名：注意规范 见名知意
    break：跳出switch，结束循环

     */
    public static String sayHello(){
        return "Hello,world";//return 代表方法结束,返回一个结果
    }
    public static int max(int a,int b){
        return a>b?a:b;//三元运算符
    }
    public static void print(){
        System.out.println("你好！");
    }

    //数组下标越界：Arrayindexoutofbounds
    public void reafFile(String file) throws IOException{

    }
}
