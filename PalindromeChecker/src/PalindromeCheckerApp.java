import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

public class UseCase13PalindromeCheckerApp {

    public static boolean twoPointerCheck(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static boolean stackCheck(String input) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static boolean dequeCheck(String input) {

        Deque<Character> deque = new LinkedList<>();

        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "madam";

        long startTime;
        long endTime;

        startTime = System.nanoTime();
        twoPointerCheck(input);
        endTime = System.nanoTime();
        System.out.println("Two Pointer Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        stackCheck(input);
        endTime = System.nanoTime();
        System.out.println("Stack Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        dequeCheck(input);
        endTime = System.nanoTime();
        System.out.println("Deque Time: " + (endTime - startTime) + " ns");
    }
}