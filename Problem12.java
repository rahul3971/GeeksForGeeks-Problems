//PROBLEM LINK: https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1
/*
Given a sorted array arr[] and a  number target, find the number of occurences of target
in the given array.
*/

public class Problem12 {

    public static int countFreq(int[] arr, int target){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                count++;
            }
        }
        return count;
    
    }
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,1,2,2,2,2,3};
        int target1 = 5;
        System.out.println(countFreq(arr1,target1));
    }
}
