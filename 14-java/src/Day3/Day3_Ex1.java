package Day3;
import  java.util.Scanner;
public class Day3_Ex1 {
    public static void main(String[] args) {

        int weight;
        int bags = 0;
        int max3kg;
        int remain;


        Scanner in = new Scanner(System.in);


        System.out.print("Enter the weight of sugar to delivered: ");
        weight = in.nextInt();
        System.out.println();

        in.close();


        max3kg = weight / 3;


        for (int i = 0; i <= max3kg; i++) {

            remain = weight - i * 3;

            if (remain % 5 == 0) {
                bags = i + remain / 5;
                break;
            }
        }

        if (bags > 0) {
            System.out.printf("Cheolsu will need to bring %d bags.\n", bags);
        } else {
            System.out.printf("Cheolsu cannot take %d kg of sugar.\n", weight);
        }
    }
}
