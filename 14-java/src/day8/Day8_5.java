package day8;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Day8_5 {
    public static void main(String[] args) {

//      순차적으로 저장하기 위해 TreeMap 사용
        Map<Integer, Student> students = new TreeMap<>(Collections.reverseOrder());

//      id , 학생정보(id , name)를 따로 입력
        students.put(20255108, new Student(20255108, "James"));
        students.put(20255114, new Student(20255114, "Michael"));
        students.put(20255103, new Student(20255103, "Hans"));

//      id(Key) 를 사용해 원하는 정보를 출력
        for (Integer id : students.keySet()) {
            Student s = students.get(id);
            System.out.println("ID: " + id + ", Name: " + s.getName());
        }
    }
}

