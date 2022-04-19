package com.kuang.cal;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Calculator ca=new Calculator();
        System.out.println("请输入一个数:");
        ca.a=sc.nextInt ();
        System.out.println("请输入第二个数：");
        ca.b=sc.nextInt();

        ca.add();
        ca.div();
        ca.sub();
        ca.ride();
    }
}
