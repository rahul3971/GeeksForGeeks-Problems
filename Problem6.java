//PROBLEM LINK : https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1
/*
You are given an array arr[] of size n - 1 that contains distinct integers 
in the range from 1 to n (inclusive). This array represents a permutation 
of the integers from 1 to n with one element missing. Your task is to 
identify and return the missing element.
*/

import java.util.HashSet;

public class Problem6 {
    public static void main(String[] args) {
        int[] arr = new int[]{8,2,4,5,3,7,1};
        System.out.println("Missing element is: "+findMissingElement(arr));
    }
    public static int findMissingElement(int[] arr){
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int num: arr){
            set.add(num);
        } 
        for(int i = 1; i<= n+1; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
}
