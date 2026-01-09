package day2;
import java.util.Scanner;
public class Day2_3 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        System.out.println("Enter a radius of a circle as an integer: ");

        int radius = num.nextInt();

        num.close();

        double pi = 3.141592;

        double area = pi * radius * radius;

        double circumference = 2 * pi * radius;

        System.out.printf("pi = %f\n", pi);
        System.out.println("radius of the circle = " + radius);
        System.out.printf("area of the circle = %.3f\n", area);
        System.out.printf("circumference of the circle = %.3f\n", circumference);
    }
}
