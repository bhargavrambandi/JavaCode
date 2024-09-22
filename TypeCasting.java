public class TypeCasting {

    public static void main(String[] args) {

        // Widening Type Casting
        // coverts lower data type to higher datatype(byte -> short -> char -> int ->
        // long -> float -> double )

        int a = 10;
        // automatically converts the integer type into long type
        long l = a;
        // automatically converts the long type into float type
        float f = a;
        // automatically converts the long type into double type
        double d = a;
        System.out.println("Widening type casting");
        System.out.println("Before conversion, int value " + a);
        System.out.println("After conversion, long value " + l);
        System.out.println("After conversion, float value " + f);
        System.out.println("After conversion, double value " + d);

        // narrowing type casting
        // converts the higher to lower data type(double -> float -> long -> int -> char
        // -> short -> byte)

        System.out.println("narrowing type casting");
        double dd = 23426.66;
        // converting double data type into long data type
        long ll = (long) dd;
        // converting long data type into int data type
        int i = (int) ll;

        System.out.println("Before conversion: " + dd);
        // fractional part lost
        System.out.println("After conversion into long type: " + ll);
        // fractional part lost
        System.out.println("After conversion into int type: " + i);

    }

}
