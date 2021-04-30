package com.bjpowernode;

public class Sort {
    public static void main(String[] args) {
        int[] array = {1,5,3,7,2};
        int[] result = charupaixu(array);
        for (int i: result){
            System.out.println(i);
        }
    }
    public static int[] charupaixu(int[] array){
        for(int i = 1; i < array.length; i++){
            for(int j = i; j > 0; j--){
                if(array[j] < array[j-1]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
