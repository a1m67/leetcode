package leetcode;

import java.util.Stack;

public class T20_IsValid {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        if (s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}')
            return false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {
                if (stack.size() == 0) {
                    return false;
                }
                if (s.charAt(i) == ')') {
                    if (stack.peek() == '(') {
                        stack.pop();
                        continue;
                    }else {
                        return false;
                    }
                } else if (s.charAt(i) == ']') {
                    if (stack.peek()== '[') {
                        stack.pop();
                        continue;
                    }else {
                        return false;
                    }
                } else if (s.charAt(i) == '}') {
                    if (stack.peek() == '{') {
                        stack.pop();
                        continue;
                    }else {
                        return false;
                    }
                }
            }
        }
        if (stack.size() != 0) {
            return false;
        }
        return stack.empty();
    }


    public boolean isValid2(String s) {
        Stack<Character> stack = new Stack<Character>();
        if (s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}' && s.length() % 2 == 1)
            return false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                if (stack.empty()) return false;
                if (s.charAt(i) == ')' && stack.peek() == '(' || s.charAt(i) == ']' && stack.peek()== '['
                        || s.charAt(i) == '}' && stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
}

    public static void main(String[] args) {
        String s = "{[]}";
        System.out.println(isValid(s));
    }
}