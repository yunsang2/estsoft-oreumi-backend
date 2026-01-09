package day5;
import java.util.Scanner;
public class Day5_2 {
    public static void printDivisors(int n){

        System.out.printf("Divisors of %d = ", n);

        for  (int i = 1; i <= n; i++){
            if(n%i==0){
                System.out.printf("%d ",i);
            }
        }
    }

    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        System.out.println();

        sc.close();

        printDivisors(num);
    }
}
