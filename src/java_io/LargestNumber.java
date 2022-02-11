import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number : ");
        int secondNumber = scanner.nextInt();
        if (firstNumber > secondNumber) {
            System.out.println("first entered number is greated then second");
        } else if (firstNumber < secondNumber) {
            System.out.println("Second entered number is greated then first");
        } else {
            System.out.println("Both number are equle");
        }
        scanner.close();
    }
}
