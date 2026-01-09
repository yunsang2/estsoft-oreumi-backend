package day3;
import  java.util.Scanner;
public class Day3_8 {
    public static void main(String[] args) {

        int num = 0;
        int sum = 0;

        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a positive integer: ");
            num = sc.nextInt();

            if (num == 0) {
                sc.close();
                break;
            }

            sum += num;


        }


        System.out.println("The sum is " + sum);


    }
}
