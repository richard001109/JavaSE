package com.kuang.method;

public class Demo06 {
    //2! 2*1
    public static void main(String[] args) {
        System.out.println(f(15));
    }
    public static int f(int n){
        if (n==1){
            return 1;
        }else{
            return n*f(n-1);
        }
    }
}
