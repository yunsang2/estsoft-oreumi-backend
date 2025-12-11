package day10;


public class Day10_5 {

    public class Solution {
        public int[] solution(int[] arr) {

            int[] temp = new int[arr.length];

            int count = 0;


            for (int i = 1; i < arr.length; i++) {
                if (arr[i] != arr[i - 1]) {
                    temp[(count+1)] = arr[i];
                }
            }


            int[] answer = new int[count];
            for (int i = 0; i < count; i++) {
                answer[i] = temp[i];
            }

            return answer;
        }
    }

}

