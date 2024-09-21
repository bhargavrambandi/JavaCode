public class TypesOfVariables {

    static int staticVar = 10;// static

    void method1() {

        // local variable(A variable declared inside the body of the method is called local variable.
        // this variable only within that method and the other methods in the class aren't even aware that the variable exists.
        // A local variable cannot be defined with "static" keyword.
        int localVar = 10;

    }

    public static void main(String[] args) {
        // A variable that is declared as static is called a static variable. It cannot be local.
        // You can create a single copy of the static variable and share it among all the instances of the class.
        // Memory allocation for static variables happens only once when the class is loaded in the memory.
        int instanceVar = 50;// instanceVar
    }
}
