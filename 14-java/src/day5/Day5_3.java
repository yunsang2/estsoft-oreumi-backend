package day5;
import java.util.Scanner;
public class Day5_3 {

    public static double getAreaCircle(int radius){
        return (double) Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        int num;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of a circle: ");
        num=sc.nextInt();

        System.out.println();

        sc.close();

        System.out.printf("Area of a circle with radius %d is: %.3f%n",
                num, getAreaCircle(num));

    }


}
