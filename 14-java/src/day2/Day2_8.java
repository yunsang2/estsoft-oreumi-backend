package day2;

import java.util.Scanner;

public class Day2_8 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a character: ");
        char a = scan.nextLine().charAt(0);

        System.out.println();

        scan.close();

        switch (a){
            case 'a':
            case 'A':
                System.out.println("Apple");
                break;
            case 'b':
            case 'B':
                System.out.println("Banana");
                break;
            case 'c':
            case 'C':
                System.out.println("Cherry");
                break;
            default:
                System.out.println("Fruit");
                break;
        }

    }

}
