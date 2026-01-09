package day2;

import java.util.Scanner;

public class Day2_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String str =  sc.nextLine();

        sc.close();

        System.out.printf("str = \"%s\"", str);
    }
}
