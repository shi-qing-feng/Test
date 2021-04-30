package com.bjpowernode;
public class paixu {
    public static void main(String[] args){
       int[] arrays = {3,6,4,9,1,7,5,2,2};
       //maopao(arrays);
        //xuanze(arrays);
        //charu(arrays);
        kuaisu(arrays,0,8);
       for (int i : arrays){
           System.out.println(i);
       }
    }
    public static void kuaisu(int[] arrays,int low, int high){
        if(low < high){
            int index = getIndex(arrays,low,high);
            kuaisu(arrays,low,index-1);
            kuaisu(arrays,index+1,high);
        }
    }
    public static int getIndex(int[] arr, int low, int high){
        int temp = arr[low];
        while(low < high){
            while(low < high && arr[high] >= temp){
                high--;
            }
            arr[low] = arr[high];

            while(low < high && arr[low] <= temp){
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = temp;
        return low;
    }
    /*public static int[] charu(int[] arrays){
        int temp;
        for (int i = 1; i < arrays.length; i++){
            for (int j = i; j > 0; j--){
                if (arrays[j] < arrays[j-1]){
                    temp = arrays[j];
                    arrays[j] = arrays[j-1];
                    arrays[j-1] = temp;
                }
            }
        }
        return arrays;
    }*/
    /*public static int[] xuanze(int[] arrays){
        for(int i = 0; i < arrays.length-1; i++){
            int min = i;
            int temp;
            for(int j = i+1; j < arrays.length; j++){
                if (arrays[j] < arrays[min]){
                    min = j;
                }
            }
            if (min != i){
                temp = arrays[min];
                arrays[min] = arrays[i];
                arrays[i] = temp;
            }
        }
        return arrays;
    }*/



/*    public static int[] maopao(int[] arrays){
        for (int i = arrays.length-1; i > 0; i--){
            int temp;
            for (int j = 0; j < i; j++){
                if (arrays[j] > arrays[j+1]){
                    temp = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1] = temp;
                }
            }
        }
        return arrays;
    }*/
}
