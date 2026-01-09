package day4;
import java.util.Scanner;
public class Day4_4 {
    public static void main(String[] args) {

        final int LENGTH = 10;

        int[] numbers = new int[LENGTH];

        int sum = 0;
        int max = 0;

        Scanner sc=new Scanner(System.in);

        for (int i = 0; i < LENGTH; i++) {
            numbers[i]=sc.nextInt();
        }

        sc.close();

        for (int j : numbers) {
            sum += j;
            max = Math.max(j, max);
        }

        double avg = (double) sum / LENGTH;

        System.out.printf("sum = %d\n",sum);
        System.out.printf("avg = %.1f\n",avg);
        System.out.printf("max = %d\n",max);
    }
}
