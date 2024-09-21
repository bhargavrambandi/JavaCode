// A class representing a Car
class Car {
   // Instance variables
   String make;
   String model;
   int year;

   // Constructor to initialize instance variables
   public Car(String make, String model, int year) {
       this.make = make;  // Assigning the instance variable 'make'
       this.model = model; // Assigning the instance variable 'model'
       this.year = year;   // Assigning the instance variable 'year'
   }

   // Method to display car details
   public void displayDetails() {
       System.out.println("Make: " + make);
       System.out.println("Model: " + model);
       System.out.println("Year: " + year);
   }
}

public class InstanceVariableMain {
   public static void main(String[] args) {
       // Creating a Car object and setting its instance variables
       Car myCar = new Car("Toyota", "Corolla", 2020);

       // Calling the method to display car details
       myCar.displayDetails();
   }
}
