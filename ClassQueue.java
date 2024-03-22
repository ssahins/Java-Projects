/* Queue:: In Java, a queue is a linear data structure that follows the First In, First Out (FIFO) principle,
meaning that the element added first will be the first one to be removed.

 add - adding new element
 poll - removing one element
 empty - checking if the stack is empty
 peek - prints the first value
 isEmpty - checking if the stack is empty

 */

import java.util.LinkedList;
import java.util.Queue;

public class ClassQueue {
    public static void main(String[] args) {


        Queue<String> games = new LinkedList<String>();

        games.add("Clash of Clans");
        games.add("PUBG");
        games.add("RISK");
        games.add("Krunker");
        games.add("FIFA23");

        System.out.println(games);

        games.poll(); // removes the first added element(first in first out)
       // games.poll();
        System.out.println(games);

        System.out.println(games.peek()); // display the first element that added first

        // check
        System.out.println(games.isEmpty()); // if empty returns true, if not returns false
        System.out.println(games.contains("P")); // if contains P returns true if not returns false





    }
}
