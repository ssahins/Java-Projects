// List class VS Set class (HashSet and LinkedHashSet)

// Set classes -> You cannot output the same element more than one by using HashSet(Set Class)
// Set Classes -> Output the elements in order

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashClass {
    public static void main(String[] args) {


        Set<String> fruit = new HashSet<String>();

        fruit.add("Apple");
        fruit.add("Watermalen");
        fruit.add("Bannana");
        fruit.add("Apple");
        fruit.add("Apple");

       // fruit.clear();


        for (String fruits : fruit) {
            System.out.println(fruits);
        }
        System.out.println();
        ;

        LinkedHashSet<String> animal = new LinkedHashSet<String>();

        animal.add("Cat");
        animal.add("Dog");
        animal.add("Leon");
        animal.add("Tiger");
        animal.add("Tiger");
        System.out.println(animal);




    }



}
