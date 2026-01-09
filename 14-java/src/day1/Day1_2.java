package day1;

public class Day1_2 {
    public static void main(String[] args) {
//      각기 다른 자료형을 가진 변수들을 한 문자열로 출력
        int value = 100;
        double factor = 0.98;
        char grade = 'A';

//      System.out.println("Value: " + value + ", Factor: " + factor + ", Grade: " + grade);
        System.out.printf("Value: %d, Factor: %.2f, Grade: %c\n", value, factor, grade);
    }
}
