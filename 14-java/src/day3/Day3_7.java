package day3;
import java.util.Scanner;
public class Day3_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Enter two integers: ");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            if(n1 == 0 && n2 == 0) break;

            System.out.printf("%d + %d = %d%n", n1, n2, n1 + n2);
        }

        System.out.println();

        System.out.println("Good bye!");

        sc.close();






    }
}
