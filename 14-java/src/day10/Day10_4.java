package day10;
import java.util.Arrays;


class Solution {
    public int[] solution(int[] arr, int divisor) {

        int count = 0;

        for (int x : arr) {
            if (x % divisor == 0) {
                count++;
            }
        }

        if (count == 0) {
            return new int[]{-1};
        }

        int[] answer = new int[count];
        int i = 0;
        for (int x : arr) {
            if (x % divisor == 0) {
                answer[i++] = x;
            }
        }

        Arrays.sort(answer);

        return answer;
    }
}