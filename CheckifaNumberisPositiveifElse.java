
import java.util.Scanner;

public class CheckifaNumberisPositiveifElse {

    public static void main(String[] args) {
        // Write a program that checks if a number entered by the user is positive. If
        // so, print "The number is positive."

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        if (number > 0) {
            System.out.println("number is positive");
        } else {
            System.out.println("The number is not positive.");
        }

        // Close the scanner
        scanner.close();

    }

}
