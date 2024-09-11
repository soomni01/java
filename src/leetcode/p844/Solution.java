package leetcode.p844;

import java.util.EmptyStackException;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        String s = "a##c";
        String t = "#a#c";
        System.out.println(s1.backspaceCompare(s, t));
    }
}

class Solution1 {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for (char a : s.toCharArray()) {
            if (a == '#') {
                if (!(stack1.isEmpty())) {
                    stack1.pop();
                }
            } else {
                stack1.push(a);
            }
        }


        for (char a : t.toCharArray()) {
            if (a == '#') {
                if (!(stack2.isEmpty())) {
                    stack2.pop();
                }
            } else {
                stack2.push(a);
            }
        }

        if (stack1.equals(stack2)) {
            return true;
        } else {
            return false;
        }
    }
}
