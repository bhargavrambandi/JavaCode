public class Operators {

    public static void main(String[] args) {

        int x = 2;
        int y = 4;
        int a = 20;
        int b = 10;
        int c = 30;
        // unary postfix
        System.out.println("Unary operators");

        int result1, result2;

        // original value
        System.out.println("Value of a: " + a);

        // increment operator
        result1 = ++a;
        System.out.println("After increment: " + result1);

        System.out.println("Value of b: " + b);

        // decrement operator
        result2 = --b;
        System.out.println("After decrement: " + result2);
        boolean booleanc = true;
        boolean booleand = false;
        System.out.println(~x);// -11 (minus of total positive value which starts from 0)
        System.out.println(~y);// 9 (positive of total minus, positive starts from 0)
        System.out.println("booleanc " + !booleanc);// false (opposite of boolean value)
        System.out.println("booleand " + !booleand);// true

        // Arithmetic
        System.out.println("Arithmetic operators");
        // addition operator
        System.out.println("a + b = " + (a + b));

        // subtraction operator
        System.out.println("a - b = " + (a - b));

        // multiplication operator
        System.out.println("a * b = " + (a * b));

        // division operator
        System.out.println("a / b = " + (a / b));

        // modulo operator
        System.out.println("a % b = " + (a % b));
        // Java Arithmetic Operator Example: Expression
        System.out.println("expression " + (10 * 10 / 5 + 3 - 1 * 4 / 2));

        // Shift Operator
        // Java left shift operator << is used to shift all of the bits in a value to
        // the left side of a specified number of times.
        System.out.println("Shift operators");
        System.out.println("Signed Left Shift << " + (10 << 2));// 10*2^2=10*4=40
        System.out.println("Signed Left Shift << " + (20 << 2));// 20*2^2=20*4=80
        System.out.println("Signed Left Shift << " + (15 << 4));// 15*2^4=15*16=240
        // Java right shift operator >> is used to move the value of the left operand to
        // right by the number of bits specified by the right operand.
        System.out.println("Signed Right Shift >> " + (10 >> 2));// 10/2^2=10/4=2
        System.out.println("Signed Right Shift >> " + (20 >> 2));// 20/2^2=20/4=5
        System.out.println("Signed Right Shift >> " + (20 >> 3));// 20/2^3=20/8=2
        // Shift Operator Example: >> vs >>>
        // For positive number, >> and >>> works same
        System.out.println(">> " + (20 >> 2));
        System.out.println("Unsigned Right Shift >>> " + (20 >>> 2));
        // For negative number, >>> changes parity bit (MSB) to 0
        System.out.println(-20 >> 2);
        System.out.println("Unsigned Right Shift >>> " + (-20 >>> 2));

        // Logical
        System.out.println("Logical operators");
        System.out.println(a < b && a < c);// false && true = false
        System.out.println(a < b && a++ < c);// false && true = false
        System.out.println(a > b || a < c);// true || true = true
        System.out.println(a > b || a++ < c);// true || true = true

        // && operator
        System.out.println((5 > 3) && (8 > 5)); // true
        System.out.println((5 > 3) && (8 < 5)); // false

        // || operator
        System.out.println((5 < 3) || (8 > 5)); // true
        System.out.println((5 < 3) || (8 < 5)); // false

        // ! operator
        System.out.println(!(5 == 3)); // true
        System.out.println(!(5 > 3)); // false

        // Bitwise
        System.out.println("Bitwise operators");
        System.out.println(a < b & a < c);// false & true = false
        System.out.println(a > b | a < c);// true | true = true
        System.out.println(a > b | a++ < c);// true | true = true

        // Ternary synatx : variable = Expression ? expression1 : expression2
        System.out.println("Ternary operators");
        int min = (a < b) ? a : b;
        System.out.println(min);

        // Assignment
        System.out.println("Assignment operators");
        a += 4;// a=a+4 (a=10+4)
        b -= 4;// b=b-4 (b=20-4)
        System.out.println(a);
        System.out.println(b);

        a += 3;// 10+3
        System.out.println(a);
        a -= 4;// 13-4
        System.out.println(a);
        a *= 2;// 9*2
        System.out.println(a);
        a /= 2;// 18/2
        System.out.println(a);
        int var;

        // assign value using =
        var = a;
        System.out.println("var using =: " + var);

        // assign value using =+
        var += a;
        System.out.println("var using +=: " + var);

        // assign value using =*
        var *= a;
        System.out.println("var using *=: " + var);

        // Relational
        System.out.println("Relational operators");
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        // instanceof operator checks whether an object is an instanceof a particular class
        System.out.println("instanceof operator");
        String str = "Programiz";
        boolean result;
        // checks if str is an instance of
        // the String class
        result = str instanceof String;
        System.out.println("Is str an object of String? " + result);

    }
}
