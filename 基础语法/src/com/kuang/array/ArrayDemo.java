package com.kuang.array;

public class ArrayDemo {
    //变量类型  变量名字 = 变量值
    //数值类型
    public static void main(String[] args) {
        int[] nums;//1.声明一个数组
        nums = new int[10]; //这里面可以存放是个int类型的值  创建一个数组
//        int[] nums2 = new int[10];
        //给数组元素中赋值
        for (int i = 0; i < 10; i++) {
            nums[i] = i+1;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(nums[i]);
        }
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum +nums[i];
        }
        System.out.println("总和为"+sum);
    }
}
