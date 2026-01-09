package day4;
import java.util.Scanner;

public class Day4_Ex2 {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            System.out.print("Enter an integer: ");
//            int num = sc.nextInt();
//
//            if (num == 0) {
//                System.out.println("Good bye!");
//                break;
//            }
//
//            if (num < 1 || num > 1048575) {
//                System.out.println("Input must be between 1 and 1,048,575.");
//                System.out.println();
//                continue;
//            }
//
//            int temp = num;
//            String binary = "";
//
//            while (temp > 0) {
//                int remainder = temp % 2;
//                binary = remainder + binary;
//                temp = temp / 2;
//            }
//
//            System.out.printf("Binary number for decimal %d = %s\n", num, binary);
//            System.out.println();


            // 변수 선언
            int num;

            // Scanner 클래스의 인스턴스 생성
            Scanner in = new Scanner(System.in);

            // 무한 반복으로 사용자가 0을 입력할 때까지 반복문을 수행
            while (true) {
                // 사용자 입력
                System.out.print("Enter a positive integer: ");
                num = in.nextInt();

                // 사용자가 0을 입력하면 반복문을 종료
                if (num == 0) break;

                // 래퍼 클래스인 Integer 클래스의 toBinaryString 메서드로
                // int 자료형 값을 2진수 형태의 문자열로 변환해서 출력
                System.out.printf("Binary number for decimal %d = %s\n\n",
                        num, Integer.toBinaryString(num));
            }

            // 종료 메시지 출력
            System.out.println("Good bye!");

            // 입력 스트림(input stream) 닫기
            in.close();
            }
        }


