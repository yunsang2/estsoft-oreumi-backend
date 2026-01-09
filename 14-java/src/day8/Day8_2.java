package day8;

public class Day8_2 {
    public static void main(String[] args) {

        Box<String> box1 = new Box<>();

        box1.setData("Hello World!");

        System.out.println(box1);

        System.out.println();

        Box<Integer> box2 = new Box<>();

        //오토 박싱(auto - boxing)
        box2.setData(10);

        System.out.println(box2);

    }
}
