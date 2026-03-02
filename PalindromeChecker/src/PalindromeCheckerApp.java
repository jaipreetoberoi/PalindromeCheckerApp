public class PalindromeCheckerApp {

    public static boolean isPalindrome(String input, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (input.charAt(start) != input.charAt(end)) {
            return false;
        }

        return isPalindrome(input, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String input = "madam";

        boolean result = isPalindrome(input, 0, input.length() - 1);

        if (result) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}