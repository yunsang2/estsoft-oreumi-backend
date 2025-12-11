package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Day10_1 {
    public static void main(String[] args){
//        1 = 666 2 = 1666 3 = 2666... 6 = 6660 7 = 6661
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the episode number to check: ");
        num = sc.nextInt();
        System.out.println();
        sc.close();

        System.out.printf("The number included in the 6th episode title = %d\n",
            getNthNumber(num)
        );


    }

    /**
     * 666 이 들어간 숫자를 내림차순으로 사용자가 입력한 정수 num 갯수의 정수를 출력
     * @param n = 0 이면 666 1번째
     * @param 숫자들 배열에 저장후 재배치
     * @param 문자를 숫자로 변형해 저장
     * @param num 번째 까지 도달하면 정지
     * @return 그 전에 있던 숫자들 포함한 배열 중 num번째 숫자를 반환
     */

    public static int getNthNumber(int n) {

        // 0번째가 1번째 숫자
        int count = 0;
        final String strBase = "666";
        String str = "666";
        int i = 0, j = 0;

        do {
//          변수 i의 1의 자리 숫자가 6이 아니면, 변수 i를 "666" 앞에 붙인다
            if (i % 10 != 6) {
                count++;
            } else {
//              변수i가 6이면, 뒤에 j 를 붙이고 count 가 n 보다 작으면 빠져나온다
                for (j = 0; j <10 && count < n; j++) {
                    str = (i / 10) + strBase + j;
                    count++;
                }
            }

            i++;

        } while (count != n);

        // 0번째 부터 시작해 -1 을 해줘야 함
            return Integer.parseInt(str);
    }



}
