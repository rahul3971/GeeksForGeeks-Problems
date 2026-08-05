//PROBLEM LINK: https://www.geeksforgeeks.org/problems/equilibrium-point-1587115620/1
/*
Given an array of integers arr[], the task is to find the first equilibrium point 
in the array. 
The equilibrium point in an array is an index (0-based indexing) such that the sum 
of all elements before that index is the same as the sum of elements after it. 
Return -1 if no such point exists. 
*/
public class Problem9 {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 2, 0, 3 };
        System.out.println(findEquilibriumPoint(arr1));

        int[] arr2 = new int[] { 1, 1, 1, 1 };
        System.out.println(findEquilibriumPoint(arr2));

        int[] arr3 = new int[] { -7, 1, 5, 2, -4, 3, 0 };
        System.out.println(findEquilibriumPoint(arr3));

    }

    public static int findEquilibriumPoint(int[] arr) {
        int leftSum = 0;
        int totalSum = 0;

        if (arr.length == 2) {
            return -1;
        } else if (arr.length == 1) {
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            totalSum = totalSum + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i];

            if (rightSum == leftSum) {
                return i;
            }
            leftSum = leftSum + arr[i];
        }

        return -1;
    }
}