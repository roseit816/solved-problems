import java.util.*;

class Solution {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            System.out.println(isBalanced(input));
        }
        sc.close(); // Close the scanner to prevent resource leaks
    }

    /**
     * Checks if a string of brackets is balanced.
     * 
     * @param s The input string containing only brackets.
     * @return true if the string is balanced, false otherwise.
     */
    private static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                // If stack is empty when a closing bracket is encountered, it's unbalanced
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
                    return false;
                }
            }
          
        }
        return stack.isEmpty();
    }
}
