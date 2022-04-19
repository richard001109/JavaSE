package com.kuang.method;

public class Demo02 {
    public static void main(String[] args) {
        int max=max(67,67);
        double max2=max(67.0,61.0);
        System.out.println(max);
        System.out.println(max2);
    }
    //比较大小
    public static int max(int num1, int num2){
        int max=0;
        if (num1==num2){
            System.out.println(num1+"=="+num2);
            return 0;//终止方法
        }
        if(num1>num2){
            max=num1;
        }else {
            max=num2;
        }
        return max;
    }
    //比较大小（重载）
    public static double max(double num1, double num2){
        double max=0;
        if (num1==num2){
            System.out.println(num1+"=="+num2);
            return 0;//终止方法
        }
        if(num1>num2){
            max=num1;
        }else {
            max=num2;
        }
        return max;
    }
}

