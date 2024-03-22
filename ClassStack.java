/*
Stacks :: In Java, a stack is a data structure that follows the Last In, First Out (LIFO) principle,
meaning that the most recently added element is the first one to be removed.

 push - adding new element
 pop - removing one element(and getting its value)
 empty - checking if the stack is empty
 peek - prints the first value
 */

import java.util.Stack;

public class ClassStack {
    public static void main(String[] args) {


        Stack<String> games = new Stack<String>();

        games.push("Clash of Clans");
        games.push("PUBG");
        games.push("RISK");
        games.push("Krunker");
        games.push("FIFA23");

        System.out.println(games);

        games.pop(); // removes the last added element(last in first out)
        games.pop();
        System.out.println(games);

        System.out.println(games.peek()); // display the first element that added last

        // check
        System.out.println(games.empty()); // if empty returns true, if not returns false
        System.out.println(games.contains("P")); // if contains P returns true if not returns false





    }
}
