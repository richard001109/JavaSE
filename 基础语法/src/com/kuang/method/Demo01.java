package com.kuang.method;

public class Demo01 {
    //main方法
    public static void main(String[] args) {

        //实际参数，实际调用传递给他的参数
        int sum = add(1,2);
        int sum1 = add(1,3,5);
        double sum2 = add(12.1,3.5,5.8);
        int sum3 = add(1,3,5,5);

        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

        test();
    }
    //加法
    //形式参数，用来定义作用的
    public static int add(int a,int b){
        return a+b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }
    public static double add(double a,double b,double c){
        return a+b+c;
    }
    public static int add(int a,int b,int c,int d){
        return a+b+c+d;
    }
    //
    public static void test(){
        for (int i = 1; i <= 1000; i++) {
            if(i%5==0){
                System.out.print(i+"\t");
            }
            if (i%(5*3)==0){
                System.out.println("");
            }
        }
    }
}
