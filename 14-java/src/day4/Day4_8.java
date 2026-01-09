package day4;
import java.util.Scanner;
public class Day4_8 {
    public static void main(String[] args) {

        int amount;
        int[] coinUnits = { 500, 100, 50, 10 };
        final int NUM_COINS = 10;
        int num = 0;


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount of coins: ");
        amount = sc.nextInt();
        System.out.println();

        sc.close();

        if (amount < 10 || amount > 6600 || amount % 10 != 0) {
            System.out.println("ERROR: Invalid amount.");

            return;
        }

        for (int unit : coinUnits) {
            num = amount / unit;

            if (num > 0) {
                num = Math.min(num, NUM_COINS);

                amount -= num * unit;

                System.out.printf("%3d won coins = %d%n", unit, num);

                if (amount == 0) break;
            }
        }

    }
}
