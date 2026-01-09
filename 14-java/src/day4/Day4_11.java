package day4;

public class Day4_11 {
    public static void main(String[] args) {

        int[][] num = {
                {1,  2,  3,  4},
                {5,  6,  7,  8},
                {9, 10, 11, 12}
        };
        /*
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                System.out.printf("%2d ", num[i][j]);
            }
            System.out.println();
        }
        */
        for (int[] ints : num) {
            for (int anInt : ints) {
                System.out.printf("%2d ", anInt);
            }
            System.out.println();
        }
    }
}
