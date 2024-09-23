import java.util.Scanner;

public class TaxCalculationifElseIf {

    public static void main(String[] args) {
        // Write a program to calculate the tax based on income:
        // - If income is above 100,000, apply 30% tax.
        // - If income is between 50,000 and 100,000, apply 20% tax.
        // - If income is between 20,000 and 50,000, apply 10% tax.
        // - If income is below 20,000, no tax is applied.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the income amount:");

        double amount = sc.nextDouble();  // Get the income input from the user
        double taxRate;
        double tax;
        double netIncome;

        // Calculate the tax rate based on the income
        if (amount > 100000) {
            taxRate = 0.30;
        } else if (amount >= 50000 && amount <= 100000) {
            taxRate = 0.20;
        } else if (amount >= 20000 && amount < 50000) {
            taxRate = 0.10;
        } else {
            taxRate = 0.0;
        }

        // Calculate the total tax
        tax = amount * taxRate;
        netIncome  = amount-tax;

        // Print the tax details
        System.out.println("Income: " + amount);
        System.out.println("Tax Rate: " + (taxRate * 100) + "%");
        System.out.println("Total Tax: " + tax);
        System.out.println("NetIncome " + netIncome);

        sc.close();
    }
}
