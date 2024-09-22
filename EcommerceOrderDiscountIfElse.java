import java.util.Scanner;

public class EcommerceOrderDiscountIfElse {

    // **Problem**: In an e-commerce system, if the user’s total purchase is above
    // $1000, they should receive a 10% discount. If the total is between $500 and
    // $1000, they receive a 5% discount. Otherwise, there is no discount. Write a
    // program to calculate the final amount the user has to pay after applying any
    // discount.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your total purchase amount: ");

        double purchaseAmount = sc.nextDouble();
        double discount = 0;

        if (purchaseAmount > 1000) {
            discount = 0.10;  // 10% discount for purchases above 1000
        } else if (purchaseAmount >= 500 && purchaseAmount <= 1000) {
            discount = 0.05;  // 5% discount for purchases between 500 and 1000
        }

        // Calculate final amount after applying discount
        double discountAmount = purchaseAmount * discount;
        double finalAmount = purchaseAmount - discountAmount;

        // Display the final amount and discount applied
        System.out.println("Discount applied: " + discountAmount);
        System.out.println("Final amount to pay: " + finalAmount);

        sc.close();  // Close the scanner
    }


}
