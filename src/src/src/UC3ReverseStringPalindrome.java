/**
 * MAIN CLASS: UC3ReverseStringPalindrome
 *
 * Use Case 3: Reverse String Comparison
 *
 * Description:
 * This program reverses the string and compares
 * it with the original to determine if it is a palindrome.
 *
 * @author Developer
 * @version 3.0
 */

public class UC3ReverseStringPalindrome {

    public static void main(String[] args) {

        String input = "radar";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        boolean isPalindrome = input.equals(reversed);

        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}
