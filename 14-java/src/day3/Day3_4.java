package day3;

public class Day3_4 {
    public static void main(String[] args) {
        int num = 10;

        for (int i = 1; i <= num; i++) {

//            for (int s = 1; s <= num - i; s++)
//                System.out.print(" ");
//
//            for (int j = 1; j <= 2 * i - 1; j++)
//                System.out.print("*");
//
//            System.out.println();

            int spaces = num - i;
            int stars = i * 2 - 1;

            System.out.println(" ".repeat(spaces) + "*".repeat(stars));

        }
    }
}
