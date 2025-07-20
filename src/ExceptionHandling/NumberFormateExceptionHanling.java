package ExceptionHandling;

public class NumberFormateExceptionHanling {
    public static void main(String[] args) {
        String s="Hai";
        try {
            int parse=Integer.parseInt(s);
        } catch (java.lang.NumberFormatException e) {
e.printStackTrace();        }
        System.out.println("Post exception handling");
    }
}
