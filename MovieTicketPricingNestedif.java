import java.util.Scanner;

public class MovieTicketPricingNestedif {

    // Movie Ticket Pricing: Write a program to check if a user is eligible for a movie discount based on age. 
    // - If the user is less than 12, print "Child ticket."
    // - If the user is between 12 and 60, check if they are a student. If they are a student, apply a discount.
    // - If the user is 60 or above, print "Senior citizen discount."
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the user's age
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Check ticket pricing based on age
        if (age < 12) {
            System.out.println("Child ticket.");
        } else if (age >= 12 && age < 60) {
            // Nested if to check for student discount
            System.out.print("Are you a student? (yes/no): ");
            String isStudent = sc.next();

            if (isStudent.equalsIgnoreCase("yes")) {
                System.out.println("Student discount applied.");
            } else {
                System.out.println("Regular ticket.");
            }
        } else if (age >= 60) {
            System.out.println("Senior citizen discount.");
        }

        sc.close();
    }
}
