import java.util.Scanner;

public class FindArmstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter start number");
        int startNumber = input.nextInt();
        System.out.println("Enter end number");
        int endNumber = input.nextInt();
        for (int index = startNumber; index <= endNumber; index++) {
            int calculatedNumber = 0;
            int number = index;
            while (number > 0) {
                int digit = number % 10;
                number /= 10;
                calculatedNumber += digit * digit * digit;
            }
            if (calculatedNumber == index) {
                System.out.println(index + " is an armstrong");
            }
        }
        input.close();
    }
}
