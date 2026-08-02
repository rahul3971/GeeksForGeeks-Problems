//PROBLEM LINK: https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1?page
/*
Given an array arr[] of size n, containing elements from the range 1 to n, 
and each element appears at most twice, 
return an array of all the integers that appears twice.
Ex:
[2,3,1,2,3]
-> [2,3]
*/

import java.util.ArrayList;

class Problem1 {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,1,2,3};
        System.out.println(findDuplicates(arr));
    }

    public static ArrayList<Integer> findDuplicates(int[] arr){
        ArrayList<Integer> dupList = new ArrayList<>();
        ArrayList<Integer> aList = new ArrayList<>();
        for(int i=0; i<arr.length;i++){
            if(aList.contains(arr[i])){
                dupList.add(arr[i]);
            }else{
                aList.add(arr[i]);
            }

        }    
        
        return dupList;
    }
    
}