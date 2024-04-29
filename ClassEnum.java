/*
In Java, an enum (short for "enumeration") is a special data type used to define a set of constants.
It's often used to represent a fixed number of possible values for a variable.

You can use enums in Java to make your code more readable and less error-prone,
especially when dealing with a fixed set of values. Enums can also have methods and fields just like regular classes.
For instance, you can add a method to get the abbreviation of a day

Enums are powerful constructs in Java, providing a clean and type-safe way to represent fixed sets of constants.

You cannot create an instance of an enum using the new keyword like you would with a regular class. Instead,
you work with the predefined constants of the enum.
 */

enum DaysOfTheWeek {
    MONDAY(60, 10000),
    TUESDAY(100, 35000),
    WEDNESDAY(90, 30000),
    THURSDAY(80, 15000),
    FRIDAY(85, 50000),
    SATURDAY(95, 45000),
    SUNDAY(50, 25000);


   final int dayOfWeek;         // final keyword prevent to change the value
   final double profit;        // assume that hava a company


    DaysOfTheWeek(int dayOfWeek, double profit) { // constructor
        this.dayOfWeek = dayOfWeek;
        this.profit = profit;
    }

}

public class ClassEnum {
    public static void main(String[] args) {

   DaysOfTheWeek day = DaysOfTheWeek.THURSDAY;

   if (day == DaysOfTheWeek.THURSDAY) {
       System.out.println("it is almost friday");
   }

   for (DaysOfTheWeek myDay : DaysOfTheWeek.values()){
       System.out.println(myDay); // prints all value
   }
        System.out.println();

        System.out.println(DaysOfTheWeek.THURSDAY.dayOfWeek);
        System.out.println(DaysOfTheWeek.FRIDAY.dayOfWeek);
        System.out.println(DaysOfTheWeek.FRIDAY.profit);

    }
}
