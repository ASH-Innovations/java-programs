package ExceptionHandling;

public class NullPointerException {
    public static void main(String[] args) {
        try {
            String s=null;
            System.out.println(s.length());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("post exception handling");
    }
}
