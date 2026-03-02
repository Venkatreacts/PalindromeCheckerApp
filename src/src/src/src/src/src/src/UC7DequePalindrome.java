import java.util.Deque;
import java.util.ArrayDeque;

/**
 * MAIN CLASS: UC7DequePalindrome
 *
 * Use Case 7: Deque Based Optimized Palindrome Check
 *
 * Description:
 * Uses Deque to compare characters from front and rear
 * without using extra reversal structures.
 *
 * @author Developer
 * @version 7.0
 */

public class UC7DequePalindrome {

    public static void main(String[] args) {

        String input = "refer";

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}
