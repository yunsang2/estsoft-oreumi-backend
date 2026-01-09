package day8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Day8_3 {
    public static void main(String[] args) {
//      ArrayList<String> list = new ArrayList<>();
        List<String> list = new LinkedList<>();

        list.add("Milk");
        list.add("Bread");
        list.add("Cheese");
        list.add("Chicken");
        list.add("Pizza");
        System.out.println(list);

        // 새로운 요소 추가
        list.add(1, "Pepper");
        System.out.println(list);

        // 요소 교체
        list.set(2, "Apple");
        System.out.println(list);

        //요소 삭제
        list.remove(1);
        System.out.println(list);

        //삭제한 요소를 참조
        String removed = list.remove(1);
        System.out.println(removed);
        System.out.println();

        //클래스의 인스턴스의 크기 확인 size
        //클래스의 인스턴스에 지정된 인덱스위치에 있는 요소를 참조
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println();

        for(String s: list){
            System.out.println(s);
        }



    }
}
