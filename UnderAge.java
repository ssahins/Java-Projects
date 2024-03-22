import java.util.Scanner;

public class UnderAge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birthday:");
        int age = scanner.nextInt();

        int result = 2024 - age;

        if (result < 18) {
            System.out.println("you are underage");
        } else  {
            System.out.println("You are above 18 You can create an Account");
            System.out.println("Your age is " + result);
        }
    }
}
