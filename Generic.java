/*
 -> In Java, generic methods are methods that are parameterized to accept arguments of any type.
They are declared by specifying one or more type parameters in angle brackets ("< >") before the return type of the method declaration.

 -> Generic methods in Java offer the benefits -> reusability, type safety, abstraction, and performance.
 -> They are commonly used in Java programming to write flexible and reusable code that operates on various types.
 */

public class Generic {
    public static void main(String[] args) {

         String name = "Alex";
         int num = 12;

        discharge(name);  // compiled output: null
        discharge(num);   // compiled output: null

        System.out.println(discharge2(num));  // call return type generic method
    }


    public static <T> void discharge(T data) {    // GENERIC METHOD(void type)

        data = null;
        System.out.println(data);
    }

    public static <T> T discharge2(T data) {    // GENERIC METHOD(return type)
        data = null;
        return data;

    }

    

}
