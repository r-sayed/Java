import java.util.Scanner;

public class CalculateFibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nthNumber = scanner.nextInt();
        int previousValue = 0;
        int currentValue = 1;
        for (int index = 0; currentValue < nthNumber; index++) {
            int tempPreviousValue = currentValue;
            currentValue = previousValue + currentValue;
            previousValue = tempPreviousValue;
            System.out.println(currentValue);
        }
        scanner.close();
    }
}
