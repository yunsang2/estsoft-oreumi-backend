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

        List<Integer> list = new ArrayList<>();
        // 0번째가 1번째 숫자
        int count = 0;

        while (list.size() < n) {

            for (int i = 0;i >= 0; i++) {

                String Str;

                if (i == 0) Str = "666";
                else if (i % 5 != 0){
                    // 문자열 조합으로 숫자 생성
                    Str = i + "666";
                }
                else {
                    Str = count + "666" + i;
                }

                int number = Integer.parseInt(Str);
                list.add(number);

                if (list.size() >= n) break;
            }
            count++;
        }

        Collections.sort(list);
        // 0번째 부터 시작해 -1 을 해줘야 함
        return list.get(n - 1);
    }



}
