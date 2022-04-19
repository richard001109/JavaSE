package com.kuang.operator;

public class Demo04 {
    public static void main(String[] args) {
        // ++  --   自增   自减  一元运算符
        int a = 3;
        int b = a++;//b=a=3 a++ a=4   执行完这行代码后，先给b赋值，再自增
        System.out.println(a);
        int c = ++a;//a=++a=5 c=a=++a=5  执行完这行代码后，先自增，再给c赋值

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println((a++)+(++b));//9 5+4

        //幂运算 2^3  2*2*2 = 8 很多运算我们会使用一些工具类来操作
        double pow = Math.pow(2, 3);
        double pow2 = Math.pow(3, 2);
        System.out.println(pow);
        System.out.println(pow2);


    }
}
