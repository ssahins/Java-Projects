import java.util.Scanner;
public class Faktorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number :");
        int value = input.nextInt();
        int faktorial = 1;

        for(int i = 1; i<=value; i++) {

            faktorial = faktorial * i;
        }
        System.out.print("Faktorial of number " + value + " :" + faktorial);

    }
}
