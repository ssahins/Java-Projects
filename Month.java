import java.util.Scanner;

public class Month {
    public static void main(String[] args) {

        Scanner Calc = new Scanner(System.in);
        System.out.print("Enter the number of month (1-12) :");
        int month = Calc.nextInt();

        if (month >12 || month<1) {
            System.out.println("Enter a valid number");
        }

        System.out.print("Enter a number of day (1-31) :");
         int day = Calc.nextInt();
        if (day>31 || day<1){
            System.out.println("Enter a valid number");
        }

        int totaldays = day;

        switch(month) {
            case 12:
                totaldays += 30;
            case 11:
                totaldays += 31;
            case 10:
                totaldays += 30;
            case 9:
                totaldays += 31;
            case 8:
                totaldays += 31;
            case 7:
                totaldays += 30;
            case 6:
                totaldays += 31;
            case 5:
                totaldays += 30;
            case 4:
                totaldays += 31;
            case 3:
                totaldays += 28;
            case 2:
                totaldays += 31;

        }
        System.out.print(" The number of days that have elapsed since the beginning of this year = " + totaldays +" days");
    }
}