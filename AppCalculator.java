import java.util.Scanner;

public class AppCalculator {

    public static int subtraction(int a, int b) {

        return(a - b);
    }
    public static int substraction(int a, int b, int c) {
        return(a - b - c);
    }
    public static double division(double a, double b) {
        return(double)(a / b);
    }

    public static int addition(int a, int b) {
        return(a + b);

    }
    public static int addition(int a, int b, int c) {
        return(a + b + c);

    }
    public static int multiplication(int a, int b) {
        return(a * b);
    }
    public static int multiplication(int a, int b, int c) {
        return(a * b * c);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String process = "press 1 for Addition\n"
                        + "press 2 for Substraction\n"
                        + "press 3 for Multiplication\n"
                        + "press 4 for Division\n"
                        + "press q for quit";
        System.out.println("-------------------------------------------------------------");
        System.out.println(process);
        System.out.println("-------------------------------------------------------------");

        while(true) {
            System.out.print("Enter your Choice :");
            String yourChoice = input.nextLine();

            if (yourChoice.equals("q")) {
                System.out.println("Exiting from programme...");
                break;
            }
            else if (yourChoice.equals("1")) {
                System.out.println("How many value will you calculate? (2 or 3)");
                int valueAdd = input.nextInt();

                if (valueAdd == 2) {
                    System.out.print("a:");
                    int a = input.nextInt();
                    System.out.print("b:");
                    int b = input.nextInt();
                    input.nextLine();
                    System.out.println("The sum of the numbers :" + addition(a, b));

                } else if ( valueAdd == 3) {
                    System.out.print("a:");
                    int a = input.nextInt();
                    System.out.print("b:");
                    int b = input.nextInt();
                    System.out.print("c:");
                    int c = input.nextInt();
                    input.nextLine();

                    System.out.println("The sum of the  numbers :" + addition(a, b, c));

                }else {
                    System.out.println("There is no method to Calculate the Parameter");
                }
            } else if(yourChoice.equals("2")) {
                System.out.println("How many value will you substract? (2 or 3)");
                int kacsayi = input.nextInt();
                if (kacsayi == 2) {
                    System.out.print("a:");
                    int a = input.nextInt();
                    System.out.print("b:");
                    int b = input.nextInt();
                    input.nextLine();
                    System.out.println("The Substraction of the entered  numbers:" + subtraction(a, b));
                } else if(kacsayi == 3) {
                    System.out.print("a:");
                    int a = input.nextInt();
                    System.out.print("b:");
                    int b = input.nextInt();
                    System.out.print("c:");
                    int c = input.nextInt();
                    input.nextLine();

                    System.out.println("The Substraction of the entered  numbers:" + substraction(a, b, c));

                }else {
                    System.out.println("There is no method to Calculate the Parameter");
                }

                
            } else if(yourChoice.equals("3"))  {
                System.out.println("How many value will you multiple by? (2 or 3)");
                int kacsayi = input.nextInt();

                if (kacsayi == 2) {
                    System.out.print("a:");
                    int a = input.nextInt();
                    System.out.print("b:");
                    int b = input.nextInt();
                    input.nextLine();
                    System.out.println("The product of the entered numbers:" + multiplication(a, b));

                } else if ( kacsayi== 3) {
                    System.out.print("a:");
                    int a = input.nextInt();
                    System.out.print("b:");
                    int b = input.nextInt();
                    System.out.print("c:");
                    int c = input.nextInt();
                    input.nextLine();

                    System.out.println("The product of the entered numbers :" + multiplication(a, b, c));

                }else {
                    System.out.println("There is no method to Calculate the Parameter");
                }
            }
            else if (yourChoice.equals("4")) {
                System.out.print("a:");
                double a = input.nextDouble();
                System.out.print("b:");
                double b = input.nextDouble();
                input.nextLine();
                System.out.println("The quotients of the entered numbers:"  + division(a, b));
            }
            else {
                System.out.println("Make sure you have entered the correct value");
            }

        }


    }
}
