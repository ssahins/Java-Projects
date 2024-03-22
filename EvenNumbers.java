import java.util.Scanner;
// check 3 of them are even or not
public class EvenNumbers {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int a = input.nextInt();
        System.out.print("Enter the second number :");
        int b = input.nextInt();
        System.out.print("Enter the third number :");
        int c = input.nextInt();

        if(a%2==0 || b%2==0 || c%2==0 ) {
            System.out.println("All of Numbers are Even numbers");
        }
       else {
            System.out.println("All or Some of numbers are not Even numbers");
        }




    }
}
