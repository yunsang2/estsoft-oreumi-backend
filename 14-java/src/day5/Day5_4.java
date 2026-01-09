package day5;
import java.util.Scanner;
public class Day5_4 {

    public static double getAverage(int x, int y){
        return (double)(x+y)/2;
    }

    public static void main(String[] args) {
        int n1, n2;

        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a two numbers: ");
        n1=scan.nextInt();
        n2=scan.nextInt();

        System.out.println();
        scan.close();

        System.out.printf("The average of %d and %d = %.1f",
                n1, n2, getAverage(n1,n2));

    }
}
