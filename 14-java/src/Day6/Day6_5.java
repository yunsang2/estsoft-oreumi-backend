package day6;

public class Day6_5 {
    public static void main(String[] args) {
        Teacher harry = new Teacher("Harry Potter", 37, Gender.MALE, 371, "Defence of the Dark");
        Student rose = new Student("Rose Granger-Weasley",11,Gender.FEMALE,7128,2,4.2);


        harry.print();
        rose.print();

        System.out.println("-------------------------------------------");


        Person[] list = new Person[2];

        list[0] = harry;
        list[1] = rose;

        for(Person p : list){
            p.print();
        }
    }
}
