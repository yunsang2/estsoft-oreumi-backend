package day10;

import java.util.Scanner;

//블랙잭 5개중 3장의 카드로 합이 21을 넘지 않는 한도내에서 가장 큰수를 만들 정수를 고른다
//합이 될수 있는 가장 작은수는 6 가장 큰수는 21 입력받는 수는 1<= n <=21
//중복이 되면안되고..  123,124,125,134,135,145,234,235,245,345 10개
public class Day10_3 {
    public static void main(String[] args) {

        final int CARD = 5;

        int sum = 0;
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

                    sum = numbers[i] + numbers[j] + numbers[k];

                    if (sum <= 21 && sum >= highest_score){
                        highest_score = sum;
                        n1 = numbers[i];
                        n2 = numbers[j];
                        n3 = numbers[k];
                    }
                }
            }
        }

        System.out.printf("Cards = %d, %d, %d\n",n1,n2,n3);
        System.out.println("Sum = " + highest_score);
    }
}
