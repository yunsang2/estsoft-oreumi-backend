package day5;

public class Person {

    private String name;
    private int age;

    public Person(){}

    public Person(String str, int n) {
        name = str;
        age = n;
    }


    public void setName(String str) {name = str;}
    public void setAge(int n) {
//        if (n >= 0)
//            age = n;
        age = Math.max(n, 0);
    }


    public String getName() {return name;}
    public int getAge() {return age;}


    public void print(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }


}
