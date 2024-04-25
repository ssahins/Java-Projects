/*
Arraylist:
In Java, ArrayList is a part of the java.util package and is one of the most commonly used dynamic arrays.
It provides resizable arrays, which means the size of an ArrayList can be dynamically increased or decreased as per the requirement.
 ArrayList implements the List interface,
  which means it supports all the operations defined in the List interface such as
   adding elements, removing elements, retrieving elements by index, searching for elements, etc.


 add() -> adding new element
 remove() -> removing one element(and getting its value)
 empty() -> checking if the stack is empty
 peek() -> prints the first value
 set() -> update the list
 clear() -> clear all elements
 */

import java.util.ArrayList;

public class ClassArrayList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        // adding element
        list.add("Mateusz");
        list.add("David");
        list.add("Sahin");
        list.add("Alex");

        list.add(1, "Guiza");

        // removing element
        list.remove(2);
        list.remove("Sahin");

        // update
        list.set(2,"Carlos");

        // clear
        list.clear();

        // call
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
//        System.out.println(list.get(3));
//        System.out.println("-------------------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

//        System.out.println(list);









    }


}