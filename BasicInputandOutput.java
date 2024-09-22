import java.util.Scanner;

public class BasicInputandOutput {

    public static void main(String[] args) {

        // output
        System.out.print("1. print ");
        System.out.print("2. print");

        System.out.println("1. println ");
        System.out.println("2. println ");

        // input
        Scanner input = new Scanner(System.in);

        // Getting float input
        System.out.print("Enter float: ");
        float myFloat = input.nextFloat();
        System.out.println("Float entered = " + myFloat);

        // Getting double input
        System.out.print("Enter double: ");
        double myDouble = input.nextDouble();
        System.out.println("Double entered = " + myDouble);

        // Getting String input
        System.out.print("Enter text: ");
        String myString = input.next();
        System.out.println("Text entered = " + myString);

        input.close();

    }

}
