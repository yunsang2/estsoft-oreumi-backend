package day6;

import day5.Student;

public class Day6_2 {
    public static void main(String[] args) {
        Student[] list = new Student[3];


        list[0] = new Student("Cheolsu Kim", 88, 76, 64);
        list[1] = new Student("Yeonghee Pack", 92, 88, 94);
        list[2] = new Student("Gildong Hong", 96, 64, 48);


        for (Student student : list) {
            student.print();
        }

    }
}
