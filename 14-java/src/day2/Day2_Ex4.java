package day2;
import java.util.Scanner;
public class Day2_Ex4 {
    public static void main(String[] args) {

        long n1 = 0;
        long n2 = 1;
        long n3 = 0;

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();


        for (int i = 2; i <= n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }

        System.out.println(n3);
    }
}
