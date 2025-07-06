package ExceptionHandling;

public class ClassCastExceptionHandling {


    /*
    | Assignment / Cast                    | Is It Allowed? | Notes                                                   |
| ------------------------------------ | -------------- | ------------------------------------------------------- |
| `Object o = "abc"`                   | ✅ Yes          | `String` → `Object` (upcasting)                         |
| `String s = (String) o`              | ✅ Yes          | Downcasting back — **OK if original object was String** |
| `Object o = new Integer(100)`        | ✅ Yes          | Upcasting to Object                                     |
| `String s = (String) o`              | ❌ **No**       | `Integer` ≠ `String` — causes ClassCastException        |
| `List list = new ArrayList();`       | ✅ Yes          | Interface to implementation                             |
| `ArrayList list = (ArrayList) list;` | ✅ Yes          | Safe downcast                                           |
     */

    public static void main(String[] args) {
        Object obj = "Hello";      // String is a subclass of Object
        String str = (String) obj; // ✅ OK — because actual object is a String
        System.out.println(str);   // Output: Hello

        try {
            Object obj1 = new int[10];
            String str1 = (String) obj1; // ❌ Fails at runtime — ClassCastException

            System.out.println(obj1);}
        catch(java.lang.Exception ae){
            ae.printStackTrace();

        }
        System.out.println("Post exception handling ");


    }


}
