/*
Given an sorted array and an integer k
find the position of k in the array using Binary Search.
Ex:[1,2,3,4,5] ,k = 4  
--> 3 
*/
class Problem3{
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int k = 4;
        System.out.println("Position of k in array is : "+findPosition(arr, k));
    }
    static int findPosition(int[] arr, int k){
        int n =arr.length;
        int i = 0,j=n-1;

        while(i<=j){
            int mid = i+(j-i)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]<k){
                i = mid + 1;
            }else{
                j = mid - 1;
            }
        }
        return -1;
    }
}