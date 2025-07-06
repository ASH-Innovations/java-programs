package ExceptionHandling;

public class IllegaArgumentExceptionHandling {
    public static void main(String[] args) {
        try {
            Thread t = new Thread();
            t.setPriority(100); // ❌ Priority must be 1 to 10
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Post Exception handling");

    }
}
