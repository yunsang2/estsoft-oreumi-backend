package day9;

import java.util.Scanner;

public class Day9_2 {
    public static void main(String[] args) {
        int num;

        System.out.print("Enter a positive integer greater than 1: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println();

        sc.close();

        long[] cache = new long[num + 1];

        long result = fibonacci(num, cache);

        System.out.printf("%dth Fibonacci number = %d\n", num, result);
    }

    /**
     * @param n 구하고자 하는 피보나치의 수의 순서
     * @param cache 이전에 구한 피보나치 수 저장할 배열
     * @return n번째 피보나치 수
     */

    public static long fibonacci(int n, long[] cache) {

        if (n <= 1) return n;
        if (cache[n] != 0) return cache[n];

        cache[n] = fibonacci(n - 1, cache) + fibonacci(n - 2, cache);

        return cache[n];
    }
}
