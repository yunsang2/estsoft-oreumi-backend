package day8;

import java.util.Arrays;
import java.util.Random;

public class Day8_1 {
    public static void main(String[] args) {

        final int LENGTH = 6;
        final int MAX = 45;

        int[] num = new int[LENGTH];

        Random rand = new Random();

        int count = 0;


        while (count < LENGTH) {

            int n = rand.nextInt(MAX) + 1;

            boolean duplicate = false;

            for (int i = 0; i < count; i++) {
                if (num[i] == n) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                num[count] = n;
                count++;
            }
        }


        Arrays.sort(num);

        System.out.print("Numbers: ");

        for (int n : num) {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.println("Numbers: "
                + Arrays.toString(num)
                .replaceAll("[\\[\\],]",""));
    }
}

