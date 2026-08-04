//PROBLEM LINK : https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1
/*
Given a string s, composed of different combinations of '(' , ')', '{', '}', '[', ']'. 
Determine whether the Expression is balanced or not.

An expression is balanced if:
Each opening bracket has a corresponding closing bracket of the same type.
Opening brackets must be closed in the correct order.
*/

import java.util.Stack;

public class Problem7 {
    public static void main(String[] args) {
        String s1 = "[()()]{}";
        System.out.println(isBalanced(s1));

        String s2 = "([]";
        System.out.println(isBalanced(s2));
    }

    public static boolean isBalanced(String s){
        char[] cArr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char c : cArr){
            if(c=='(' || c == '{' || c == '['){
                stack.push(c);
            }
            else{
                if(stack.empty()){
                    return false;
                }
                char top = stack.pop();
                if((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
