/*
  HashMap: A hash map, is a data structure that helps with
  mapping keys to values for highly efficient operations like
  the lookup, insertion and deletion operations.

DIFFERENCE BETWEEN HASHMAP AND HASHSET

1) HashMap is an implementation of Map interface while
HashSet is an implementation of Set interface, which means
HashMap is a key value based data-structure and
HashSet guarantees uniqueness by not allowing duplicates.

2) Second difference between HashMap and HashSet is that ,
we use add() method to put elements into Set but we use
put() method to insert key and value into HashMap in Java.

3) HashSet allows only one null key, but
HashMap can allow one null key + multiple null values.
 */

/* .put() -> add element
   .clear() -> remove all elements
   .remove() -> remove on element
   .contains() -> checks your input is in collection of not(return boolean)
   .size() -> checks the length
   .replace() -> change current value with new one

 */
import java.util.HashMap;

public class ClassHashMap {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;
        int c = 88;

    // Store elements to easily accesible place(HashMap)

        HashMap<String, Integer> numbers = new HashMap<String, Integer>();
        System.out.println();
        numbers.put("a", 10);  // String, int
        numbers.put("b", 3);
        numbers.put("c", 88);

        System.out.println(numbers); // {a=10, b=3, c=88}
        System.out.println(numbers.get("c"));  // 88


        HashMap<String, String> user = new HashMap<String, String>();

        user.put("Elon Musk","Elon123456"); // String, String (username, password)
        user.put("Cristiano Ronaldo", "Ronaldo1234");
        user.put("Lional Messi", "Messi123");

        System.out.println(user);

        user.remove("Cristiano Ronaldo"); // remove the user

        System.out.println(user);

        System.out.println(user.containsValue("Messi123")); // checks is the collection has this value

        System.out.println(user.containsKey("Messi123"));  // checks left

        System.out.println(user.size());

        System.out.println(user.replace("Elon Musk", "Elon1234567"));

        System.out.println(user);

        user.clear();
        System.out.println(user);



     // HashMap don't have order during output




    }

}
