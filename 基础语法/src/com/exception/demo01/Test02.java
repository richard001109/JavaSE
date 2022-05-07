package com.exception.demo01;

/**
 * @author:Richard
 * @version:1.0
 */
public class Test02 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        //Ctrl +Alt + T
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            System.exit(0);
            e.printStackTrace();
        } finally {
        }
    }
}
