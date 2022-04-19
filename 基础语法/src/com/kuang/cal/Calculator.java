package com.kuang.cal;

public class Calculator {
    int a;
    int b;
    int result;
    void add(){//a+b的值
        result=a+b;
        System.out.println("a+b="+result);
    }

    void sub(){//a-b的值
        result=a-b;
        System.out.println("a-b="+result);
    }

    void ride(){//a*b的值
        result=a*b;
        System.out.println("a*b="+result);
    }

    void div(){//a/b的值
        result=a/b;
        System.out.println("a/b="+result);
    }
}
