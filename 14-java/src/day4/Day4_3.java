package day4;

public class Day4_3 {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9,10};
        for (int i : num) {
            System.out.printf("num[%d] = %d\n",i-1,i);
        }

//---------------------------------------------------------
        for (int j=0;j<num.length;j++) {
            System.out.printf("num[%d] = %d\n",j,num[j]);
        }
    }
}
