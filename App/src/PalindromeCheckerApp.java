import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        // Take input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check palindrome: ");
        String input = scanner.nextLine();

        // Convert string to character array
        char[] characters = input.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = characters.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }

        System.out.println("Program Ended.");
        scanner.close();
    }
}
