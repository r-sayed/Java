import java.util.Scanner;

public class FindPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String contentToCheck = scanner.next().toLowerCase();
        int lengthOfString = contentToCheck.length();
        int iterationToLoop = lengthOfString / 2;
        boolean isPalindrome = true;
        for (int index = 0; index < iterationToLoop; index++) {
            Character firstCharToCheck = contentToCheck.charAt(index);
            Character lastCharToCheck = contentToCheck.charAt(lengthOfString - (index + 1));
            if (firstCharToCheck.compareTo(lastCharToCheck) == 0) {
                continue;
            } else {
                System.out.println("This is not a Palindrome");
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("This is a Palindrome");
        }
        scanner.close();
    }
}
