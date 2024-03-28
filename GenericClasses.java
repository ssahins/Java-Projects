/*
 A Generic class simply means that the items or functions in that class
 can be generalized with the parameter(example T)
 to specify that we can add any type as a parameter
 in place of T like Integer, Character, String, Double or any other user-defined type.
 */


/*
Advantages of Java Generics
1-) Type-Safety: One can hold only a single type of objects in generics.

2-) Type Casting Is Not Required: There is no need to typecast.

3-) Compile-Time Checking: It checks all the errors of datatype related to generics
at the time of compile-time so the issue will not occurat the time of runtime.
 */


// single type parameter
class Solution<T> {

   private T data;

   public Solution(T data){
       this.data = data;
   }

    public T getData() {
        return data;
    }

}


// multiple type parameter
class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
}

public class GenericClasses {
    public static void main(String[] args) {

        Solution <Integer> solution_1 = new Solution(10);
        Solution <Double> solution_2 = new Solution(190.99);
       // Solution <String> solution_3 = new Solution<>(19);   // will not compile(String type)

        System.out.println(solution_1.getData());
        System.out.println(solution_2.getData());

    }
}
