import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number : ");
        int secondNumber = input.nextInt();
        System.out.print("Enter the operation to perform, '+'-> Add, '-' -> Sub, '*' -> Mul and '/' -> Div : ");
        String operator = input.next();
        int result =0;
        switch (operator) {
        case "+":
        result = firstNumber + secondNumber;
        break;
        case "-":
        result = firstNumber - secondNumber;
        break;
        case "/":
        result = firstNumber / secondNumber;
        break;
        case "*":
        result = firstNumber * secondNumber;
        break;
        default:
        break;
        }
        System.out.println(result);
        input.close();
    }
}
