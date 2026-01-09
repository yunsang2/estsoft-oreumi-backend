package day9;

import java.util.Scanner;

public class Day9_1 {
    public static void main(String[] args) {

        int num;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number than 1:");
        num = input.nextInt();

        input.close();

        System.out.printf("Factorial %d = %d\n", num, factorial(num));
    }
    /**
     * @param n 까지의 펙토리얼을 구하는
     * @return n 의 펙토리얼
     */

    public static long factorial(int n) {
        return n == 1 ? 1 : n * factorial(n - 1);
    }
}
