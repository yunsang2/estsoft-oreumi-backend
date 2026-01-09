package day4;

public class Day4_6 {
    public static void main(String[] args) {

        int[] num = {1, 3, 4, 3, 1, 3, 4, 1, 2, 3, 1, 3};

        int[] count = new int[5];

        for (int n : num) {
            count[n]++;
        }

        for (int i = 1; i <= 4; i++) {

            System.out.print(i + ". ");

            /*
            for (int j = 0; j < count[i]; j++) {
                System.out.print("*");
            }

            System.out.println();
            */
            System.out.println("*".repeat(count[i]));

        }
    }
}
