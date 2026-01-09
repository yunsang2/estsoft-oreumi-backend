package day3;
import java.util.Scanner;
public class Day3_9 {
    public static void main(String[] args) {
        int num;
        int hours = 0;
        int minutes = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter minutes: ");
            num = sc.nextInt();

            if (num == 0) break;

            hours = num / 60;
            minutes = num % 60;

            System.out.printf("%d minutes = ", num);

            if (hours == 1)
                System.out.printf("%d hour ", hours);
            else if (hours > 1)
                System.out.printf("%d hours ", hours);

            if (minutes == 1)
                System.out.printf("%d minute", minutes);
            else if (minutes > 1)
                System.out.printf("%d minutes", minutes);

            System.out.println("\n");
        }

        sc.close();

        System.out.println("Good bye!");
    }
}
