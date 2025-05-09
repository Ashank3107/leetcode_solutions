import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        // Create a stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();

        // Iterate over each character in the string
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                // If it's an opening bracket, push it onto the stack
                stack.push(c);
            } else {
                // If it's a closing bracket
                if (stack.isEmpty()) {
                    return false; // No corresponding opening bracket
                }

                // Pop from the stack and check if it matches the current closing bracket
                char top = stack.pop();
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }

        // If the stack is empty, all brackets were matched properly
        return stack.isEmpty();
    }
}