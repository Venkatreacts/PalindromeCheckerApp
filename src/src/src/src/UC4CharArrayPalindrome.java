/**
 * MAIN CLASS: UC4CharArrayPalindrome
 *
 * Use Case 4: Character Array Two-Pointer Technique
 *
 * Description:
 * Converts the string to a character array and compares
 * elements from start and end moving inward.
 *
 * @author Developer
 * @version 4.0
 */

public class UC4CharArrayPalindrome {

    public static void main(String[] args) {

        String input = "level";
        char[] chars = input.toCharArray();

        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        while (start < end) {

            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}
