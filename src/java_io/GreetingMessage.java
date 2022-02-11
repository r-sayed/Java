import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String nameOfPerson = input.nextLine();
        System.out.println("Welcome " + nameOfPerson + " to the world of programing");
        input.close();
    }
}
