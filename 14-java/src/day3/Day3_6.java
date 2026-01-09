package day3;
import java.util.Scanner;
public class Day3_6 {
    public static void main(String[] args) {
        int rows;
        int cols;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        rows = sc.nextInt();

        System.out.println("Enter the number of columns: ");
        cols = sc.nextInt();

        sc.close();

//        for (int i = 1; i <= rows; i++) {
//            for (int j = 0; j <= cols - 1; j++) {
//                System.out.printf("%3d", i + (rows * j));
//            }
//            System.out.println();
//
//        }

        int num = 0;
        for (int i = 1; i <= rows; i++) {
            num = i;
            for (int j = 1; j <= cols; j++, num += rows) {
                System.out.printf("%3d", num);
            }
            System.out.println();
        }
    }
}
