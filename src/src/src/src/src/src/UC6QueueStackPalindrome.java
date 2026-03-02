import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

/**
 * MAIN CLASS: UC6QueueStackPalindrome
 *
 * Use Case 6: Queue and Stack Comparison
 *
 * Description:
 * Uses Queue (FIFO) and Stack (LIFO) to compare
 * characters from front and rear.
 *
 * @author Developer
 * @version 6.0
 */

public class UC6QueueStackPalindrome {

    public static void main(String[] args) {

        String input = "civic";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {

            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}
