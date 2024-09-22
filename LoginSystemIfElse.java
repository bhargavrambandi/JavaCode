import java.util.Scanner;

public class LoginSystemIfElse {

    public static void main(String[] args) {

        // **Problem**: Create a program that asks the user to input a username and
        // password. If the credentials are correct (hard-coded values), print "Access
        // Granted"; otherwise, print "Access Denied". Allow up to 3 attempts before
        // locking the user out. Use a `while` loop for attempts and `if-else` for
        // authentication checks.
        // - **Control Statements**: `if-else`, `while`

        // Hard-coded credentials
        String correctUsername = "admin";
        String correctPassword = "password123";

        // Number of allowed attempts
        int maxAttempts = 3;
        int attempts = 0;

        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Loop for user attempts
        while (attempts < maxAttempts) {
            System.out.print("Enter your username: ");
            String username = scanner.nextLine();

            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            // Check if credentials are correct
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Access Granted");
                break;
            } else {
                attempts++;
                System.out.println("Access Denied. Attempts left: " + (maxAttempts - attempts));
            }

            // If max attempts reached
            if (attempts == maxAttempts) {
                System.out.println("Too many failed attempts. User locked out.");
            }
        }

        scanner.close();
    }

}
