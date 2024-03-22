import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {

        Scanner first = new Scanner(System.in);

        System.out.print("Enter your username :");
        String user = first.nextLine();

        System.out.print("Password :");
        String pass = first.nextLine();

            if(user.equals("Admin") && pass.equals("123456"))

            System.out.println("The entry is successful Welcome to your Account");

             else {
            System.out.println("The entry is not successful your username or password may be wrong try again");
               }

       }
          }
