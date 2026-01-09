package day6;

public class Teacher  extends Person {
    private int id;
    private String subject;

    public Teacher(String name, int age, Gender gender, int id, String subject) {
        super(name,age,gender);
        setId(id);
        this.subject = subject;
    }

public Teacher() {this(null,0,Gender.UNDISCLOSED,0,"");}

    public void setId(int id) {this.id = id;}
    public void setSubject(String subject) {this.subject = subject;}

    public int getId() {return id;}
    public String getSubject() {return subject;}

    public void print() {
        super.print();

        System.out.println("ID: " + id);
        System.out.println("Subject: " + subject);
        System.out.println();
    }

}
