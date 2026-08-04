//PROBLEM LINK: https://www.geeksforgeeks.org/problems/prime-number2314/1 
/*
Given a number n, determine whether it is a prime number or not.
Note: A prime number is a number greater than 1 that has no positive divisors other 
than 1 and itself.
*/

public class Problem8 {
    public static void main(String[] args) {
        int n1 = 7;
        System.out.println(isPrime(n1));

        int n2 = 25;
        System.out.println(isPrime(n2));

        int n3 = 1;
        System.out.println(isPrime(n3));
    }
    static boolean isPrime(int n){
        if (n <= 1) return false;

        int count = 0;
        for(int i = 1; i<= n; i++){
            if(n%i==0){
                count ++;
            }
            if(count > 2){
                return false;
            }
        }
        return true;
    }
    //Time Complexity: O(√n)
    //Space Complexity: O(1)
}
