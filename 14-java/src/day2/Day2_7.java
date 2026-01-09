package day2;
import java.util.Scanner;
public class Day2_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integers: ");

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        scan.close();

        if (n2 % n1 == 0)
            System.out.printf("%d is a multiple of %d", n1, n2);
        else if (n1 % n2 == 0)
            System.out.printf("%d is a factor of %d", n1, n2);
        else
            System.out.printf("%d is neither a factor of %d nor a multiple.", n1, n2);
    }
}




