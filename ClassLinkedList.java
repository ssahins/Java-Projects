/*
LinkedList::
In Java, LinkedList is a part of the java.util package and represents a doubly-linked list implementation.
 Unlike arrays, which provide indexed access to elements, a linked list allows sequential access to elements.
 Each element in a linked list is stored in a node that contains a reference to the next node in the sequence,
  as well as a reference to the previous node (for doubly-linked lists).
  This makes insertion and deletion operations more efficient compared to arrays.

 add or push - adding new element
 pop - removing one element
 isEmpty - checking if the stack is empty
 peek - prints the first value
 clear - removing all elements
 contains - checking the element is on list or not

 */

import java.util.LinkedList;

public class ClassLinkedList {
    public static void main(String[] args) {

        LinkedList <Integer> list = new LinkedList<Integer>();


        list.add(12);
        list.add(74);
        list.add(45);
        list.add(98);
        //list.push(10);

        list.pop();
        System.out.println(list);

        list.clear();
        System.out.println(list.isEmpty()); // if empty returns true, if not returns false
        System.out.println(list.peek()); // prints the first value
        System.out.println(list.contains("A")); //if contains P returns true if not returns false







    }
}
