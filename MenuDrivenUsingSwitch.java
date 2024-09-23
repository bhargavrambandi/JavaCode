import java.util.Scanner;

public class MenuDrivenUsingSwitch {

    // Create a menu-driven program for a simple restaurant
    // where users can select different items based on a number input (e.g., 1 for
    // Burger, 2 for Pizza, 3 for Salad). Display the selected item and its price.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String item;
        int price;
        int totalCost = 0;

        System.out.println("Welcome to the Restaurant!");

        while (true) {
            System.out.println("Please select an item from the menu:");
            System.out.println("1. Paneer Butter Masala - ₹300");
            System.out.println("2. Biryani - ₹400");
            System.out.println("3. Butter Chicken - ₹350");
            System.out.println("4. Masala Dosa - ₹50");
            System.out.println("5. Egg Biryani - ₹250");
            System.out.println("6. Veg Biryani - ₹150");
            System.out.println("7. Exit");

            System.out.print("Enter the number of your choice: ");
            int choice = sc.nextInt();

            // Determine the selected item and price using switch
            switch (choice) {
                case 1:
                    item = "Paneer Butter Masala";
                    price = 300;
                    break;
                case 2:
                    item = "Biryani";
                    price = 400;
                    break;
                case 3:
                    item = "Butter Chicken";
                    price = 350;
                    break;
                case 4:
                    item = "Masala Dosa";
                    price = 150;
                    break;
                case 5:
                    item = "Egg Biryani";
                    price = 250;
                    break;
                case 6:
                    item = "Veg Biryani";
                    price = 150;
                    break;
                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    System.out.printf("Total cost of your order: ₹%d%n", totalCost);
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice. Please select a valid item.");
                    continue; // Ask for input again
            }

            // Add the price to the total cost
            totalCost += price;
            System.out.printf("You have selected: %s - ₹%d%n", item, price);
        }
    }
}
