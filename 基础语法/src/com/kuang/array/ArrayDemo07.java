package com.kuang.array;

import java.util.Arrays;

public class ArrayDemo07 {
    public static void main(String[] args) {
        int[] a={132,32,35,13,38,65};
        int[] sort = sort(a);
        System.out.println(Arrays.toString(sort));
    }

    //冒泡排序
    //比较数组中相邻的两个元素
    public static int[] sort(int[] array){
        int temp=0;
        for (int i = 0; i < array.length-1; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j+1]>array[j]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = true;
                }
            }
            if (flag == false){
                break;
            }
        }
        return array;
    }
}
