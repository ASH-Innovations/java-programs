package day9ProgramsPractice;

public class PalindromeNumber {
    public static void main(String args[]) {
        System.out.println("Execution starts from the main method by JVM");

        PalindromeNumber ref = new PalindromeNumber();
        int input = 121;
        int reversedNumber = ref.reverseNumber(input);

        if (reversedNumber == input) {
            System.out.println("The number " + input + " is a palindrome");
        } else {
            System.out.println("The number " + input + " is not a palindrome");
        }

        System.out.println("Execution ended");
    }

    public int reverseNumber(int org_number) {
        System.out.println("Original value of the number: " + org_number);
        int rev = 0;
        System.out.println("Initial value of reverse: " + rev);

        while (org_number != 0) {
            rev = rev * 10 + org_number % 10;
            org_number = org_number / 10;
        }

        return rev;
    }
}
