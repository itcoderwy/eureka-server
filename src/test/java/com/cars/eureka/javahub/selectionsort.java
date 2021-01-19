package com.cars.eureka.javahub;

/**
 * @Description 测试选择排序
 * @Author Wy005
 * @Date 2021/1/19 15:40
 * @Version 1.0
 **/
public class selectionsort {
    public static void main(String[] args) {
        //先定义一个数组
        int[] arr = {9,3,4,2,6,1};
        //调用方法
         getsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"--");
        }
    }
    public static int[] getsort(int[] arr){
        if(arr.length<=1) return arr;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    getsort1(arr,i,j);
                }
            }
        }
        return arr;
    }

    public static void getsort1(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
