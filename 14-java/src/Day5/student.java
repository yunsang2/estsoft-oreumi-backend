package Day5;

class student {

    private String name;
    private int kor;
    private int math;
    private int eng;

    private double average;
    private char grade;

    public student(){}

    public student(String name, int kor, int math, int eng) {
        this.name = name;

        if (kor >= 0 && kor <= 100)
            this.kor = kor;
        if (math >= 0 && math <= 100)
            this.math = math;
        if (eng >= 0 && eng <= 100)
            this.eng = eng;

        average();
        grade();
    }


    public String getName() {
        return name;
    }
    public int getKor() {
        return kor;
    }
    public int getMath() {
        return math;
    }
    public int getEng() {
        return eng;
    }
    public double getAverage() {
        return average;
    }
    public char getGrade() {
        return grade;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setKor(int kor) {
        if (kor >= 0 && kor <= 100)
            this.kor = kor;
        average();
        grade();
    }
    public void setMath(int math) {
        if (math >= 0 && math <= 100)
            this.math = math;
        average();
        grade();
    }
    public void setEng(int eng) {
        if (eng >= 0 && eng <= 100)
            this.eng = eng;
        average();
        grade();
    }


    private void average() {
        this.average = (double)(kor + math + eng) / 3;
    }

    private void grade() {
        if (this.average >= 90) this.grade = 'A';
        else if (this.average >= 80) this.grade = 'B';
        else if (this.average >= 70) this.grade = 'C';
        else if (this.average >= 60) this.grade = 'D';
        else this.grade = 'F';
    }

    public void print(){
        System.out.println("Name: " + name);
        System.out.printf("Average: %.1f\n", average);
        System.out.println("Grade: " + grade);
    }





}
