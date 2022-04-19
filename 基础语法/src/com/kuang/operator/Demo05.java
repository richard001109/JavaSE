package com.kuang.operator;
//逻辑运算符
public class Demo05 {
    public static void main(String[] args) {
        //与（and） 或（or） 非(取反)
        boolean a = true;
        boolean b = false;

        System.out.println("a && b: "+ (a && b));//逻辑与运算，两个变量都为true，结果才为true
        System.out.println("a || b: "+ (a || b));//逻辑或运算，两个变量有一个为true，结果才为true
        System.out.println("!(a && b): "+!(a && b));//如果为true,则为false，如果为false，则为true

        //短路运算
        int c = 5;
        boolean d = (c<4)&&(c++<4);//因为c<4为false，直接判断d为false，后续式子不进行计算
        System.out.println(d);
        System.out.println(c);
    }
}
