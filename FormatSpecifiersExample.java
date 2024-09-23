public class FormatSpecifiersExample {

    // %s: String
    // %d: Integer
    // %f: Floating-point number
    // %.2f: Floating-point number with 2 decimal places
    // %c: Character
    // %b: Boolean
    // %X: Hexadecimal (uppercase)
    // %%%: Percentage
    // %,d: Comma-separated integer
    // %.2E: Scientific notation with 2 decimal places
    // %f: Default floating-point number

    public static void main(String[] args) {
        // Variables
        String name = "Bhargav";
        int age = 25;
        double height = 5.7;
        char initial = 'B';
        boolean isStudent = true;
        long distance = 123456789L;
        float weight = 70.5f;
        byte byteValue = 127;

        // String format specifier
        System.out.printf("Name: %s%n", name); // %s for String

        // Integer format specifiers
        System.out.printf("Age: %d years old%n", age); // %d for integer

        // Floating-point format specifiers
        System.out.printf("Height: %.2f feet%n", height); // %.2f for 2 decimal places

        // Character format specifier
        System.out.printf("Initial: %c%n", initial); // %c for character

        // Boolean format specifier
        System.out.printf("Is Student: %b%n", isStudent); // %b for boolean

        // Hexadecimal format specifier
        int hexValue = 255;
        System.out.printf("Hexadecimal: %X%n", hexValue); // %X for hexadecimal (uppercase)

        // Percentage format specifier
        double percentage = 0.85;
        System.out.printf("Success Rate: %.2f%%%n", percentage * 100); // %%% for percentage

        // Comma format specifier for large numbers
        int largeNumber = 1000000;
        System.out.printf("Large Number: %,d%n", largeNumber); // %,d for adding commas

        // Scientific notation format specifier
        double sciNumber = 123456789.123456;
        System.out.printf("Scientific Notation: %.2E%n", sciNumber); // %.2E for scientific notation

        System.out.printf("Distance: %,d meters%n", distance); // Long with comma separator
        System.out.printf("Weight: %.1f kg%n", weight);      // Float with one decimal
        System.out.printf("Byte Value: %d%n", byteValue);    // Byte (integer format)

        // Default formatting
        double defaultNumber = 12345.6789;
        System.out.printf("Default: %f%n", defaultNumber); // %f for default floating-point
    }

}
