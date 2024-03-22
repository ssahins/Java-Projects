import java.util.Scanner;
/*
   A recursion function is a programming technique where
   a function calls itself in order to solve a problem.
   This allows problems to be solved by breaking them down into smaller, similar sub-problems
 */

public class Recursion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("*** This Calculation will gives you sum of numbers from 1 to input number ***\n");

        System.out.print("Enter a positive number:");

        int result = scanner.nextInt();

        int total = sum(result);

        System.out.println(total);

    }
    public static int sum(int number) {

        if (number > 1) {

           return number + sum(number - 1);
        } else if (number == 1) {
            return 1;
        } else {
            return 0;
        }

        }
}
