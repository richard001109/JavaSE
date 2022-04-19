package com.kuang.operator;

public class Demo02 {
    public static void main(String[] args) {
        long a =14354654654L;
        int b = 123;
        short c = 10;
        byte d = 8;
        System.out.println(a+b+c+d);//long
        System.out.println(getType(a+b+c+d));//long
        System.out.println(b+c+d);//int
        System.out.println(c+d);//int,计算结果默认为int
        System.out.println(getType(c+d));
        System.out.println((double)c+d);//double
    }

    public static String getType(Object o){
        return o.getClass().toString(); //使用int类型的getClass()方法
    }
}
