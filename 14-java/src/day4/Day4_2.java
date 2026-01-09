package day4;
import java.util.Scanner;
public class Day4_2 {
    public static void main(String[] args) {

        int n1, n2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two positive integers: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        sc.close();

        int a = Math.max(n1, n2);
        int b = Math.min(n1, n2);

        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        int gcd = a;

        System.out.printf("The greatest common factor of %d and %d = %d%n ", n1, n2, gcd);
    }
}
