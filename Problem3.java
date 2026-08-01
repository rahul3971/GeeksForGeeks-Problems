/*
Move 0s to end.
arr[] = [1,2,0,4,3,0,5,0]
--> [1,2,4,3,5,0,0,0]
*/

import java.util.Arrays;

class Problem3 {
    public static void main(String[] args) {
        int[] arr =new int[]{1,2,0,4,3,0,5,0};
        pushZeroToEnd(arr);

    }
    public static void pushZeroToEnd(int[] arr ){
        int n = arr.length;
        int[] newArr = new int[n];
        int k = n -1;
        int index = 0;
        for(int i =0; i< arr.length; i++){
            if (arr[index]!=0) {
                newArr[index] = arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
