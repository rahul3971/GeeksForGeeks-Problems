//PROBLEM LINK: https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1
/*
Given a sorted array arr[] and a  number target, find the number of occurences of target
in the given array.
*/

public class Problem12 {

    public static int countFreq(int[] arr, int target){
        int n= arr.length,low =0,high=n-1,mid=0;
        int firstIndex = -1, lastIndex =-1;
        while(low <= high){
            mid = low+(high-low)/2;
            if(arr[mid]==target){
                firstIndex = mid;
                high = mid -1;
            }else if(arr[mid]>target){
                high = mid -1;
            }else{
                low = mid +1;
            }
        }
        if(firstIndex == -1) return 0;
        low =0; 
        high = n-1;
        while (low<=high) {
            mid = low+(high-low)/2;
            if(arr[mid]==target){
                lastIndex = mid;
                low = mid+1;
            }else if(arr[mid]>target){
                high = mid -1;
            }else{
                low = mid +1;
            }
        }
    return lastIndex - firstIndex +1;
    }
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,1,2,2,2,2,3};
        int target1 = 5;
        System.out.println(countFreq(arr1,target1));
    }
}
