import java.util.Scanner;

  public class Total_Even_Odd {
       public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);

        int sumEven = 0;
        int sumOdd  = 0;

        int a = 0;
        int number;
        while(a<7) {
            System.out.print("Enter " + (a+1) + ".number: ");
                number = input.nextInt();

            if (number % 2 == 0 )
                sumEven += number;

            else {
                    sumOdd += number;
                }
          a++;
        }
        System.out.println( "sum of even numbers :" + sumEven);
        System.out.println("sum of odd numbers :" + sumOdd);
    }
}
