package day6;

public class Day6_1_Sample {

    private int data;

    private static int numInstances = 0;

    private static final int MAX = 255;

    public Day6_1_Sample(int data) {
        this.data = Math.min(data, MAX);

        numInstances++;
    }

    public Day6_1_Sample() {this(0);}

    public void setData(int data) { this.data = Math.min(data, MAX); }

    public int getData() { return data; }
    public static int getNumInstances() { return numInstances; }

    public void print() {
        System.out.println("data = " + data);
    }
}
