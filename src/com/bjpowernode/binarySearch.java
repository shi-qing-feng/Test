package com.bjpowernode;

public class binarySearch {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        System.out.println(binarySearch.search(array,3));
    }
    public static int search(int[] array, int target){
        int left = 0;
        int right = array.length-1;
        int mid = 0;

        while (left <= right){
            mid = (left + right)/2;
            if(array[mid] == target){
                return mid;
            }else if(target < array[mid]){
                right = mid - 1;
            }else if(target > array[mid]){
                left = mid + 1;
            }
        }
        return -1;
    }
}
