package day2;

import java.util.Scanner;

public class Day2_9 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter two integers: ");

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println();

        sc.close();

        System.out.printf("n1 = %d, n2 = %d\n", n1, n2);

        int n3 = n1;
        n1 = n2;
        n2 = n3;

        System.out.printf("n1 = %d, n2 = %d\n", n1, n2);
    }
}
