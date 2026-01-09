package day4;

public class Day4_12 {
    public static void main(String[] args) {

        int[][] scores = {
                {87, 43, 64, 71},
                {65, 69, 77, 82},
                {91, 84, 62, 76}
        };

        String[] suffix = {"st", "nd", "rd"};

        for (int i = 0; i < scores.length; i++) {
            int row = i + 1;
            String sfx = suffix[i];

            int sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }

            double avg = (double) sum / scores[i].length;

            System.out.printf("%d%s row: sum = %d, average = %.2f\n",
                    row, sfx, sum, avg);
        }
    }
}
