package com.bjpowernode;

import java.util.Arrays;
import java.util.List;

public class maopaoSort {
    public static void main(String[] args) {
        int[] array = {1,5,6,3,7,2};
        int sortArray[] = maopaoSort.maopao(array);
        for(int i = 0; i < sortArray.length; i++){
            System.out.println(sortArray[i]);
        }
    }
    public static int[] maopao(int[] array){
        int temp = 0;
        for(int j = array.length - 1; j > 0; j--){
            for(int i = 0; i < j; i++){
                if(array[i] > array[i+1]){
                    temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
}
