package day2;
import java.util.Scanner;
public class Day2_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two positive integers: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        in.close();

        System.out.printf("Quotient = %d\n", n1 / n2);
        System.out.printf("Remainder = %d\n", n1 % n2);

    }
}
