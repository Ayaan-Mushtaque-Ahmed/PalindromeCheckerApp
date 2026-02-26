import java.util.Scanner;
import java.util.Stack;

public class UC5PalindromeCheckerApp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        if (input.equals(reversed)) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is NOT a Palindrome");
        }

        sc.close();
    }
}

