package ExceptionHandling;

public class ArrayIndexOutOfBoundException {
   static int arr[]={12,12,34,56};
    public static void arrayIndexOutOfBoundException(){
        try {
            int  arrayLength=arr.length;
            System.out.println("Length of an array is: " + arrayLength);
            for(int i=0;i<arrayLength+1;i++){
                System.out.println(arr[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Post exception");

    }


    public static void main(String[] args) {
        arrayIndexOutOfBoundException();

    }
}
