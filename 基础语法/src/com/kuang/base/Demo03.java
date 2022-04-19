package com.kuang.base;

public class Demo03 {
    public static void main(String[] args) {
        //整数拓展 进制 二进制0b 十进制 八进制0 十六进制0x
        int i = 10;
        int i2 = 010;//8
        int i3 = 0x10;//16 0-9 A-F
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("//=========================================================================================================================");

        //=========================================================================================================================
        //浮点数拓展
        //BigDecimal 数学工具类
        //=========================================================================================================================
        //float  有限 离散 舍入误差  大约 接近但不等于
        //double
        float f =0.1f;
        double d = 1.0/10;
        //最好避免使用浮点数进行比较
        System.out.println(f == d);//false
        System.out.println(f);
        System.out.println(d);

        float d1 =2232323232323f;//ture
        float d2 =d1+1;
        System.out.println(d1 == d2);//true
        System.out.println("//=========================================================================================================================");

        //=========================================================================================================================
        //字符拓展
        //=========================================================================================================================
        char c1 ='a';
        char c3 = '\u0061';
        char c2 ='中';
        System.out.println(c1);
        System.out.println((int)c1);//强制转换
        System.out.println(c2);
        System.out.println((int)c2);
        System.out.println(c3);
        System.out.println((int)c3);
        //所有的字符本质还是数字
        //编码 unicode 表：（97=‘a’ 65=‘A’）  2字节 65536个字符 Excel(0-65535) 2^16 =65536

        //U0000 uFFFF

        //转义字符
        // \t  制表符
        // \n  换行
        System.out.println("Hello\tWorld");
        System.out.println("Hello\nWorld");

        System.out.println("//=========================================================================================================================");


        String sa = new String("hello world");
        String sb = new String("hello world");
        System.out.println(sa == sb);
        System.out.println("//=========================================================================================================================");

        String sc ="hello world";
        String sd ="hello world";
        System.out.println(sc == sd);

        //对象 从内存分析

        //boolean 值扩展
        boolean flag =true;
        if (flag == true){}
        if (flag){}
        //less is more 代码要精简易读



 

    }
}
