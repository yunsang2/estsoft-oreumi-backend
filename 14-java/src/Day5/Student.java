package Day5;

class Student {

    private String name;
    private int kor;
    private int math;
    private int eng;

    double average;
    char grade;

    public Student(){}

    public Student(String name, int kor, int math, int eng) {
        this.name = name;
        if (kor >= 0)
            this.kor = kor;
        if (math >= 0)
            this.math = math;
        if (eng >= 0)
            this.eng = eng;

        setAverage();
        setGrade();
    }


    public String getName() {return name;}
    public int getKor() {return kor;}
    public int getMath() {return math;}
    public int getEng() {return eng;}
    public double getAverage() {return average;}
    public char getGrade() {return grade;}

    public void setName(String name) {this.name = name;}
    public void setKor(int kor) {this.kor = kor;}
    public void setMath(int math) {this.math = math;}
    public void setEng(int eng) {this.eng = eng;}


    private void setAverage() {
        this.average = (double)(kor + math + eng) / 3;
    }

    private void setGrade() {
        if (this.average >= 90) this.grade = 'A';
        else if (this.average < 90 && this.average >= 80) this.grade = 'B';
        else if (this.average < 80 && this.average >= 70) this.grade = 'C';
        else if (this.average < 70 && this.average >= 60) this.grade = 'D';
        else this.grade = 'F';
    }

    public void print(){
        System.out.println("Name: " + name);
        System.out.printf("Average: %.1f\n", average);
        System.out.println("Grade: " + grade);
    }





}
