package day5;
import java.util.Scanner;
public class Day5_1 {

//    public static void printNumber(){
//        System.out.println("My favorite number is 3");
//    }
//
//    public static void main(String[] args) {
//
//        printNumber();
//    }
//------------------------------------------------------
    //매개변수를 이용한 메서드 호출
    public static void printNumber(int n){
        System.out.println("My favorite number is " + n);
    }


    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your favorite number: ");
        num = sc.nextInt();
        sc.close();
        System.out.println();

        printNumber(num);
    }


}
