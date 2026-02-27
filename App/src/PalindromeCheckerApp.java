import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        // Take input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check palindrome: ");
        String input = scanner.nextLine();

        // Create Queue (FIFO) and Stack (LIFO)
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);     // Enqueue (FIFO)
            stack.push(ch);    // Push (LIFO)
        }

        // Compare dequeue vs pop
        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            char fromQueue = queue.remove();  // Dequeue
            char fromStack = stack.pop();     // Pop

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }

        System.out.println("Program Ended.");
        scanner.close();
    }

}
