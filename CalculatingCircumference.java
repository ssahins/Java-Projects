import java.util.Scanner;

public class CalculatingCircumference {
    public static void main(String[] args){


  Scanner input = new Scanner(System.in);

        System.out.print("Enter radius value :");

     double r = input.nextDouble();
     final int pi = 3;

     double circumference = 2 * pi * r;
     double area = pi * r * r;

        System.out.println("The Circumference of the circle :" + circumference);
        System.out.println("The Area of the circle :" + area);

    }
}