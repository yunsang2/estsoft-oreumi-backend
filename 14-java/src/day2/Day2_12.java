package day2;
import java.util.Scanner;
public class Day2_12 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a positive integer: ");

        int n=scan.nextInt();
        System.out.println();

        scan.close();


        long fac = 1;

        for(int i = 1; i <= n; i++)
            fac *= i;

        System.out.printf("Factorial %d = %d\n", n, fac);
    }
}
