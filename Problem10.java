//PROBLEM LINK: https://www.geeksforgeeks.org/problems/key-pair5616/1
/*
Given an array arr[] of integers and another integer target. Determine if there exist two distinct indices 
such that the sum of their elements is equal to the target.
*/

import java.util.HashSet;

public class Problem10 {
    public static void main(String[] args) {
        //TestCase1
        int[] arr1 = new int[] { 0, -1, 2, -3, 1 };
        int target1 = -2;
        System.out.println(twoSum(arr1, target1));
        //TestCase2
        int[] arr2 = new int[] { 1, -2, 1, 0, 5 };
        int target2 = 0;
        System.out.println(twoSum(arr2, target2));
    }

    static boolean twoSum(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>(); 
        for (int i = 0; i < arr.length; i++) {  //Time Complexity = 0(n);
            int complement = target - arr[i];
            if (set.contains(complement)) {
                return true;
            } else {
                set.add(arr[i]);
            }
        }

        return false;
    }
}
