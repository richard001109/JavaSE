package com.kuang.struct;

public class WhileDmeo01 {
    public static void main(String[] args) {
        //输出1~100

        int i = 0;

        int sum = 0;
        while (i<100){
            i++;
            sum = sum + i;
            System.out.print(i);
            if(i<100)
            System.out.print("+");
        }
        System.out.print("="+sum);
    }
}
