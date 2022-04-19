package com.kuang.scanner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        //创建一个扫描器对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用nextLine方式接收：");

        //判断用户有没有输入字符串、
        if(scanner.hasNextLine()){
            String str = scanner.nextLine();//nextLine以回车为结束符
            System.out.println("输入的内容为："+str);
        }

        scanner.close();
    }
}
