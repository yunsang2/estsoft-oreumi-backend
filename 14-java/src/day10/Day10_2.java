package day10;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Day10_2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the episode number to check: ");
        n = sc.nextInt();
        System.out.println();
        sc.close();

//      현재 시각을 ms 단위로 저장하는 변수
        long startTime = System.nanoTime();

        System.out.printf("The number included in the %dth episode title = %d\n",
                n, solution(n)
        );
        System.out.printf("runtime = %.3fms\n",
                (System.nanoTime() - startTime) / 1000000.0);

    }

    /**M번째 "종말의 숫자" 구하는 메서드
     * 
     * @param n 구하고자 하는 "종말의 숫자" 의 순서
     * @return N번째 "종말의 숫자" 반환
     */
    
    
    static int solution(int n){
        int count = 0;
        int num = 665;

        do {
            num++;
//          문자열로 변환 "666"이 포함되는지 검사
            if (Integer.toString(num).contains("666")) {
                count++;
            }
//          원하는 정수번째까지 도달하면 종료
        } while (count != n);

        return num;
    }

    static int solution2(int n){
        if(n <= 0) {
            throw new IllegalArgumentException("n should be greater than 0");
        }
        return IntStream.iterate(1, i -> i + 1)
                .filter(num -> Integer.toString(num).contains("666"))
                .skip(n - 1)
                .findFirst()
                .orElse(0);
    }


}
