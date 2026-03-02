/**
 * MAIN CLASS: UC2HalfLoopPalindrome
 *
 * Use Case 2: Half-Length Character Comparison
 *
 * Description:
 * This program checks whether a string is a palindrome
 * by comparing characters from the beginning and end
 * moving towards the center.
 *
 * @author Developer
 * @version 2.0
 */

public class UC2HalfLoopPalindrome {

    public static void main(String[] args) {

        String input = "madam";
        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}
