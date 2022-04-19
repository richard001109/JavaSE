package com.kuang.cal;

import java.util.Scanner;

public class MyCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数");
        double num1 = scanner.nextDouble();
        System.out.println("请输入第二个数");
        double num2 = scanner.nextDouble();

        System.out.println("加法运算：");
        add(num1,num2);
        System.out.println("减法运算：");
        sub(num1,num2);
        System.out.println("除法运算：");
        div(num1,num2);
        System.out.println("乘法法运算：");
        mult(num1,num2);
    }
    public static void add(double num1,double num2){
        double result = 0;
        result = num1 + num2;
        System.out.println(num1+" + "+num2+" = "+result);
    }
    public static void sub(double num1,double num2){
        double result = 0;
        result = num1 - num2;
        System.out.println(num1+" - "+num2+" = "+result);
    }
    public static void div(double num1,double num2){
        double result = 0;
        result = num1 / num2;
        System.out.println(num1+" / "+num2+" = "+result);
    }
    public static void mult(double num1,double num2){
        double result = 0;
        result = num1 * num2;
        System.out.println(num1+" * "+num2+" = "+result);
    }

}
