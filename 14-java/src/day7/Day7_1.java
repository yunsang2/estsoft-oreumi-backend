package day7;

import java.util.Scanner;
public class Day7_1 {
    public static void main(String[] args) {

        int kor, eng, mat;

        double avg;

        Scanner sc = new Scanner(System.in);

        while(true){
            try {

                System.out.print("Enter Korean score: ");
                kor = sc.nextInt();

                System.out.print("Enter math score: ");
                mat = sc.nextInt();

                System.out.print("Enter English score: ");
                eng = sc.nextInt();
                System.out.println();

                if (kor < 0 || mat < 0 || eng < 0) {
                    throw new NegativeScoreException("Negative scores are not valid.");
                }

                if (kor > 100 || mat > 100 || eng > 100) {
                    throw new InvalidScoreException("Invalid scores are not valid.");
                }

                avg = (double) (kor + mat + eng) / 3;

                System.out.printf("Average: %.1f\n", avg);
                System.out.println();
                break;
            }

            catch (NegativeScoreException e) {
                System.out.println("ERROR: Negative scores are not valid.");
                System.out.println("Try again.");
                System.out.println();
            }

            catch (InvalidScoreException e) {
                System.out.println("ERROR: Invalid score.");
                System.out.println("Try again.");
                System.out.println();
            }

            catch (Exception e) {
                System.out.println("ERROR: Invalid input.");
                System.out.println("Try again.");
                System.out.println();
                sc.nextLine();
            }
        }

        sc.close();


    }
}
