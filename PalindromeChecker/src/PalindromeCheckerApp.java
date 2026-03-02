/*
this code is going to
PRINT
Welcome to the Palindrome Checker manager System
Version : 1.0

*@auther JSO
*@Version 1.0
*/

public class PalindromeCheckerApp {
    /**
     * Application entry point for UC2.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "madam";
        boolean isPalindrome = true;

        // Loop only till half of the string length
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        //  result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}
