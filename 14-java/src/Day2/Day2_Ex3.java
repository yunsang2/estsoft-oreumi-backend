package day2;
public class Day2_Ex3 {
    public static void main(String[] args) {

        final int PRINCIPAL = 50000;
        final  double CS = 0.05;
        final  double YH = 0.03;

        int cs_balance = PRINCIPAL;
        int yh_balance = PRINCIPAL;
        int year = 0;

        do {
            year++;

            cs_balance += (int)(PRINCIPAL * CS);
            yh_balance += (int)(yh_balance * YH);

        }while (yh_balance <= cs_balance);

        System.out.printf("after %d years, cs = %d, yh = %d\n", year, cs_balance, yh_balance);

    }
}
