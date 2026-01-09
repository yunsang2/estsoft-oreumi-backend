package day2;
import java.util.Scanner;
public class Day2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");

        int n1 = sc.nextInt();
        System.out.println();

        sc.close();

        for (int i = n1; i > 0; i--) {
            System.out.printf("%d",n1);
        }

    }
}
