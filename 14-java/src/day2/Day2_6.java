package day2;
import java.util.Scanner;
public class Day2_6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integers: ");

        int a = scan.nextInt();
        int b = scan.nextInt();

        scan.close();

        int _max = Math.max(a, b);

        int _min = Math.min(a, b);

        System.out.println("max - min: " + (_max - _min));

//        if (a > b) {
//            System.out.printf("max - min = %d\n", a - b);
//        }
//        else {
//            System.out.printf("max - min = %d\n", b - a);
//        }



    }
}
