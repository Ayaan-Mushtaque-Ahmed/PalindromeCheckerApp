public class UC4PalindromeCheckerApp {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a word: ");
            String input = sc.nextLine();

            char[] chars = input.toCharArray();
            boolean isPalindrome = true;

            int start = 0;
            int end = chars.length - 1;

            while (start < end) {
                if (chars[start] != chars[end]) {
                    isPalindrome = false;
                    break;
                }
                start++;
                end--;
            }

            if (isPalindrome) {
                System.out.println("It is a Palindrome");
            } else {
                System.out.println("It is NOT a Palindrome");
            }

            sc.close();
        }
    }

