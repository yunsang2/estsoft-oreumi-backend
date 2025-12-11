package day10;

import java.util.Scanner;

//블랙잭 5개중 3장의 카드로 합이 21을 넘지 않는 한도내에서 가장 큰수를 만들 정수를 고른다
//합이 될수 있는 가장 작은수는 6 가장 큰수는 21 입력받는 수는 1<= n <=21
//중복이 되면안되고..  123,124,125,134,135,145,234,235,245,345 10개
public class Day10_3 {
    public static void main(String[] args) {

        final int CARD = 5;

        int[] numbers = new int[CARD];
        int highest_score = 0;
        int n1 = 0, n2 = 0, n3 = 0;

        System.out.print("Enter five card numbers: ");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < CARD; i++) {
            numbers[i] = sc.nextInt();

            if (numbers[i] < 1 || numbers[i] > 12) {
                System.out.println("ERROR: number");
                i--;
            }
        }
        System.out.println();
        sc.close();

        for (int i = 0; i < CARD; i++) {
            for (int j = i + 1; j < CARD; j++) {
                for (int k = j + 1; k < CARD; k++) {

                    int sum1 = numbers[i];

                    if (sum1 <= 21 && sum1 >= highest_score) {
                        highest_score = sum1;
                        n1 = numbers[i];
                        n2 = 0;
                        n3 = 0;
                    }
                    int sum2 = numbers[i] + numbers[j];

                    if (sum2 <= 21 && sum2 >= highest_score) {
                        highest_score = sum2;
                        n1 = numbers[i];
                        n2 = numbers[j];
                        n3 = 0;
                    }
                    int sum3 = numbers[i] + numbers[j] + numbers[k];

                    if (sum3 <= 21 && sum3 >= highest_score) {
                        highest_score = sum3;
                        n1 = numbers[i];
                        n2 = numbers[j];
                        n3 = numbers[k];
                    }
                }
            }
        }
        System.out.print("Cards = ");
        if (n3 == 0 && n2 == 0) System.out.printf("%d\n", n1);
        else if (n3 == 0) System.out.printf("%d %d\n", n1, n2);
        else System.out.printf("%d %d %d\n", n1, n2, n3);

        System.out.println("Sum = " + highest_score);
    }
}
