package day4;

public class Day4_10 {
    public static void main(String[] args) {

        final int MAX = 100;
        boolean[] isPrime = new boolean[MAX + 1];

        // 처음엔 모든 수를 소수(true)라고 가정
        for (int i = 2; i <= MAX; i++) {
            isPrime[i] = true;
        }

        // 에라토스테네스의 체
        for (int i = 2; i * i <= MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        System.out.println("Prime numbers between 2 and 100: ");

        // 출력
        for (int i = 2; i <= MAX; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
