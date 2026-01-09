package day4;
import java.util.Scanner;
public class Day4_1 {
    public static void main(String[] args) {

        int n1, n2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two positive integers: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        sc.close();

        int min = Math.min(n1, n2);
        int gcf = 1;

        for(int i = min; i >= 1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcf = i;
                break;
            }
        }



        System.out.printf("The greatest common factor of %d and %d = %d%n ", n1, n2, gcf);


    }
}
