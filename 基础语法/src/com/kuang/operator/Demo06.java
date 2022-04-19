package com.kuang.operator;

public class Demo06 {
    public static void main(String[] args) {
        /*
        A=0011 1100
        B=0000 1101
        ---------------------------------
        A&B = 0000 1100
        A|B = 0011 1101
        A^B = 0011 0001
        ~B  = 1111 0010


        2*8如何运算最快
        效率极高
        <<左移  乘2
        >>右移  除以2
        0000 0000 0
        0000 0001 1
        0000 0010 2
        0000 1000 8

        */

        System.out.println(2<<3);


    }
}
