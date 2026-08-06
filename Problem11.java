//PROBLEM LINK: https://www.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1
/*
Given two arrays a[] and b[] of equal size, the task is to find whether the elements in the arrays are equal.

Two arrays are said to be equal if both contain the same set of elements,arrangements(or permutations) of elements 
may be different though.
Note : If there are repetitions, then the counts of repeated elements must also be the same for two arrays to be equal. 

*/
import java.util.HashMap;
import java.util.Scanner;

public class Problem11 {
    
    public static boolean checkEqual(int[] a, int[]b){
        if(a.length != b.length){
            return false;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : a){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }

        for(int j : b){
            if(!map.containsKey(j)){
                return false;
            }
            map.put(j, map.get(j)-1);
            if(map.get(j)==0){
                map.remove(j);
            }
        }
        return map.isEmpty();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),i=0;
        int[] a = new int[n];
        int[] b = new int[n];
        
        while(i<n){
            a[i] = sc.nextInt();
            i++;
        }
        int j =0;
        while (j<n) {
            b[j] = sc.nextInt();
            j++;
        }
        
        System.out.println(checkEqual(a, b));
        sc.close();
    }
}