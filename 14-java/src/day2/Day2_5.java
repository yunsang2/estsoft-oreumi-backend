package day2;

import java.util.Scanner;

public class Day2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        System.out.println();

        if (number > 20 && number < 40) {
            System.out.println("Dream comes true!");
        }
        else {
            System.out.println("Dream comes false!");
        }
    }
}
