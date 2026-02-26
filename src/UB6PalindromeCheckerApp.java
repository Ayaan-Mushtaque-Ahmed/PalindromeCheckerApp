import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class UB6PalindromeCheckerApp {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Stack<Character> stack = new Stack<>();
            Queue<Character> queue = new LinkedList<>();

            System.out.print("Enter a word: ");
            String input = sc.nextLine();

            for (char ch : input.toCharArray()) {
                stack.push(ch);
                queue.add(ch);
            }

            boolean isPalindrome = true;

            while (!stack.isEmpty()) {
                if (!stack.pop().equals(queue.remove())) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println("It is a Palindrome");
            } else {
                System.out.println("It is NOT a Palindrome");
            }

            sc.close();
        }
    }
