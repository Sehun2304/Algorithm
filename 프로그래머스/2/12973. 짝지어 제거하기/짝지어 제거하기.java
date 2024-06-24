import java.util.Stack;

class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            
            if (!stack.isEmpty() && stack.peek() == current) {
                stack.pop();
            } else {
                stack.push(current);
            }
        }

        if (stack.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }
}
