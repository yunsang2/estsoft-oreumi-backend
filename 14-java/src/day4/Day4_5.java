package day4;
import java.util.Scanner;
public class Day4_5 {
    public static void main(String[] args) {

    final int LENGTH = 30;

    int[] numbers = new int[LENGTH];

    int sum = 0;
    double avg;
    int count = 0;
    int above = 0;

    Scanner sc = new Scanner(System.in);

//    for (int i = 0; i < LENGTH; i++) {
//
//        System.out.println("Enter an integer: ");
//        numbers[i] = sc.nextInt();
//        if (numbers[i] == 0) break;
//
//        count++;
//        sum += numbers[i];
//    }


    for (; count < LENGTH; count++) {

        System.out.println("Enter an integer: ");
        numbers[count] = sc.nextInt();
        if (numbers[count] == 0) break;

        sum += numbers[count];
    }

    sc.close();

    avg = (double)sum / count;

    for (int i = 0; i < count; i++) {
        if (avg < numbers[i]) above++;
    }

    double percentage = 0;
    if (count > 0) {
        percentage = (double) above / count * 100;
    }

    System.out.printf("average = %.1f\n",avg);
    System.out.printf("percentage of integers above the average = %.1f%%\n",percentage);
    }
}
