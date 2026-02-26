package AM2;
import java.util.LinkedList;
import java.util.Scanner;
public class PalindromeCheckerApp {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string to check if it is a palindrome: ");
            String input = scanner.nextLine();

            //Converts to lowercase
            input = input.replaceAll("\\s+", "").toLowerCase();

            LinkedList<Character> charList = new LinkedList<>();

            // Add characters to LinkedList
            for (char ch : input.toCharArray()) {
                charList.add(ch);
            }

            boolean isPalindrome = true;

            // Compare characters from both ends
            while (charList.size() > 1) {
                char first = charList.removeFirst();
                char last = charList.removeLast();

                if (first != last) {
                    isPalindrome = false;
                    break;
                }
            }

            // Display result
            if (isPalindrome) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is NOT a palindrome.");
            }
            //This code is executed



            //goodbye
            scanner.close();
        }
}

