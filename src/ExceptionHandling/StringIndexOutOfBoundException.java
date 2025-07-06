package ExceptionHandling;

public class StringIndexOutOfBoundException {
    public static void stringIndexOutOfBoundException(String org_String){
        try {
            int lengthOfString= org_String.length();
            System.out.println("Total Length of String is: " + lengthOfString);
            for(int i=0;i<lengthOfString+2;i++){
                System.out.println(org_String.charAt(i));

            }
        } catch (Exception e) {
            e.printStackTrace();        }
        System.out.println("Post Exception Handling");



    }

    public static void main(String[] args) {
        stringIndexOutOfBoundException("Hey");


    }
}
