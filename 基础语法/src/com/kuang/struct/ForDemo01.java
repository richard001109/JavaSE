package com.kuang.struct;

public class ForDemo01{
    public static void main(String[] args) {
        int a = 1;//初始化条件
        while(a<=100){//初始化条件
            System.out.println(a);//循环体
            a += 2;//迭代
        }
        System.out.println("while循环结束!");

        //初始化值 条件判断 迭代
        for (int i = 1;i<=100;i++){
            System.out.println(i);
        }
        System.out.println("for循环结束!");



        //==========================================================================================
        //死循环
//        for (; ; ) {

//        }


    }
}
