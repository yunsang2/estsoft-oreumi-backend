package day3;
import java.util.Scanner;
public class Day3_5 {
    public static void main(String[] args) {
        int rows;
        int cols;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        rows=sc.nextInt();

        System.out.println("Enter the number of columns: ");
        cols=sc.nextInt();

        System.out.println();

        sc.close();

//        int num = 1;
//
//        for(int i=1; i <= rows; i++){
//            for (int j=1;j<=cols;j++){
//                System.out.printf("%3d",num++);
//            }
//            System.out.println();
//
//        }

        for(int i=1; i <= rows; i++){
            for (int j=1;j<=cols;j++){
                System.out.printf("%3d", j + cols * (i - 1));
            }
            System.out.println();

        }

    }
}
