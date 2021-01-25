package com.cars.eureka.javahub;

/**
 * 快速排序
 */
public class quickSort {

    public static void main(String[] args) {
        int[] arr = {3,2,1,8,6,5,7};
        getQuickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"-");
        }
    }

    public static void getQuickSort(int[] arr,int left,int right){
        if(arr.length<2) return;

        if(left>right){
            return;
        }

        int k = arr[left];
        int l = left;
        int r = right;

        //把第一段k值确定
        while(l != r){

            while (arr[r] >= k && l < r){
                r --;
            }
            while (arr[l] <= k && l < r){
                l ++;
            }

            if(l<r){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }
        //开始递归
        arr[left] = arr[l];
        arr[l]= k;
        getQuickSort(arr,left,l-1);
        getQuickSort(arr,l+1,right);
    }

}
