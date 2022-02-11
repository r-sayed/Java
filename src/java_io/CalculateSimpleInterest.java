import java.util.Scanner;

public class CalculateSimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principle: ");
        int principleAmount = input.nextInt();
        System.out.print("Enter the rate in %: ");
        float rateOfIntrest = input.nextFloat()/100;
        System.out.print("Enter the period in year: ");
        float timeInYear = input.nextFloat();
        double simpleIntrest = principleAmount * rateOfIntrest * timeInYear;
        System.out.println(simpleIntrest);
        input.close();
    }
}
