package com.kuang.struct;

public class ForDemo02 {
    public static void main(String[] args) {
        //练习，分别计算0到100奇数和与偶数和

        int oodsum = 0;
        int evensum = 0;
        for (int i = 0 ; i<=100;i++){
            if(i%2!=0) {//基数
                oodsum = oodsum + i;
            }else {//偶数
                evensum += i;
            }
        }
        System.out.println("奇数和"+oodsum);
        System.out.println("偶数和"+evensum);
    }
}
