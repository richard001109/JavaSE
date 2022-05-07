package com.exception.demo02;

/**
 * @author:Richard
 * @version:1.0
 */
//自定义的异常类
public class MyException extends Exception{
    //传递数字>10
    private int detail;

    public MyException(int detail) {
        this.detail = detail;
    }
    //toString:异常的打印信息

    @Override
    public String toString() {
        return "MyException{" +
                "detail=" + detail +
                '}';
    }
}
