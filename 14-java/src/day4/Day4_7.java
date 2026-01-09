package day4;
import java.util.Scanner;
public class Day4_7 {
    public static void main(String[] args) {

        final int LENGTH = 10;

        int[] numbers = new int[LENGTH];

        int[] numbers2 = new int[LENGTH];


        for (int i = 0; i < LENGTH; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a positive integer: ");
            numbers[i] = sc.nextInt();

            sc.close();
        }

        for (int j = 0; j < LENGTH; j++) {
            numbers2[j] = numbers[j] % 19;
        }



        int count = 0;

        for (int i = 0; i < LENGTH; i++) {
            boolean isNew = true;

            for (int j = 0; j < i; j++) {
                if (numbers2[i] == numbers2[j]) {
                    isNew = false;
                    break;
                }
            }

            if (isNew) count++;
        }

        System.out.println("서로 다른 나머지 값의 개수: " + count);

    }
}
