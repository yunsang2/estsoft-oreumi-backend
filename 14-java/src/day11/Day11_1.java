package day11;

public class Day11_1 {
    public int[] solution(String s) {

        final int LEN = s.length();

        int[] answer = new int[LEN];

        for (int i = 0; i < LEN; i++) {

            answer[i] = -1;

            for (int j = i - 1; j >= 0; j--) {
//              이부분은 찾아 봤습니다
                if (s.charAt(i) == s.charAt(j)) {
                    answer[i] = i - j;
                    break;
                }
            }
        }

        return answer;
    }
}


