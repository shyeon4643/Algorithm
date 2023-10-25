package programmers;

import java.util.*;
class Solution3 {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='(') {
                stack.push(c);
            }else {
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }
        if(stack.size()!=0) return false;
        else return true;
    }
}