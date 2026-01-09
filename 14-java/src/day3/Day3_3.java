package day3;
import java.util.Scanner;
public class Day3_3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int num=scan.nextInt();
        scan.close();



        for (int i = 1; i <= num; i++) {
            for (int s = 1; s <= num - i; s++)
                System.out.print(" ");

            for (int j = 1; j <= i; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}
