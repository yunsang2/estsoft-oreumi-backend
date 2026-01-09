package day10;


import java.util.ArrayDeque;
import java.util.Deque;

public class Day10_5 {

    public class Solution {
        public int[] solution(int[] arr) {

            int[] temp = new int[arr.length];

            int count = 0;

            temp[count++] = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] != arr[i - 1]) {
                    temp[count++] = arr[i];
                }
            }

            int[] answer = new int[count];
            for (int i = 0; i < count; i++) {
                answer[i] = temp[i];
            }
            return answer;
        }
    }
    static int[] solution2(int[] arr) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(arr[0]);

        for (int item : arr) {
            if (!stack.getLast().equals(item)) {

            }
        }
    }

}

