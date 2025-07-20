package ExceptionHandling;

public class ArithmeticException {

    public static void division(int a, int b) {
        try {
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (java.lang.ArithmeticException ae) {
            System.out.println(" Cannot divide by zero: " + ae.getMessage());
        }
    }

    public static void main(String[] args) {
        division(10, 0);  // Will trigger ArithmeticException
        division(20, 5);  // Will print: Result: 4
    }
}
