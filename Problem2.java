//PROBLEM LINK : https://www.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1
/*
You are given an array arr[] of non-negative integers. You have to move all 
the zeros in the array to the right end while maintaining the relative order
of the non-zero elements. The operation must be performed in place, 
meaning you should not use extra space for another array.
arr[] = [1,2,0,4,3,0,5,0]
Output : [1,2,4,3,5,0,0,0]
*/

import java.util.Arrays;

class Problem3 {
    public static void main(String[] args) {
        int[] arr =new int[]{1,2,0,4,3,0,5,0};
        pushZeroToEnd(arr);

    }
    public static void pushZeroToEnd(int[] arr ){
        int n = arr.length;
        int index = 0;
        for(int i =0; i< n; i++){
            if (arr[i]!=0) {
                arr[index] = arr[i];
                index++;
            }
        }
        while (index < n ) {
            arr[index] = 0;
            index ++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
