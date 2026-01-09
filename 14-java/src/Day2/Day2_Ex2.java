package day2;
import java.util.Scanner;
public class Day2_Ex2 {
    public static void main(String[] args) {

        int num;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        num = scan.nextInt();
        scan.close();



        for (int i = 1; i <= num; i *= 10) {
            System.out.printf("%d's digit = %d\n", i, num / i % 10);
        }
    }
}
