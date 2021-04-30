package com.bjpowernode;

public class Sort2 {
    public static void main(String[] args) {
        int[] arr = {10,7,3,9,5,1,4};
        quickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void quickSort(int[] arr, int low, int high){
        int i,j,temp,t;
        if(low > high){
            return;
        }
        i = low;
        j = high;
        temp = arr[low];

        while(i < j){
            while(temp <= arr[j] && i < j){
                j--;
            }
            while(temp >= arr[i] && i < j){
                i++;
            }
            if(i < j){
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        arr[low] = arr[i];
        arr[i] = temp;
        quickSort(arr,low,j-1);
        quickSort(arr,j+1,high);
    }
}
