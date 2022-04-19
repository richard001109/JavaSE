package com.kuang.array;

import java.util.Arrays;

public class ArrayDmeo06 {
    public static void main(String[] args) {
        int[] a = {354,456,5646,45,545,132,312,231};
        System.out.println(a);
        System.out.println(Arrays.toString(a));
        printArray(a);

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        Arrays.fill(a,0);
        System.out.println(Arrays.toString(a));
        Arrays.fill(a,2,4,1);
        System.out.println(Arrays.toString(a));
    }

    public static void printArray(int[] a){
        for (int i = 0;i<a.length;i++){
            if (i==0){
                System.out.print("[");
            }
            if (i == a.length-1){
                System.out.println(a[i]+"]");
            }else {
                System.out.print(a[i] + ", ");
            }
        }
    }
}
