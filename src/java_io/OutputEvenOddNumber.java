import java.util.Scanner;

public class OutputEvenOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputNumber = (int) input.nextDouble();
        if (inputNumber % 2 == 0) {
            System.out.print("Entered number is an even number");
        } else {
            System.out.print("Entered number is an odd number");
        }
        input.close();
    }
}
