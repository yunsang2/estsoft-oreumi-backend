package day2;
import java.util.Scanner;
public class Day2_Ex1 {
    public static void main(String[] args) {

        int hourlyWage;
        int hours;
        int todayWage;

        Scanner scan = new Scanner(System.in);

        hourlyWage = scan.nextInt();

        System.out.print("Enter the hourly Wage: ");
        hours = scan.nextInt();
        System.out.println();

        scan.close();

        if (hours > 8)
           todayWage = hourlyWage * 8 + (int)(hourlyWage * 1.5 * (hours - 8));
        else
           todayWage = hourlyWage * hours;

        System.out.printf("Today's wage is %d won.\n", todayWage);
    }
}
