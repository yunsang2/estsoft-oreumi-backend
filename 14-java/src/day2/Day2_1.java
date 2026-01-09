package day2;
import java.util.Scanner;

public class Day2_1 {
    public static void main(String[] args) {

       Scanner in = new Scanner(System.in);

       System.out.print("Please enter a number: ");

       int num = in.nextInt();

       in.close();

        System.out.println("num = " + num);
//        -----------------------------
        System.out.print("Enter two integers: ");

        int a = in.nextInt();
        int b = in.nextInt();

        in.close();

        System.out.printf("a = %d, b = %d\n", a, b);

//        -----------------------------



    }
}
