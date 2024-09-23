import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class RoundingModesExample {
    public static void main(String[] args) {
        BigDecimal number = new BigDecimal("2.555");

        // Different rounding modes
        BigDecimal roundUp = number.setScale(2, RoundingMode.UP);// Always rounds up. Example: 2.1 becomes 3, and -2.1
                                                                 // becomes -2.
        BigDecimal roundDown = number.setScale(2, RoundingMode.DOWN);// Always rounds down. Example: 2.9 becomes 2, and
                                                                     // -2.9 becomes -2
        BigDecimal roundHalfUp = number.setScale(2, RoundingMode.HALF_UP);// Rounds up if halfway Example: 2.5 becomes
                                                                          // 3, and 2.4 becomes 2.
        BigDecimal roundHalfDown = number.setScale(2, RoundingMode.HALF_DOWN);// Rounds down if halfway.Example: 2.5
                                                                              // becomes 2, and 2.4 becomes 2.
        BigDecimal roundHalfEven = number.setScale(2, RoundingMode.HALF_EVEN);// Rounds to the nearest even number if
                                                                              // halfway. Example: 2.5 becomes 2, and
                                                                              // 2.6 becomes 3.
        BigDecimal roundedCeiling = number.setScale(2, RoundingMode.CEILING); // Rounds towards positive infinity.
                                                                              // Example: -2.55 becomes -2.55, and 2.55
                                                                              // becomes 2.56.
        BigDecimal roundedFloor = number.setScale(2, RoundingMode.FLOOR);// Rounds towards negative infinity. Example:
                                                                         // -2.55 becomes -3, and 2.55 becomes 2.55.

        System.out.println("Original Number: " + number);
        System.out.println("Rounded Up: " + roundUp);
        System.out.println("Rounded Down: " + roundDown);
        System.out.println("Rounded Half Up: " + roundHalfUp);
        System.out.println("Rounded Half Down: " + roundHalfDown);
        System.out.println("Rounded Half Even: " + roundHalfEven);
        System.out.println("Rounded Ceiling: " + roundedCeiling);
        System.out.println("Rounded Floor: " + roundedFloor);

        // Rounding using round with MathContext
        System.out.println("\nRounding using MathContext:");

        MathContext mcHalfEven = new MathContext(1, RoundingMode.HALF_EVEN);
        MathContext mcHalfUp = new MathContext(2, RoundingMode.HALF_UP);
        MathContext mcHalfDown = new MathContext(2, RoundingMode.HALF_DOWN);

        BigDecimal roundedWithHalfEven = number.round(mcHalfEven);
        BigDecimal roundedWithHalfUp = number.round(mcHalfUp);
        BigDecimal roundedWithHalfDown = number.round(mcHalfDown);

        System.out.println("Rounded with MathContext (HALF_EVEN): " + roundedWithHalfEven); // 3
        System.out.println("Rounded with MathContext (HALF_UP): " + roundedWithHalfUp); // 3
        System.out.println("Rounded with MathContext (HALF_DOWN): " + roundedWithHalfDown); // 2

    }
}
