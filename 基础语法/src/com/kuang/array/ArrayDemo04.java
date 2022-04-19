package com.kuang.array;

public class ArrayDemo04 {
    public static void main(String[] args) {
        int[] arrays ={1,2,3,4,5,6,7,8,9,0};

        //JDK1.5以上,没有下标，适合打印输出
        for (int array : arrays) {
            System.out.println(array);
        }
        printArray(arrays);

        System.out.println();

        int[] result = reverse(arrays);
        printArray(result);

        System.out.println();

        int[] result2 = reverse2(arrays);
        printArray(result2);
    }

    //打印数组元素
    public static void printArray(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+" ");
        }
    }

    //反转数组
    public static int[] reverse(int[] arrays){
        int[] result =new int[arrays.length];
        for (int i = 0; i < arrays.length; i++) {
            result[i] = arrays[(arrays.length-i-1)];
        }
        return result;
    }
    public static int[] reverse2(int[] arrays){
        int[] result =new int[arrays.length];
        for (int i = 0,j= result.length-1; i < arrays.length ; i++,j--) {
            result[j]=arrays[i];
        }
        return result;
    }
}
