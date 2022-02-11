import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ammount in rupee : ");
        double amountInRupee = scanner.nextDouble();
        System.out.print("Your ammount in USD is " + (Double)amountInRupee/74.66);
        scanner.close();
    }
}
