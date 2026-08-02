//PROBLEM LINK : https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1?page
/*
Given an array of integers arr[] and a number k. Return the maximum 
sum of a SubArray of size k.
ex:
arr[] = [100,200,300,400]
k = 4
Ouput = 700
*/
public class Problem4 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 4, 2, 10, 23, 3, 1, 0, 20 };
        int k = 4;
        int result = maxSubarraySum(arr, k);
        System.out.println("Maximum sum of subarray : "+ result);
    }

    public static int maxSubarraySum(int[] arr, int k) {
        int n = arr.length;
        int current_sum = 0;
        for (int i = 0; i < k; i++) {
            current_sum += arr[i];
        }
        int max_sum = current_sum;
        for(int i = k; i<n-1; i++){
            current_sum = current_sum + arr[i] - arr[i-k];
            max_sum = Math.max(max_sum, current_sum);
        }
        return max_sum;
    }
}
