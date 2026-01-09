package day6;

public class Day6_1 {
    public static void main(String[] args) {
        Day6_1_Sample num =  new Day6_1_Sample(3);
        Day6_1_Sample num2 =  new Day6_1_Sample(5);

        System.out.println("num = " + num.getData());
        System.out.println("num2 = " + num2.getData());

        /*
        System.out.println("num.numInstances = " + num.getNumInstances());
        System.out.println("num2.numInstances = " + num2.getNumInstances());
        */

        System.out.println("num2 = "+ Day6_1_Sample.getNumInstances());

    }
}
