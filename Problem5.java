//PROBLEM LINK: https://www.geeksforgeeks.org/problems/second-largest3735/1
/*
Given an array of positive integers arr[], return the second largest element from the array. 
If the second largest element doesn't exist then return -1.

Note: The second largest element should not be equal to the largest element.
*/
class Problem5 {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 35, 1, 10, 34, 1};
        System.err.println("Second Largest Element is: "+ getSecondLargest(arr));
    }
    public static int getSecondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > largest){
                second_largest = largest;
                largest = num;
            }else if(num > second_largest && num != largest){
                second_largest = num;
            }
        }
        return second_largest == Integer.MIN_VALUE ? -1 : second_largest;
    }
}
