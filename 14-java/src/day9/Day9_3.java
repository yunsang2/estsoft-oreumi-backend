package day9;

import java.util.Scanner;

public class Day9_3 {
    public static void main(String[] args) {
        int n1, n2;

        System.out.print("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        System.out.println();

        sc.close();

        int max = Math.max(n1, n2);
        int min = Math.min(n1, n2);


        System.out.printf("The greatest common divisor of %d and %d = %d\n", max, min, getGcd(max, min));
        System.out.printf("The least common multiple of %d and %d = %d\n", max, min, getLcm(min, max));

    }
    /**
     * n1 과 n2 를 가지고 최대 공약수, 최소 공배수 구하기
     * @param 유클리드 알고리즘을 통해 n1, n2의 최대 공약수 구하기
     * @param 공약수를 통해 n1 ,n2의 최소 공배수 구하기
     * @return 최대 공약수
     * @returm 최소 공배수
     */

    static int getGcd(int a, int b) {
        return b == 0 ? a : getGcd(b, a % b);
    }

    static int getLcm(int a, int b) {
        return(a * b) / getGcd(a, b);
    }



}
