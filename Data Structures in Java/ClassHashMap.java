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

        HashMap<String, Integer> happy = new HashMap<String, Integer>();
        System.out.println();
        happy.put("a", 10);  // String, int
        happy.put("b", 3);
        happy.put("c", 88);

        System.out.println(happy); // {a=10, b=3, c=88}
        System.out.println(happy.get("c"));  // 88


        HashMap<String, String> fun = new HashMap<String, String>();

        fun.put("Elon Musk","Elon123456"); // String, String (username, password)
        fun.put("Cristiano Ronaldo", "Ronaldo1234");
        fun.put("Lional Messi", "Messi123");

        System.out.println(fun);

        fun.remove("Cristiano Ronaldo"); // remove the user

        System.out.println(fun);

        System.out.println(fun.containsValue("Messi123")); // checks is the collection has this value

        System.out.println(fun.containsKey("Messi123"));  // checks left

        System.out.println(fun.size());

        System.out.println(fun.replace("Elon Musk", "Elon1234567"));

        System.out.println(fun);

        fun.clear();
        System.out.println(fun);



     // HashMap don't have order during output




    }

}
