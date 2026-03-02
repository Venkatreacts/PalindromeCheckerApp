import java.util.Stack;

/**
 * MAIN CLASS: UC5StackPalindrome
 *
 * Use Case 5: Stack Based Palindrome Check
 *
 * Description:
 * Uses Stack (LIFO) to reverse order of characters
 * and compares while popping.
 *
 * @author Developer
 * @version 5.0
 */

public class UC5StackPalindrome {

    public static void main(String[] args) {

        String input = "noon";
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}
